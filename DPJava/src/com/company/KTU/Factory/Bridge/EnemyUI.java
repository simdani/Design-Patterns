package com.company.KTU.Factory.Bridge;

public abstract class EnemyUI {
    protected UI ui;

    public EnemyUI(UI ui) {
        this.ui = ui;
    }

    public void drawUI() {
        ui.draw();
    }

    public void collision() {
        ui.collision();
    }

    public void rotate() {
        ui.rotate();
    }

    public UI getUi() {
        return ui;
    }

    public void setUi(UI ui) {
        this.ui =ui;
    }

    public abstract void drawWeapon();
    public abstract void drawMovement();
}
