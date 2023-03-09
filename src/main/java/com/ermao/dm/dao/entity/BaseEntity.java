package com.ermao.dm.dao.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author Ermao
 * Date: 2023/3/8 23:54
 */
@Data
public class BaseEntity {
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
