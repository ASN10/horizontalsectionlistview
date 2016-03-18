package com.horizontallistview.model;


import com.horizontallistviewwithsections.interfaces.Item;

/**
 * Created by nivedhitha.a on 9/8/2015.
 */
public class Section implements Item {

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    private String section;

    @Override
    public boolean isSection() {
        return true;
    }
}
