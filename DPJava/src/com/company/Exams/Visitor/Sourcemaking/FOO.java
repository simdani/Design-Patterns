package com.company.Exams.Visitor.Sourcemaking;

public class FOO implements Element {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getFoo() {
        return "FOO";
    }
}
