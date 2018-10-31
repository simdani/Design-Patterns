package com.company.Other.Bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        View longBridge = new LongFormView(new BookResource());
        System.out.println(longBridge.Show());
    }
}
