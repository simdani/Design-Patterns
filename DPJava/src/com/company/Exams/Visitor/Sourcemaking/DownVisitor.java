package com.company.Exams.Visitor.Sourcemaking;

public class DownVisitor implements Visitor {
    @Override
    public void visit(FOO foo) {
        System.out.println("do Down on " + foo.getFoo());
    }

    @Override
    public void visit(BAR bar) {
        System.out.println("do Down on " + bar.getBar());
    }

    @Override
    public void visit(BAZ baz) {
        System.out.println("do Down on " + baz.getBaz());
    }
}
