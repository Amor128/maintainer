package com.ermao.dm.controller;

import com.ermao.dm.dao.ColumnsRepository;
import com.ermao.dm.dao.SchemaRepository;
import com.ermao.dm.dao.entity.Columns;
import com.ermao.dm.dao.entity.Schema;
import jakarta.inject.Inject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Ermao
 * Date: 2023/3/9 0:39
 */
@RestController
public class InitController {

    private final ColumnsRepository columnsRepository;

    private final SchemaRepository schemaRepository;


    @Inject
    public InitController(ColumnsRepository columnsRepository, SchemaRepository schemaRepository) {
        this.columnsRepository = columnsRepository;
        this.schemaRepository = schemaRepository;
    }


    @RequestMapping("init")
    public String init(String schemaName) {
        // TODO 初始化 schema 库、table 库、column 库
        List<Columns> columns = columnsRepository.listColumns(schemaName);
        Schema schema = new Schema();
    }
}
