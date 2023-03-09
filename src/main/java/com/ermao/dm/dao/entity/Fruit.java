package com.ermao.dm.dao.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * fruit
 * @author 
 */
@Data
public class Fruit implements Serializable {
    private Long id;

    private String name;

    private String color;

    private String favour;

    private String origin;

    private BigDecimal price;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFavour() {
        return favour;
    }

    public void setFavour(String favour) {
        this.favour = favour;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", favour='" + favour + '\'' +
                ", origin='" + origin + '\'' +
                ", price=" + price +
                '}';
    }
}