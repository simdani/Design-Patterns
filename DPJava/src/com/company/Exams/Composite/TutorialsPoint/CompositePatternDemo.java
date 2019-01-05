package com.company.Exams.Composite.TutorialsPoint;

public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee CEO = new Employee("John", "CEO", 300000);
        Employee headSales = new Employee("Robert", "Head sales", 20000);
        Employee headMarketing = new Employee("Micheal", "Head Marketing", 200000);

        Employee clerk1 = new Employee("Laura", "Marketing", 10000);
        Employee clerk2 = new Employee("Bob", "Marketing", 10000);

        Employee salesExecetive1 = new Employee("Richard", "Sales", 1000);
        Employee salesExecetive2 = new Employee("Rob", "Sales", 1000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecetive1);
        headSales.add(salesExecetive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        System.out.println(CEO);

        for (Employee headEmplye : CEO.getSubordinates()) {
            System.out.println(headEmplye);
            for (Employee employee : headEmplye.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
}
