package com.ermao.dm.dao.entity;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Columns {
    private String tableCatalog;

    private String tableSchema;

    private String tableName;

    private String columnName;

    private Integer ordinalPosition;

    private String columnDefault;

    private String isNullable;

    private String dataType;

    private Long characterMaximumLength;

    private Long characterOctetLength;

    private Long numericPrecision;

    private Long numericScale;

    private Integer datetimePrecision;

    private String characterSetName;

    private String collationName;

    private String columnType;

    private Object columnKey;

    private String extra;

    private String privileges;

    private String columnComment;

    private String generationExpression;

    private Integer srsId;

    @Override
    public String toString() {
        return "Columns{" +
                "tableCatalog='" + tableCatalog + '\'' +
                ", tableSchema='" + tableSchema + '\'' +
                ", tableName='" + tableName + '\'' +
                ", columnName='" + columnName + '\'' +
                ", ordinalPosition=" + ordinalPosition +
                ", columnDefault='" + columnDefault + '\'' +
                ", isNullable='" + isNullable + '\'' +
                ", dataType='" + dataType + '\'' +
                ", characterMaximumLength=" + characterMaximumLength +
                ", characterOctetLength=" + characterOctetLength +
                ", numericPrecision=" + numericPrecision +
                ", numericScale=" + numericScale +
                ", datetimePrecision=" + datetimePrecision +
                ", characterSetName='" + characterSetName + '\'' +
                ", collationName='" + collationName + '\'' +
                ", columnType='" + columnType + '\'' +
                ", columnKey=" + columnKey +
                ", extra='" + extra + '\'' +
                ", privileges='" + privileges + '\'' +
                ", columnComment='" + columnComment + '\'' +
                ", generationExpression='" + generationExpression + '\'' +
                ", srsId=" + srsId +
                '}';
    }
}