package com.company;

public class Vehicle {

    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer() called current direction is " + this.currentDirection);
    }

    public void move(int speed, int direction) {
        this.currentDirection = direction;
        this.currentVelocity = speed;
        System.out.println("Vehicle.move() called speed is " + this.currentVelocity + " direction is " + this.currentDirection);
    }

    public void stop() {
        this.currentVelocity = 0;
    }


    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
