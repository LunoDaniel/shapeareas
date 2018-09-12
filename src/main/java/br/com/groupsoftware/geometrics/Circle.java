package br.com.groupsoftware.geometrics;

import br.com.groupsoftware.shape.Shape;

public class Circle implements Shape {

	@Override
	public String draw() {
		return "Circle";
	}

	@Override
	public Double calculateArea(Areas area) {
		return Math.PI * (Math.pow(area.getLightning(), 2));
	}

}
