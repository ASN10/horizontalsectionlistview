package com.horizontallistview.model;


import com.horizontallistviewwithsections.interfaces.Item;

/**
 * Created by nivedhitha.a on 8/31/2015.
 */
public class Data implements Item {


    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    @Override
    public boolean isSection() {
        return false;
    }
}
