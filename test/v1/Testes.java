package v1;

import junit.framework.Assert;

import org.junit.Test;

@SuppressWarnings("deprecation")
public class Testes {

	@Test // Teste 1
	public void testeExemplo() {
		Pessoa p1 = new Pessoa("Fulano", false, false);
		Pessoa p2 = new Pessoa("Ciclana", false, false);
		Pessoa p3 = new Pessoa("Beltrana", false, false);
		
		Fila f = new Fila();
		
		f.addPessoa(p1);
		f.addPessoa(p2);
		f.addPessoa(p3);
		
		Pessoa proximo = f.proximoFila();
		
		Assert.assertEquals(proximo.getNome(), "Fulano");
		
		f.removePessoa(proximo);
		proximo = f.proximoFila();
			
		Assert.assertEquals(proximo.getNome(), "Ciclana");
		
		f.removePessoa(proximo);
		proximo = f.proximoFila();
		
		Assert.assertEquals(proximo.getNome(), "Beltrana");
		
		f.removePessoa(proximo);
	}

	@Test // Teste 2
	public void testeGravida() {
		Pessoa p1 = new Pessoa("Fulano1", false, false);
		Pessoa p2 = new Pessoa("CiclanaGravida1", true, false);
		Pessoa p3 = new Pessoa("Beltrana1", false, false);
		
		Fila f = new Fila();
		
		f.addPessoa(p1);
		f.addPessoa(p2);
		f.addPessoa(p3);
		
		Pessoa proximo = f.proximoFila();
		
		Assert.assertEquals(proximo.getNome(), "CiclanaGravida1");
		
		f.removePessoa(proximo);
		proximo = f.proximoFila();
		
		Assert.assertEquals(proximo.getNome(), "Fulano1");
		
		f.removePessoa(proximo);
		proximo = f.proximoFila();
			
		Assert.assertEquals(proximo.getNome(), "Beltrana1");
		
		f.removePessoa(proximo);
		
	}

	@Test // Teste 3
	public void testeIdoso() {
		Pessoa p1 = new Pessoa("Fulano2", false, false);
		Pessoa p2 = new Pessoa("CiclanaGravida2", true, false);
		Pessoa p3 = new Pessoa("BeltranoIdoso2", false, true);
		
		Fila f = new Fila();
		
		f.addPessoa(p1);
		f.addPessoa(p2);
		f.addPessoa(p3);
		
		Pessoa proximo = f.proximoFila();
		
		Assert.assertEquals(proximo.getNome(), "BeltranoIdoso2");
		
		f.removePessoa(proximo);
		proximo = f.proximoFila();
			
		Assert.assertEquals(proximo.getNome(), "CiclanaGravida2");
		
		f.removePessoa(proximo);
		proximo = f.proximoFila();
		
		Assert.assertEquals(proximo.getNome(), "Fulano2");
		
		f.removePessoa(proximo);
		
		// o proximo não existe ... Problema!
		proximo = f.proximoFila();

		
	}

	@Test // Teste 4 - Misturando um pouco ... 
	public void testeMistureba() {
		Pessoa p1 = new Pessoa("BeltranoIdoso4", false, true);		
		Pessoa p2 = new Pessoa("Fulano4", false, false);
		Pessoa p3 = new Pessoa("CiclanaGravida4", true, false);
		Pessoa p4 = new Pessoa("BeltranoIdoso5", false, true);
		Pessoa p5 = new Pessoa("Beltrano5", false, false);
		Pessoa p6 = new Pessoa("CiclanaGravida5", true, false);
		Pessoa p7 = new Pessoa("BeltranoIdoso6", false, true);		
		Pessoa p8 = new Pessoa("CiclanaGravida6", true, false);
		Pessoa p9 = new Pessoa("Ciclano6", false, false);
		
		
		Fila f = new Fila();
		
		f.addPessoa(p1);
		f.addPessoa(p2);
		f.addPessoa(p3);
		f.addPessoa(p4);
		f.addPessoa(p5);
		f.addPessoa(p6);
		f.addPessoa(p7);
		f.addPessoa(p8);
		f.addPessoa(p9);
		
		Pessoa proximo = f.proximoFila();
		
		Assert.assertEquals(proximo.getNome(), "BeltranoIdoso4");
		
		f.removePessoa(proximo);
		proximo = f.proximoFila();
			
		Assert.assertEquals(proximo.getNome(), "BeltranoIdoso5");
		
		f.removePessoa(proximo);
		proximo = f.proximoFila();
			
		Assert.assertEquals(proximo.getNome(), "BeltranoIdoso6");
		
		f.removePessoa(proximo);
		proximo = f.proximoFila();
			
		Assert.assertEquals(proximo.getNome(), "CiclanaGravida4");
		
		f.removePessoa(proximo);
		proximo = f.proximoFila();
		
		Assert.assertEquals(proximo.getNome(), "CiclanaGravida5");
		
		f.removePessoa(proximo);
		proximo = f.proximoFila();
		
		Assert.assertEquals(proximo.getNome(), "CiclanaGravida6");
		
		f.removePessoa(proximo);
		proximo = f.proximoFila();
		
		Assert.assertEquals(proximo.getNome(), "Fulano4");
		
		f.removePessoa(proximo);
		proximo = f.proximoFila();

		Assert.assertEquals(proximo.getNome(), "Beltrano5");
		
		f.removePessoa(proximo);		
		proximo = f.proximoFila();
		
		Assert.assertEquals(proximo.getNome(), "Ciclano6");
		
		f.removePessoa(proximo);		
		proximo = f.proximoFila();

		// o proximo não existe ... Problema!
		proximo = f.proximoFila();

		
	}

}
