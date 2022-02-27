package it.segreteria.model;

import java.util.HashMap;
import java.util.Map;



public class DummyDb {

	private Map<String, Studente> studenti = new HashMap<String, Studente>();
	private Map<String, Corso> corsi = new HashMap<String, Corso>();

	public void aggiungiStudente(Studente stud) {
		studenti.put(null, stud);
		
	}
	
	public void aggiungiCorso(Corso c) {
		corsi.put(null, c);
	}

}
