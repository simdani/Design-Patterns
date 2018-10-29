package com.company.KTU.Factory;

import com.company.KTU.Factory.Factory.AbstractFactory;
import com.company.KTU.Factory.Factory.AnyLevelFactory;
import com.company.KTU.Factory.Factory.Enemy;
import com.company.KTU.Factory.Factory.EnemyFactory;
import com.company.KTU.Factory.Observer.Manager;
import com.company.KTU.Factory.Observer.ViewPortController;
import com.company.KTU.Factory.Strategy.Swim;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.reset();

        Enemy e= null;

        System.out.println("=== OBSERVER BEGIN  ===");
        Manager mgmt = new ViewPortController();

        String userInput = "";
        System.out.println("Select: P(lane) / (S)hip / e(X)it");
        userInput = scanner.nextLine();

        while (!userInput.equalsIgnoreCase("x")) {
// ABSTRACT FACTORY
            //            AbstractFactory af = new AnyLevelFactory();
//            System.out.println("Select type: (J)et / (B)omber / (S)ubmarine / (A)irCraft / e(X)it");
//            String userInput2 = scanner.nextLine();
//            af.createEnemy(userInput, userInput2).sayHello();
//
//            System.out.println("Select : (P)lane / (S)hip / e(X)it");
//            userInput = scanner.nextLine();
            System.out.println("\n=== STRATEGY  ===");
            e = new EnemyFactory().createEnemy(userInput);
            e.move();
            System.out.println("  added swimming ability");
            e.moveList.add(new Swim());
            e.moveList.remove(0);
            e.move();

            System.out.println("=== OBSERVER continue  ===");
            mgmt.add(e);
            mgmt.notifyAll1();
            System.out.println("=== OBSERVER END  ===");

            /* =================================================== */
            System.out.println("Select : (P)lane / (S)hip / e(X)it");
            userInput = scanner.nextLine();
        }
        System.out.println("\n=== OBSERVER change position  ===");
        e.setVpc((ViewPortController) mgmt);
        e.changePosition();

        System.out.println("GAME OVER");
        scanner.close();
    }
}
