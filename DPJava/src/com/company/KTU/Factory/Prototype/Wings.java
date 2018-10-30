package com.company.KTU.Factory.Prototype;

public class Wings implements Cloneable {
    public Wings clone () {
        try {
            return (Wings) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
