package it.segreteria.model;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Studente {
	
	@NotNull
	private String matricola;
	@NotNull
	private String nome;
	@NotNull
	private String cognome;
	@NotNull
	private String data;
	@NotNull
	private String email;
	@NotNull
	private String indirizzo;
	@NotNull
	private String citta;
	@NotNull
	private Corso corso;

}
