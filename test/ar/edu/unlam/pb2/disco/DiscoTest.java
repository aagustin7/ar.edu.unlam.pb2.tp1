package ar.edu.unlam.pb2.disco;

import org.junit.Assert;
import org.junit.Test;

public class DiscoTest {

	@Test
	public void testQueModelaUnDisco() {
		//1.Preparación
		Integer radiointerior = 2;
		Integer radioexterior = 4;
		
		Disco miDisco = new Disco(radiointerior,radioexterior);
		
		//2.Ejecución.
		double perimetroInterior = miDisco.getPerimetroInterior();
		double perimetroExterior = miDisco.getPerimetroExterior();
		double superficie = miDisco.getSuperficie();
		
		double perimetroInteriorEsperado = 12.56;
		double perimetroExteriorEsperado = 25.12;
		double superficieEsperada = 12.56;
		
		//3.contrastación.
		Assert.assertEquals(true, perimetroInterior == perimetroInteriorEsperado);
		Assert.assertEquals(true, perimetroExterior == perimetroExteriorEsperado);
		Assert.assertEquals(true, superficie == superficieEsperada);
		
	}
	
}
