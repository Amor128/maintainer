package com.ermao.dm.dao;

import com.ermao.dm.dao.entity.Columns;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Ermao
 * Date: 2023/3/9 0:16
 */
@Repository
public class ColumnsRepository {

    @Autowired
    public ColumnsRepository(@Qualifier("schemaJdbcTemplate") JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private final JdbcTemplate jdbcTemplate;


    public List<Columns> listColumns(String schemaName) {
        String sql = String.format("select * from columns where TABLE_SCHEMA = '%s'", schemaName);
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Columns.class));
    }

    public List<String> listSchemaNames() {
        String sql = "select distinct(TABLE_SCHEMA) from columns where TABLE_SCHEMA != 'information_schema'";
        return jdbcTemplate.queryForList(sql, String.class);
    }
}
