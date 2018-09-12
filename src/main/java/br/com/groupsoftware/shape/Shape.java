package br.com.groupsoftware.shape;

import br.com.groupsoftware.geometrics.Areas;

public interface Shape {
	public String draw();
	public Double calculateArea(Areas areas); 
}
