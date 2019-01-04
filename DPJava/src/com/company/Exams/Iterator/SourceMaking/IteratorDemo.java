package com.company.Exams.Iterator.SourceMaking;

import java.util.Enumeration;

public class IteratorDemo {
    public static void main(String[] args) {
        IntSet set = new IntSet();
        for (int i = 2; i < 10; i += 2) set.add(i);
        for (int i = 1; i < 9; i++) {
            System.out.println(i + " " + set.isMember(i) + " ");
        }

        IntSet.Iterator it1 = set.createIterator();
        IntSet.Iterator it2 = set.createIterator();

        System.out.println("\nIterator: ");
        for (it1.first(), it2.first(); !it1.isDone(); it1.next(), it2.next()) {
            System.out.println(it1.currentItem() + " " + it2.currentItem() + " ");
        }

        System.out.println("\nEnumeration: ");
        for (Enumeration e = set.getHashtable().keys(); e.hasMoreElements();) {
            System.out.println(e.nextElement() + " ");
        }
        System.out.println();
    }
}
