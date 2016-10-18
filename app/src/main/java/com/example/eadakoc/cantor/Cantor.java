package com.example.eadakoc.cantor;

import java.io.Serializable;

public class Cantor implements Serializable {
    private String mid;
    private String date;
    private String code;
    private String description;
    public String getMid() {
        return mid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Cantor{" +
                "mid='" + mid + '\'' +
                ", desctiption='" + description + '\'' +
                ", code='" + code + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
