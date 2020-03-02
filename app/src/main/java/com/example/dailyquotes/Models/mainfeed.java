package com.example.dailyquotes.Models;

public class mainfeed {
    String quotes;
    int bgimg;
   /* Boolean fav;*/

 /*   public mainfeed(String quotes, int bgimg, Boolean fav) {
        this.quotes = quotes;
        this.bgimg = bgimg;
        this.fav = fav;
    }*/

    public mainfeed(String quotes, int bgimg) {
        this.quotes = quotes;
        this.bgimg = bgimg;
    }

    public mainfeed() {
    }

    public String getQuotes() {
        return quotes;
    }

    public void setQuotes(String quotes) {
        this.quotes = quotes;
    }

    public int getBgimg() {
        return bgimg;
    }

    public void setBgimg(int bgimg) {
        this.bgimg = bgimg;
    }

/*    public Boolean getFav() {
        return fav;
    }

    public void setFav(Boolean fav) {
        this.fav = fav;
    }*/
}
