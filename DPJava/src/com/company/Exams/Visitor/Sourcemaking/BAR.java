package com.company.Exams.Visitor.Sourcemaking;

public class BAR implements Element {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getBar() {
        return "BAR";
    }
}
