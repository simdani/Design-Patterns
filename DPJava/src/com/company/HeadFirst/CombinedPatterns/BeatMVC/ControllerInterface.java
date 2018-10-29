package com.company.HeadFirst.CombinedPatterns.BeatMVC;

public interface ControllerInterface {
    void start();
    void stop();
    void increaseBPM();
    void decreaseBPM();
    void setBPM(int bpm);
}
