package br.com.groupsoftware.factory;

import org.springframework.stereotype.Component;

import br.com.groupsoftware.exception.GeometricsException;
import br.com.groupsoftware.exception.GeometricsNotFounded;
import br.com.groupsoftware.geometrics.Circle;
import br.com.groupsoftware.geometrics.Rectangle;
import br.com.groupsoftware.geometrics.Square;
import br.com.groupsoftware.geometrics.Triangle;
import br.com.groupsoftware.shape.Shape;

@Component
public class ShapeFactory {

	public Shape getShape(Class<?> shapeType) throws GeometricsException, GeometricsNotFounded {

		if (shapeType == null) {
			throw new GeometricsException();
		}

		if (shapeType.equals(Circle.class)) {
			return new Circle();
		} else if (shapeType.equals(Rectangle.class)) {
			return new Rectangle();
		} else if (shapeType.equals(Square.class)) {
			return new Square();
		} else if (shapeType.equals(Triangle.class)) {
			return new Triangle();
		} else {
			throw new GeometricsNotFounded();
		}
	}

}
