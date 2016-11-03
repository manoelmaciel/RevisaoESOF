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

}
