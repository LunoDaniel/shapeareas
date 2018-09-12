package br.com.groupsoftware;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.groupsoftware.exception.GeometricsException;
import br.com.groupsoftware.exception.GeometricsNotFounded;
import br.com.groupsoftware.geometrics.Areas;
import br.com.groupsoftware.geometrics.Circle;
import br.com.groupsoftware.geometrics.Rectangle;
import br.com.groupsoftware.geometrics.Square;
import br.com.groupsoftware.geometrics.Triangle;
import br.com.groupsoftware.service.GeometricsService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShapeareasApplicationTests {

	@Autowired
	private GeometricsService service;
	
	@Test
	public void context_CircleTest() {
		Areas circleArea = new Areas();
		
		circleArea.setLightning(5.0);
		
		//DRAW CIRCLE
		try {
			service.drawShape(Circle.class, circleArea);
		} catch (GeometricsException | GeometricsNotFounded e) {
		}
	}
	
	@Test
	public void context_TriangleTest() {
		Areas triangleArea = new Areas();
		
		triangleArea.setHeight(3.0);
		triangleArea.setBase(5.0);
		
		//DRAW TRIANGLE
		try {
			service.drawShape(Triangle.class, triangleArea);
		} catch (GeometricsException | GeometricsNotFounded e) {
		}
	}
	
	@Test
	public void context_SquareTest() {
		Areas squareArea = new Areas();
		
		squareArea.setSide(3.0);
		//DRAW SQUARE
		try {
			service.drawShape(Square.class, squareArea);
		} catch (GeometricsException | GeometricsNotFounded e) {
		}
	}
	
	@Test
	public void context_RectangleTest() {
		Areas rectangleArea = new Areas();
		
		rectangleArea.setBase(3.0);
		rectangleArea.setHeight(2.0);
		//DRAW TRIANGLE
		try {
			service.drawShape(Rectangle.class, rectangleArea);
		} catch (GeometricsException | GeometricsNotFounded e) {
		}
	}

}
