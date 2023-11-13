package models.entities;

import java.util.ArrayList;
import java.util.List;

import models.interfaces.FuncionarioComponent;

public class Garçom implements FuncionarioComponent {

	private String nome;
	private List<FuncionarioComponent> list = new ArrayList<>();

	public Garçom(String nome) {
		this.nome = nome;
	}

	@Override
	public void adcionar(FuncionarioComponent funcionario) {
		this.list.add(funcionario);
	}

	@Override
	public void remover(FuncionarioComponent funcionario) {
		this.list.remove(funcionario);

	}

	@Override
	public String getNome() {
		return nome;
	}

}
