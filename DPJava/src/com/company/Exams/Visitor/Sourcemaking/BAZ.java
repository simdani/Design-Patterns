package com.company.Exams.Visitor.Sourcemaking;

public class BAZ implements Element {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getBaz() {
        return "BAZ";
    }
}
