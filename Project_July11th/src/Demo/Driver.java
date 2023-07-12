package Demo;

import Package1.Airplane;
import Package2.Helicopter;
import Package2.Quadcopter;
import Package4.UAV;
import Package5.AgriculturalDrone;
import Package5.Mav;

public class Driver extends Airplane {

	public static void findLeastAndMostExpensiveUAV(Airplane[] flyingObjects) {
		
		// Created UAV variables
		UAV leastExpensive = null;
		UAV mostExpensive = null;

		// for loop to find all instances of the UAV subclass
		for (int i = 0; i < flyingObjects.length; i++) {
			if (flyingObjects[i] instanceof UAV) {
				UAV uav = (UAV) flyingObjects[i];

				// Comparing all values at index i against all previous values and storing the lowest
				if (leastExpensive == null || uav.getPrice() < leastExpensive.getPrice()) {
					leastExpensive = uav;
				}

				// Comparing all values at index i against all previous values and storing the highest
				if (mostExpensive == null || uav.getPrice() > mostExpensive.getPrice()) {
					mostExpensive = uav;
				}
			}
		}

		// All possible outcomes printed
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

	}

}
