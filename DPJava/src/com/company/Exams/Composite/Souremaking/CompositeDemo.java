package com.company.Exams.Composite.Souremaking;

public class CompositeDemo {
    public static StringBuffer compositeBuilder = new StringBuffer();

    public static void main(String[] args) {
        Directory music = new Directory("music");
        Directory scorpions = new Directory("Scorptions");
        Directory dio = new Directory("DIO");
        File track1 = new File("Dont worry, be happy.mp3");
        File track2 = new File("track2.mp3");
        File track3 = new File("Wind of change.mp3");
        File track4 = new File("big city ngiht.mp3");
        File track5 = new File("ranbow in the dark.mp3");
        music.add(track1);
        music.add(scorpions);
        music.add(track2);
        scorpions.add(track3);
        scorpions.add(track4);
        scorpions.add(dio);
        dio.add(track5);
        music.ls();
    }
}
