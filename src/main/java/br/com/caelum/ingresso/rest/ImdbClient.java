package br.com.caelum.ingresso.rest;

import java.util.Optional;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import br.com.caelum.ingresso.dao.SessaoDao;
import br.com.caelum.ingresso.model.Filme;
import br.com.caelum.ingresso.model.ImagemCapa;
import br.com.caelum.ingresso.model.Sessao;


@Component
public class ImdbClient {
	private Logger logger = Logger.getLogger(ImdbClient.class);

	public <T> Optional<T> request(Filme filme, Class<T> tClass) {
		RestTemplate client = new RestTemplate();
		String titulo = filme.getNome().replace("	", "+");
		String url = String.format("https://imdb-fj22.herokuapp.com/imdb?title=%s", titulo);
		try {
			return Optional.of(client.getForObject(url, tClass));
		} catch (RestClientException e) {
			logger.error(e.getMessage(), e);
			return Optional.empty();
		}
	}

	
	
}
