package com.nt.factoryclass;

import com.nt.bikes.IBike;
import com.nt.bikes.Innova;
import com.nt.bikes.Maruthi;
import com.nt.bikes.Toyota;

public class FactoryClass {
	
	public static IBike getInstance(String car) {
		IBike bike= null;
		
		if(car.equalsIgnoreCase("toyota"))
			bike = new Toyota();
		else if (car.equalsIgnoreCase("maruthi"))
			bike = new Maruthi();
		else if (car.equalsIgnoreCase("Innova"))
			bike = new Innova();
		else 
			throw new  IllegalArgumentException("car not found");
		
		return bike;
	}

}
