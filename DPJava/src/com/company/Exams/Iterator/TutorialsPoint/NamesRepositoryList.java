package com.company.Exams.Iterator.TutorialsPoint;

import java.util.ArrayList;
import java.util.List;

public class NamesRepositoryList implements Container {
    public List<String> names = new ArrayList<>();

    public NamesRepositoryList() {
        names.add("John");
        names.add("Robert");
    }

    @Override
    public Iterator getIterator() {
        return new NameRepositoryListIterator();
    }

    private class NameRepositoryListIterator implements Iterator {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }
    }
}
