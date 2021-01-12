package com.vobi.demo.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class OperacionesMatematicasServiceTest {

	OperacionesMatematicasService operacionesMatematicasService=new OperacionesMatematicasServiceImpl();
	
	@Test
	public void debeSumar()throws Exception {
		//Arrange
		Integer n1=2;
		Integer n2=4;
		Integer resultado=0;
		
		//Act
		resultado=operacionesMatematicasService.sum(n1, n2);
		
		//Asset		
		assertEquals(6, resultado);
	}
	
	@Test
	public void debeLanzarExceptionNumeroUno()throws Exception {
		//Arrange
		Integer n1=null;
		Integer n2=4;
				
		//Act
		assertThrows(Exception.class, ()->{
			operacionesMatematicasService.sum(n1, n2);
		});
		
	}
	
	@Test
	public void debeLanzarExceptionNumeroDos()throws Exception {
		//Arrange
		Integer n1=2;
		Integer n2=null;
				
		//Act
		assertThrows(Exception.class, ()->{
			operacionesMatematicasService.sum(n1, n2);
		});
		
	}

}
