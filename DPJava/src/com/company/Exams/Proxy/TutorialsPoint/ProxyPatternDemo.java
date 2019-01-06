package com.company.Exams.Proxy.TutorialsPoint;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_img.png");

        image.display();
        System.out.println("");

        image.display();
    }
}
