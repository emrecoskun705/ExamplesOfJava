package com.company;

public class Main {

    public static void main(String[] args) {
//        Case theCase = new Case("2208","Dell","240",new Dimensions(20,20,5));
//        Monitor theMonitor = new Monitor("27inch beast","Acer",27,new Resolution(2540,1440));
//        MotherBoard theMotherBoard = new MotherBoard("BJ-200","Asus",4,6,"v2.44");
//
//
//        PC thePC = new PC(theCase,theMonitor,theMotherBoard);
//
//        thePC.powerUp();

        Wall wall1 = new Wall("South");
        Wall wall2 = new Wall("North");
        Wall wall3 = new Wall("West");
        Wall wall4 = new Wall("East");

        Ceiling ceiling = new Ceiling(4,"red");

        Bed bed = new Bed("Modern", 2, 3,2,1);

        Lamp lamp = new Lamp("Classic", true,70);

        Bedroom bedroom = new Bedroom("Emres",wall1,wall2,wall3,wall4,ceiling,bed,lamp);

        bedroom.makeBad();
        bedroom.getLamp().turnOn();


    }
}
