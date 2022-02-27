package it.segreteria.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


import it.segreteria.model.Corso;
import it.segreteria.model.DummyDb;
import it.segreteria.model.Studente;

@Configuration
public class SegreteriaConfig {
	
	@Bean
	public DummyDb dummyDb() {

		return new DummyDb();	
	}

	@Bean
	@Scope("prototype")
	public Studente studente(String matricola,String nome ,String cognome ,String data ,String email ,String indirizzo, String citta ,Corso corso) {
		return new Studente(matricola,nome,cognome,data,email,indirizzo,citta,corso);
	}
	
	@Bean
	@Scope("prototype")
	public  Corso corso(String codice,String nome,String indirizzo,Integer esami) {
		return new Corso(codice,nome,indirizzo,esami);
	}
	
}
