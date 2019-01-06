package com.company.Exams.Memento.TutorialsPoint;

public class MmentoPatternDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State #1");
        originator.setState("State #2");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("State #3");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("State #4");
        System.out.println("Current state" + originator.getState());

        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("First save state: " + originator.getState());

        originator.getStateFromMemento(caretaker.get(1));
        System.out.println("Second saved state: " + originator.getState());
    }
}
