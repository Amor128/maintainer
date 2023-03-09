package com.ermao.dm.dao.entity;

import lombok.Data;

import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * @author Ermao
 * Date: 2023/3/8 22:34
 */
@Data
public class Schema {
    @Id
    private Long id;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private Boolean deleted;
    private String schemaName;
    private String schemaComment;
}
