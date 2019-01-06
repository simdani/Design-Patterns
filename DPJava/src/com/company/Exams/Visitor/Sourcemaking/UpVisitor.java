package com.company.Exams.Visitor.Sourcemaking;

public class UpVisitor implements Visitor {
    @Override
    public void visit(FOO foo) {
        System.out.println("do Up on " + foo.getFoo());
    }

    @Override
    public void visit(BAR bar) {
        System.out.println("do Up on " + bar.getBar());
    }

    @Override
    public void visit(BAZ baz) {
        System.out.println("do Up on " + baz.getBaz());
    }
}
