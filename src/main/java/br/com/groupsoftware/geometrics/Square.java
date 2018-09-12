package br.com.groupsoftware.geometrics;

import br.com.groupsoftware.shape.Shape;

public class Square implements Shape {

	@Override
	public String draw() {
		return "Square";
	}

	@Override
	public Double calculateArea(Areas area) {
		return area.getSide() * area.getSide();
	}

}
