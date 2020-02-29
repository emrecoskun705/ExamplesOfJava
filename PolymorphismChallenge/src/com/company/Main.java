package com.company;

class Car {
    private String name;
    private boolean engine;
    private int cylinder;
    private int wheels;
    private boolean automatic;

    private int speed=0;

    public Car(String name, int cylinder, boolean automatic) {
        this.name = name;
        this.cylinder = cylinder;
        this.automatic = automatic;
        this.engine = true;
        this.wheels = 4;
    }

    public void startEngine() {
        System.out.println("Car.startEngine() called");
    }

    public void accelerate(int rate) {
        this.speed += rate;
        System.out.println("Speed was " + (this.speed - rate)+ " and now " + this.speed);
    }

    public void brake() {
        this.speed = 0;
        System.out.println("Car.brake() called -- speed is " + this.speed);
    }

    public String getName() {
        return name;
    }

    public int getCylinder() {
        return cylinder;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public int getSpeed() {
        return speed;
    }
}

class Porsche extends Car {
    public Porsche(int cylinder) {
        super("Porsche", cylinder, false);
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void accelerate(int rate) {
        super.accelerate(rate);
    }

    @Override
    public void brake() {
        super.brake();
    }
}

class Tofas extends Car{
    public Tofas(int cylinder) {
        super("tofas", cylinder,false);
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void accelerate(int rate) {
        super.accelerate(rate);
    }

    @Override
    public void brake() {
        super.brake();
    }
}

class Mitsubishi extends Car {
    public Mitsubishi( int cylinder, boolean automatic) {
        super("mitsubishi", cylinder, automatic);
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void accelerate(int rate) {
        super.accelerate(rate);
    }

    @Override
    public void brake() {
        super.brake();
    }
}






public class Main {

    public static void main(String[] args) {
	Porsche porsche = new Porsche(20);
	Tofas tofas = new Tofas(21);

	porsche.startEngine();
    System.out.println(porsche.getSpeed());
	porsche.accelerate(23);
	porsche.accelerate(22);
	porsche.brake();

	tofas.startEngine();
	tofas.accelerate(21);
	tofas.brake();


    }
}
