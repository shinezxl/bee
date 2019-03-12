package com.example.bee.domain;

import java.io.Serializable;

public class BeeFlower implements Serializable {

    private int id;
    private String customType;
    private String flowerUrl;
    private String flowerDescribe;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomType() {
        return customType;
    }

    public void setCustomType(String customType) {
        this.customType = customType;
    }

    public String getFlowerUrl() {
        return flowerUrl;
    }

    public void setFlowerUrl(String flowerUrl) {
        this.flowerUrl = flowerUrl;
    }

    public String getFlowerDescribe() {
        return flowerDescribe;
    }

    public void setFlowerDescribe(String flowerDescribe) {
        this.flowerDescribe = flowerDescribe;
    }

    @Override
    public String toString() {
        return "BeeFlower{" +
                "id=" + id +
                ", customType='" + customType + '\'' +
                ", flowerUrl='" + flowerUrl + '\'' +
                ", flowerDescribe='" + flowerDescribe + '\'' +
                '}';
    }
}