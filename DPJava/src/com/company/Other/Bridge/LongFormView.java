package com.company.Other.Bridge;

public class LongFormView extends View {
    public LongFormView(Resource resource) {
        super(resource);
    }

    @Override
    public String Show() {
        return "Long form view" + this.resource.snippet();
    }
}
