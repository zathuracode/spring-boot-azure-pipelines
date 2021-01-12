package com.vobi.demo.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class OperacionesMatematicasServiceTest {

	@Autowired
	OperacionesMatematicasService operacionesMatematicasService;
	
	@Test
	public void debeSumarDosNumeros()throws Exception {
		//Arrange
		Integer n1=2;
		Integer n2=4;
		Integer resultado=0;
		
		//Act
		resultado=operacionesMatematicasService.sumar(n1, n2);
		
		//Asset		
		assertEquals(6, resultado);
	}
	
	@Test
	public void debeLanzarExceptionNumeroUno() {
		//Arrange
		Integer n1=null;
		Integer n2=4;
		String expectedMessage = "El n1 es nulo";
	    String actualMessage=null;

				
		//Act
		Exception exception =assertThrows(Exception.class, ()->{
			operacionesMatematicasService.sumar(n1, n2);
		});
		actualMessage=exception.getMessage();
		
		//Asset		
		assertTrue(actualMessage.contains(expectedMessage));
		
	}
	
	@Test
	public void debeLanzarExceptionNumeroDos() {
		//Arrange
		Integer n1=2;
		Integer n2=null;
		String expectedMessage = "El n2 es nulo";
	    String actualMessage=null;

				
		//Act
		Exception exception =assertThrows(Exception.class, ()->{
			operacionesMatematicasService.sumar(n1, n2);
		});
		actualMessage=exception.getMessage();
		
		//Asset		
		assertTrue(actualMessage.contains(expectedMessage));

	}

}
