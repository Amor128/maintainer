package com.ermao.dm.controller;


import com.ermao.dm.dao.entity.Columns;
import com.ermao.dm.dao.entity.Fruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.*;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author Ermao
 * Date: 2023/3/5 1:32
 */
@RestController
public class TestController {

    @Autowired
    @Qualifier("schemaJdbcTemplate")
    JdbcTemplate schemaJdbcTemplate;

    @Autowired
    @Qualifier("dataJdbcTemplate")
    JdbcTemplate dataJdbcTemplate;


    @GetMapping("data")
    public String data() {
        return dataJdbcTemplate.query("select * from fruit", new BeanPropertyRowMapper<>(Fruit.class)).toString();
    }
    
}
