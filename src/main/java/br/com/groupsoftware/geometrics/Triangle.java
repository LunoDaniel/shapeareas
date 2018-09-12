package br.com.groupsoftware.geometrics;

import br.com.groupsoftware.shape.Shape;

public class Triangle implements Shape {

	@Override
	public String draw() {
		return "Triagle";
	}

	@Override
	public Double calculateArea(Areas area) {
		return (area.getBase() * area.getHeight())/2;
	}

}
