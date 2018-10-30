package com.company.KTU.Factory;

import com.company.KTU.Factory.Adapter.Adapter;
import com.company.KTU.Factory.Adapter.Socket110V;
import com.company.KTU.Factory.Adapter.Socket220V;
import com.company.KTU.Factory.Builder.Director;
import com.company.KTU.Factory.Builder.DrivingBuilder;
import com.company.KTU.Factory.Command.Invoker;
import com.company.KTU.Factory.Command.MoveDownCommand;
import com.company.KTU.Factory.Command.MoveUpCommand;
import com.company.KTU.Factory.Command.ShootCommand;
import com.company.KTU.Factory.Decorator.*;
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

            System.out.println("=== BUILDER start  ===");
            Enemy eb = new Director().getDriving();
            System.out.println("=== BUILDER END  ===");

            System.out.println("\n=== prototype START  ===");
            System.out.println("1) enemy: " + System.identityHashCode(eb) + " wings: " + System.identityHashCode(eb.getWings()));
            Enemy sc = eb.shallowCopy();
            System.out.println("2) enemy: " + System.identityHashCode(sc) + " wings: " + System.identityHashCode(sc.getWings()));
//            Enemy dc = eb.deepCopy();
//            System.out.println("3) enemy: " + System.identityHashCode(dc) + " wings: " + System.identityHashCode(dc.getWings()));

            System.out.println("=== prototype END  ===");
            System.out.println("\n=== DECORATOR start  ===");
            ISkin blue = new BlueEnemy(sc);
            blue = new Weapon(blue);
            System.out.println(blue.draw());

            ISkin red = new RedEnemy(eb);
            System.out.println(red.draw());
            red = new Shields(red);
            System.out.println(red.draw());
            System.out.println("\n=== DECORATOR END  ===");

            System.out.println("\n=== COMMAND start  ===");
            Invoker inv = new Invoker();
            inv.run(new MoveUpCommand(eb));
            inv.run(new MoveDownCommand(eb));
            inv.run(new ShootCommand(eb));
            inv.undo();
            inv.undo();
            System.out.println("\n=== COMMAND end  ===");

            System.out.println("\n=== ADAPTER start  ===");
            sc.charge(new Socket220V());
            Adapter adapter = new Adapter(new Socket110V());
            sc.charge(adapter);
            System.out.println("\n=== ADAPTER end  ===");

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
