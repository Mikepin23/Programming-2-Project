package Demo;

import Package1.Airplane;
import Package2.Helicopter;
import Package2.Quadcopter;
import Package4.UAV;
import Package5.AgriculturalDrone;
import Package5.Mav;

public class Driver extends Airplane {

public static void findLeastAndMostExpensiveUAV(Airplane[] flyingObjects) {
		
		UAV leastExpensive = null;
		UAV mostExpensive = null;

		for (int i = 0; i < flyingObjects.length; i++) {
			if (flyingObjects[i] instanceof UAV) {
				UAV uav = (UAV) flyingObjects[i];

				if (leastExpensive == null || uav.getPrice() < leastExpensive.getPrice()) {
					leastExpensive = uav;
				}

				if (mostExpensive == null || uav.getPrice() > mostExpensive.getPrice()) {
					mostExpensive = uav;
				}
			}
		}

		if (leastExpensive != null && mostExpensive != null) {
			System.out.println("The least expensive UAV is:\n" + leastExpensive.toString());
			System.out.println("The most Eexpensive UAV is:\n" + mostExpensive.toString());
		} else if (leastExpensive != null) {
			System.out.println("Only one UAV found, the price is :\n" + leastExpensive.toString());
		} else {
			System.out.println("No UAV objects found in the array.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Airplane[] flyingObjects = { new Helicopter ("Textron", 1900000, 750, 6, 2018, 10), new Helicopter("Tetxtron", 1700000, 800, 6, 2014, 8), new UAV(150.00, 180000.00), 
				new UAV(200.00, 250000.00), new Airplane("Boeing", 2000000, 30000), new Airplane("Boeing", 2200000, 34000), new Quadcopter("Textron", 2400000, 900, 8, 2020, 12, 200),
				new Quadcopter("AMS", 2200000, 880, 8, 2021, 14, 240), new Multirotor("DSL", 2800000, 900, 16, 2018, 20, 12), new Multirotor("FA", 2400000, 960, 12, 2015, 14, 12),
				new Airplane("QTR", 1800000, 32000), new UAV(300.00, 150000.00), new AgriculturalDrone(40, 2000, "GeekTech", 40), new AgriculturalDrone(36, 2400, "Laurence", 32),
				new Mav(10, 2200, "E-620", 30), new Mav(12, 2400, "B-450", 36), new UAV(220.00, 240000.00), new Airplane("Strelock", 2600000, 40000), 
				new Mav(14, 1900, "Q-7200", 28), new Airplane("Archer", 300000, 40000)};

		Airplane[] flyingObjects2 = {new Helicopter ("Textron", 1900000, 750, 6, 2018, 10), new Helicopter("Tetxtron", 1700000, 800, 6, 2014, 8), new Airplane("Boeing", 2000000, 30000), 
				new Airplane("Boeing", 2200000, 34000), new Quadcopter("Textron", 2400000, 900, 8, 2020, 12, 200), new Quadcopter("AMS", 2200000, 880, 8, 2021, 14, 240), 
				new Multirotor("DSL", 2800000, 900, 16, 2018, 20, 12), new Multirotor("FA", 2400000, 960, 12, 2015, 14, 12), new Airplane("QTR", 1800000, 32000), 
				new AgriculturalDrone(40, 2000, "GeekTech", 40), new AgriculturalDrone(36, 2400, "Laurence", 32), new Mav(10, 2200, "E-620", 30), new Mav(12, 2400, "B-450", 36), 
				new Airplane("Strelock", 2600000, 40000), new Mav(14, 1900, "Q-7200", 28), new Airplane("Archer", 300000, 40000)};
		

        System.out.println("Testing equality of objects:");
        
        System.out.println("Are flyingObjects[0] and flyingObjects[2] equal? " +
                flyingObjects[0].equals(flyingObjects[2]));
        
        System.out.println("Are flyingObjects[4] and flyingObjects[5] equal? " +
                flyingObjects[4].equals(flyingObjects[5]));
        
        System.out.println("Are flyingObjects[1] and flyingObjects[6] equal? " +
                flyingObjects[1].equals(flyingObjects[6]));
		
		findLeastAndMostExpensiveUAV(flyingObjects);

	}

}
