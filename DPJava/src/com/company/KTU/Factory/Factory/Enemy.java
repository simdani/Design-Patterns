package com.company.KTU.Factory.Factory;

import com.company.KTU.Factory.Adapter.Socket220V;
import com.company.KTU.Factory.Bridge.EnemyUI;
import com.company.KTU.Factory.Bridge.UIDraw;
import com.company.KTU.Factory.Decorator.ISkin;
import com.company.KTU.Factory.Observer.IObserver;
import com.company.KTU.Factory.Observer.ViewPortController;
import com.company.KTU.Factory.Prototype.Wings;
import com.company.KTU.Factory.Strategy.IMoveAlgorithm;

import java.util.ArrayList;

public abstract class Enemy extends EnemyUI implements IObserver, Cloneable, ISkin {
    private String name = "";
    private long posX;
    private long posY;
    private long damage = 10;
    private Wings wings = null;
    private ViewPortController vpc;
    public ArrayList<IMoveAlgorithm> moveList = new ArrayList<>();

    public Enemy(String name, long posX, long posY) {
        super(new UIDraw());
        this.name = name;
        this.posX = posX;
        this.posY = posY;
    }

    public String draw() {
        return "drawing enemy";
    }

    public int charge(Socket220V s) {
        int v = s.charge();
        System.out.println(this.name = "charging with " + v);
        return v;
    }

    public void shoot() {
        System.out.println(this.name + " is shooting");
    }

    public Enemy shallowCopy() {
        try {
            return (Enemy) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Enemy deepCopy() {
        try {
            Enemy qwe = (Enemy) super.clone();
            qwe.wings = (Wings) qwe.wings.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
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

    public void addWings(Wings wings) {
        this.wings = wings;
    }

    public Wings getWings() {
        return this.wings;
    }

    @Override
    public void update(String msg) {
        System.out.println("Name: " + this.name + " msg: " + msg);
    }

}
