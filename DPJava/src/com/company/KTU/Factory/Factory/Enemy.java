package com.company.KTU.Factory.Factory;

import com.company.KTU.Factory.Observer.IObserver;
import com.company.KTU.Factory.Observer.ViewPortController;
import com.company.KTU.Factory.Strategy.IMoveAlgorithm;

import java.util.ArrayList;

public class Enemy implements IObserver {
    private String name = "";
    private long posX;
    private long posY;
    private long damage = 10;
    private ViewPortController vpc;
    public ArrayList<IMoveAlgorithm> moveList = new ArrayList<>();

    public Enemy(String name, long posX, long posY) {
        this.name = name;
        this.posX = posX;
        this.posY = posY;
    }

    public void move() {
        for (IMoveAlgorithm a : moveList) {
            a.move();
        }
    }

    public ViewPortController getVpc() {
        return vpc;
    }

    public void setVpc(ViewPortController vpc) {
        this.vpc = vpc;
    }

    public void changePosition() {
        this.vpc.changePosition();
    }

    public long getPosX() {
        return posX;
    }

    public void setPosX(long posX) {
        this.posX = posX;
    }

    public long getPosY() {
        return posY;
    }

    public void setPosY(long posY) {
        this.posY = posY;
    }

    public long getDamage() {
        return damage;
    }

    public void setDamage(long damage) {
        this.damage = damage;
    }

    public void sayHello() {
        System.out.println("Hello, I am" + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println("Name: " + this.name + " msg: " + msg);
    }
}
