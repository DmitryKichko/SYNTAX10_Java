package com.company.class2725.interfacedemo1;

public interface MoveAble {
    void move();
}
interface ControlAble{
    void control();
}
interface SellAble{
    void sell();
}
interface AnotherInterface{
    void sell();
}
interface Car extends MoveAble,ControlAble,SellAble,AnotherInterface{

}
class Toyota implements SellAble,AnotherInterface{

    @Override
    public void sell() {
        System.out.println("You can sell this");
    }
}