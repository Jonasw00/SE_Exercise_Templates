package de.uni.koeln.sse.se;

import java.util.List;

public class PackingVisitor implements Visitor {
	
	public void calculate(List<HouseholdItem> HouseholdItems) {
		for(HouseholdItem HouseholdItem : HouseholdItems) {
			HouseholdItem.accept(this);
		}
	}

	@Override
	public void visitElectronic(Electronic electronic) {
		System.out.println(electronic.name+ ": \n >should be covered with Polyethylene foam film and packed in a box with dimension: " + (electronic.height+1) + "x" + (electronic.length+1) + "x" + (electronic.width+1));

		
	}

	@Override
	public void visitFurniture(Furniture furniture) {
		System.out.println(furniture.name+ ": \n >should be covered with waterproof covers with area of:" + furniture.length+ "x" + furniture.width);

		
	}

	@Override
	public void visitGlass(Glass glass) {
		System.out.println(glass.name+ ": \n >should be wrapped with Bubble wraps and packed in a box with dimension: " + (glass.height+1) + "x" + (glass.length+1) + "x" + (glass.width+1));

		
	}
}
