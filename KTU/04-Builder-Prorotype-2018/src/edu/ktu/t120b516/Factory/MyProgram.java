package edu.ktu.t120b516.Factory;

import java.util.Scanner;
import edu.ktu.t120b516.StrategyObserver.*;

public class MyProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		scanner.reset();
		
		
		System.out.println("=== OBSERVER BEGIN  ===");
		Manager mgmt = new ViewPortController();
		
		Enemy e = null;
		
		String userInput = "";
		System.out.println("Select : (P)lane / (S)hip / e(X)it");
		userInput = scanner.nextLine();	
		
		while(!userInput.equals("X")) {
						
			/*System.out.println("=== FACTORY METHOD ===");
			IFactory f = new EnemyFactory();
			Enemy e = f.createEnemy(userInput);
			e.sayHello();
			*/
			
			//System.out.println("=== ABSTRACT FACTORY  ===");
			/*AbstractFactory1 af1 = new Level1Factory1();			
			
			Enemy e = null;
			if(userInput.equals("P")) {
				e = af1.createPlane();
			}
			if(userInput.equals("S")) {
				e = af1.createShip();
			}
			if(e != null) {
				e.sayHello();
			}
			
			af1 = new Level2Factory1();			
			
			e = null;
			if(userInput.equals("P")) {
				e = af1.createPlane();
			}
			if(userInput.equals("S")) {
				e = af1.createShip();
			}
			if(e != null) {
				e.sayHello();
			}
			
			AbstractFactory2 af2 = new AnyLevelFactory2();
			System.out.println("Select type: (J)et / (B)omber / (S)ubmarine / (A)irCraft / e(X)it");
			String userInput2 = scanner.nextLine();
			
			af2.createEnemy(userInput, userInput2).sayHello();
			*/
			
			
			
			
			System.out.println("\n=== STRATEGY  ===");
			 e =  new EnemyFactory().createEnemy(userInput);
			
			e.move();		
			
			System.out.println("    added Swimming ability");
			e.moveList.add(new Swim());
			e.moveList.remove(0);
			
			//e.move();
			
			System.out.println("=== OBSERVER continue  ===");
			mgmt.add(e);
			mgmt.notifyAll1();
			System.out.println("=== OBSERVER END  ===");
			
			
			System.out.println("=== BUILDER start  ===");
			EnemyFactory fb = new EnemyFactory();
			Enemy eb = fb.createEnemy(userInput);
			System.out.println("=== BUILDER END  ===");
			
			System.out.println("\n=== prototype START  ===");
			System.out.println("1) enemy: " + System.identityHashCode(eb) + " wings: " + System.identityHashCode(eb.getWings()));
			Enemy sc = eb.shallowCopy();
			System.out.println("2) enemy: " + System.identityHashCode(sc) + " wings: " + System.identityHashCode(sc.getWings()));
			Enemy dc = eb.deepCopy();
			System.out.println("3) enemy: " + System.identityHashCode(dc) + " wings: " + System.identityHashCode(dc.getWings()));
			
			System.out.println("=== prototype END  ===");
			
			System.out.println("\n=== DECORATOR start  ===");
			
			System.out.println("=== DECORATOR start  ===");
			
			
			/* =================================================== */
			System.out.println("Select : (P)lane / (S)hip / e(X)it");
			userInput = scanner.nextLine();
		}
		
		System.out.println("\n=== OBSERVER change position  ===");
		//ViewPortController c = new ViewPortController();
		e.setVpc((ViewPortController)mgmt);
		e.changePosition();
		
		System.out.println("GAME OVER");
		scanner.close();

	}

}
