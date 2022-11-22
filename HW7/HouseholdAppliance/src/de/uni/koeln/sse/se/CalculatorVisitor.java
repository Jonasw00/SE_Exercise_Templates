package de.uni.koeln.sse.se;

import java.util.List;

public class CalculatorVisitor implements Visitor {
	
	public void calculate(List<HouseholdItem> HouseholdItems) {
		for(HouseholdItem HouseholdItem : HouseholdItems) {
			HouseholdItem.accept(this);
		}
	}
	
	public void visitElectronic(Electronic electronic) {
		double cost = 0;
		if(electronic.fragile) {
			cost = electronic.weight*0.5;
		}else if(!electronic.fragile) {
			cost = electronic.weight*0.3333333333;
		}
		System.out.println("Total Cost for " + electronic.name + " is: " + cost + " Euros");
		System.out.println(electronic.name+ ": \n >should be covered with Polyethylene foam film and packed in a box with dimension: " + (electronic.height+1) + "x" + (electronic.length+1) + "x" + (electronic.width+1));
		
	}
	
	public void visitFurniture(Furniture furniture) {
			double cost = furniture.weight*0.25;
		
		System.out.println("Total Cost for " + furniture.name + " is: " + cost + " Euros");
		System.out.println(furniture.name+ ": \n >should be covered with waterproof covers with area of:" + furniture.length+ "x" + furniture.width);
		
	}
		
	

	public void visitGlass(Glass glass) {
		double cost = 0;
		if(glass.thickness==1) {
			cost = glass.length*0.02;
		}else if(glass.thickness==2) {
			cost = glass.length*0.012;
		}else if (glass.thickness==3) {
			cost = glass.length*0.007;
		}
		System.out.println("Total Cost for " + glass.name + " is: " + cost + " Euros");
		System.out.println(glass.name+ ": \n >should be wrapped with Bubble wraps and packed in a box with dimension: " + (glass.height+1) + "x" + (glass.length+1) + "x" + (glass.width+1));
		
	}
}
