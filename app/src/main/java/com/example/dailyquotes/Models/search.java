package com.example.dailyquotes.Models;

public class search {
    int imgIV;
    String caterogyTX;

    public search(int imgIV, String caterogyTX) {
        this.imgIV = imgIV;
        this.caterogyTX = caterogyTX;
    }

    public search() {
    }

    public int getImgIV() {
        return imgIV;
    }

    public void setImgIV(int imgIV) {
        this.imgIV = imgIV;
    }

    public String getCaterogyTX() {
        return caterogyTX;
    }

    public void setCaterogyTX(String caterogyTX) {
        this.caterogyTX = caterogyTX;
    }
}
