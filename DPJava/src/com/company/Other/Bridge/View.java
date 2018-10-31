package com.company.Other.Bridge;

public abstract class View {
    Resource resource;

    public View(Resource resource) {
        this.resource = resource;
    }

    public abstract String Show();
}
