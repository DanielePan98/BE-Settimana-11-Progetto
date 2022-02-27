package it.segreteria.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Corso {
	
	@NotNull
	private String codice;
	@NotNull
	private String nome;
	@NotNull
	private String indirizzo;
	@NotNull
	@Size(min=2,max=3)
	private int esami;

}
