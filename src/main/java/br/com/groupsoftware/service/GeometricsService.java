package br.com.groupsoftware.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import br.com.groupsoftware.exception.GeometricsException;
import br.com.groupsoftware.exception.GeometricsNotFounded;
import br.com.groupsoftware.factory.ShapeFactory;
import br.com.groupsoftware.geometrics.Areas;
import br.com.groupsoftware.shape.Shape;

@Service
public class GeometricsService {
	Logger logger = LoggerFactory.getLogger(GeometricsService.class);

	@Autowired
	private ShapeFactory factory;

	public void drawShape(Class<?> shapeClass, Areas areas) throws GeometricsException, GeometricsNotFounded {
		Shape drawShape = factory.getShape(shapeClass);

		if (ObjectUtils.isEmpty(drawShape)) {
			throw new GeometricsException();
		}

		String drawMsg = "This is a Shape: " + drawShape.draw();
		String areaOf = "Area of " + drawShape.draw() + " = " + drawShape.calculateArea(areas); 
				
		logger.info(drawMsg);
		logger.info(areaOf);
	}
	
}
