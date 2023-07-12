package Demo;


import Package1.Airplane;
import Package2.Helicopter;
import Package2.Quadcopter;
import Package4.UAV;
import Package5.AgriculturalDrone;
import Package5.Mav;
import Package3.Multirotor;

public class Driver extends Airplane {
    public static Airplane[] copyFlyingObjects(Airplane[] flyingObjects) {
        Airplane[] copyArray = new Airplane[flyingObjects.length];

        for (int i = 0; i < flyingObjects.length; i++) {
            copyArray[i] = flyingObjects[i];
        }

        return copyArray;
    }

       
    public static void main(String[] args) {
    	Airplane[] flyingObjects = { new Helicopter ("Textron", 1900000, 750, 6, 2018, 10), new Helicopter("Tetxtron", 1700000, 800, 6, 2014, 8), new UAV(150.00, 180000.00), 
				new UAV(200.00, 250000.00), new Airplane("Boeing", 2000000, 30000), new Airplane("Boeing", 2200000, 34000), new Quadcopter("Textron", 2400000, 900, 8, 2020, 12, 200),
				new Quadcopter("AMS", 2200000, 880, 8, 2021, 14, 240), new Multirotor("DSL", 2800000, 900, 16, 2018, 20, 12), new Multirotor("FA", 2400000, 960, 12, 2015, 14, 12),
				new Airplane("QTR", 1800000, 32000), new UAV(300.00, 150000.00), new AgriculturalDrone(40, 2000, "GeekTech", 40), new AgriculturalDrone(36, 2400, "Laurence", 32),
				new Mav(10, 2200, "E-620", 30), new Mav(12, 2400, "B-450", 36), new UAV(220.00, 240000.00), new Airplane("Strelock", 2600000, 40000), 
				new Mav(14, 1900, "Q-7200", 28), new Airplane("Archer", 300000, 40000)};


        System.out.println("Original Array:");
        for (Airplane obj : flyingObjects) {
            System.out.println(obj.toString());
        }

        System.out.println("\nCopied array:");
        Airplane[] copiedObjects = copyFlyingObjects(flyingObjects);
        for (Airplane obj : copiedObjects) {
            System.out.println(obj.toString());
        }
    }
}