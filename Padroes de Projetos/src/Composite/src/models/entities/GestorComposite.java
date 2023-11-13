package models.entities;

import java.util.ArrayList;
import java.util.List;

import models.interfaces.FuncionarioComponent;

public abstract class GestorComposite implements FuncionarioComponent{
	
	private String nome;
	
	private List<FuncionarioComponent> list = new ArrayList<>();
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<FuncionarioComponent> getList() {
		return list;
	}

	public void setList(List<FuncionarioComponent> list) {
		this.list = list;
	}

	public void adcionar(FuncionarioComponent funcionario) {
		this.list.add(funcionario);
		
	}

	@Override
	public void remover(FuncionarioComponent funcionario) {
		this.list.remove(funcionario);
		
	}

}
