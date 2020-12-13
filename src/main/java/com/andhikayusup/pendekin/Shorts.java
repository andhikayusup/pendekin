package com.andhikayusup.pendekin;

public class Shorts {
    private String link;
    private int count;

    public Shorts(String link){
        this.link = link;
        this.count = 0;
    }

    public void incrementCount(){
        this.count++;
    }

    public String getLink(){
        return this.link;
    }

    public int getCount() {
        return this.count;
    }
}
