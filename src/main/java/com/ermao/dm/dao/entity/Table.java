package com.ermao.dm.dao.entity;

import java.time.LocalDateTime;

/**
 * @author Ermao
 * Date: 2023/3/8 22:36
 */
public class Table {
    private Long id;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private Boolean deleted;
    private String tableName;
    private Long schemaId;
}
