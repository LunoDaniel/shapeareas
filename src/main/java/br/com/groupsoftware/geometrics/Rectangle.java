package br.com.groupsoftware.geometrics;

import br.com.groupsoftware.shape.Shape;

public class Rectangle implements Shape {

	@Override
	public String draw() {
		return "Rectangle";
	}

	@Override
	public Double calculateArea(Areas area) {
		return area.getBase() * area.getHeight();
	}

}
