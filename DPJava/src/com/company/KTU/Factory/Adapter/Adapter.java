package com.company.KTU.Factory.Adapter;

public class Adapter extends Socket220V {
    private Socket110V socket;

    public Adapter(Socket110V s) {
        this.socket = s;
    }

    public int charge() {
        System.out.println("Converting 110 to 220");
        int voltage = socket.charge();
        return voltage * 2;
    }
}
