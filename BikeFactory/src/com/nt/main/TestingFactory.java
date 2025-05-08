package com.nt.main;

import com.nt.bikes.IBike;
import com.nt.factoryclass.FactoryClass;

public class TestingFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IBike bike = FactoryClass.getInstance("Innova");
		
		System.out.println(bike.drive());}

}
