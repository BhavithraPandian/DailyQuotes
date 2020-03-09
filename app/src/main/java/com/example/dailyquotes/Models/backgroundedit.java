package com.example.dailyquotes.Models;

public class backgroundedit {
    int editimg;
    String fontstyle;

    public backgroundedit(int editimg) {
        this.editimg = editimg;
    }

    public backgroundedit(String fontstyle) {
        this.fontstyle = fontstyle;
    }

    public int getEditimg() {
        return editimg;
    }

    public void setEditimg(int editimg) {
        this.editimg = editimg;
    }

    public String getFontstyle() {
        return fontstyle;
    }

    public void setFontstyle(String fontstyle) {
        this.fontstyle = fontstyle;
    }
}
