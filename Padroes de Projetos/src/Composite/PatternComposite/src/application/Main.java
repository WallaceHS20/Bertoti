package application;

import models.entities.Garçom;
import models.entities.Gerente;
import models.interfaces.FuncionarioComponent;

public class Main {

	public static void main(String[] args) {
		FuncionarioComponent garçom = new Garçom("Douglas");
		FuncionarioComponent gerente = new Gerente();
		
		gerente.adcionar(garçom);
		gerente.getNome();
	}

}
