package ar.edu.unlam.pb2.Tragamonedas;

import org.junit.Assert;
import org.junit.Test;

public class TragamonedasTest {
	
	@Test
	public void queElTragamonedasSeCreaConLadosMayorA1(){
		Integer lado = 2;
		Tragamonedas t1 = new Tragamonedas(lado);
		
		t1.jugar();
		
		Assert.assertTrue((t1.getResultado1() <= lado) && (t1.getResultado2() <= lado) && (t1.getResultado3() <= lado));
	}
	
	@Test
	public void queDependeDelAzar(){
		Integer lado = 2;
		Tragamonedas t1 = new Tragamonedas(lado);
		
		if(t1.jugar()){
			System.out.println("¡Has GANADO!");
		}
		else{
			System.out.println("Has perdido");
		}
	}
}
