package com.ermao.dm.controller;

import com.ermao.dm.dao.ColumnsRepository;
import jakarta.inject.Inject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ermao
 * Date: 2023/3/9 0:14
 */
@RestController
public class SchemaController {

    private final ColumnsRepository columnsRepository;

    @Inject
    public SchemaController(ColumnsRepository columnsRepository) {
        this.columnsRepository = columnsRepository;
    }


    @GetMapping("schemas")
    public String listSchemas(@RequestParam(required = false, name = "schemaName") String schemaName) {
        return columnsRepository.listSchemaNames().toString();
    }
}
