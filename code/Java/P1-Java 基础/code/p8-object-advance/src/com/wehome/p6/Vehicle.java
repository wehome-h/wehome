package com.wehome.p6;

// Vehicle是一个抽象类, 有两个抽象方法
public abstract class Vehicle {

    // 计算燃料效率的抽象方法
    public abstract double calcFuelEfficiency();

    // 计算行驶距离的抽象方法
    public abstract double calcTripDistance();

}