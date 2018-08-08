package br.com.caelum.ingresso.model;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalTime;

import org.junit.Test;

import junit.framework.Assert;


public class SessaoTest {

	@Test
	public void oPrecoDaSessaoDeverSerIgualASoma(){
		
		Sala sala = new Sala("Eldorado - Imax", new BigDecimal("22,5"));
		Filme filme = new Filme ("Rogue One", Duration.ofMinutes(120), "SCI-FI", new BigDecimal("12,0"));
		
		BigDecimal somaDosPrecosDaSalaFilme = sala.getPreco().add(filme.getPreco());
		Sessao sessao = new Sessao(LocalTime.parse("10:00:00"), filme , sala);
		Assert.assertEquals( somaDosPrecosDaSalaFilme, sessao.getPreco());
		} 
}
