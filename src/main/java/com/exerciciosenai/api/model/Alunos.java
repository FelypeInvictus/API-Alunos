package com.exerciciosenai.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.algamoney.api.model.Categoria;

@Entity
@Table(name = "alunos")
public class Alunos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_aluno;

	private String nome;
	private String turma;
	private int ano;

	public Long getId() {
		return id_aluno;
	}

	public void setId(Long id) {
		this.id_aluno = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}


}
