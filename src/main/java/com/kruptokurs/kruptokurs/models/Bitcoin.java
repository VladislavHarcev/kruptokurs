package com.kruptokurs.kruptokurs.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Bitcoin{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String value_dollar, value_btc, date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValue_dollar() {
        return value_dollar;
    }

    public void setValue_dollar(String value_dollar) {
        this.value_dollar = value_dollar;
    }

    public String getValue_btc() {
        return value_btc;
    }

    public void setValue_btc(String value_btc) {
        this.value_btc = value_btc;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

