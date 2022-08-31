package com.exerciciosenai.api.resource;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.exerciciosenai.api.model.Alunos;
import com.exerciciosenai.api.repository.AlunosRepository;
import com.exerciciosenai.api.service.AlunosService;

@RestController
@RequestMapping("/alunos")
public class AlunosResource {


	@Autowired
	private AlunosRepository alunosRepository;

	// Mostra lista de alunos
	@GetMapping
	public List<Alunos> list() {
		return alunosRepository.findAll();
	}

	// Mostra aluno por Id
	@GetMapping("/{id_aluno}")
	public Alunos buscarPorId(@PathVariable Long id_aluno) {
		return alunosRepository.findById(id_aluno).orElse(null);
	}

	// Adiciona alunos
	@PostMapping
	public ResponseEntity<Alunos> criar(@RequestBody Alunos alunos, HttpServletResponse response) {
		Alunos alunoSalvo = alunosRepository.save(alunos);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id_aluno}")
				.buildAndExpand(alunoSalvo.getId()).toUri();
		response.setHeader("Location", uri.toASCIIString());

		return ResponseEntity.created(uri).body(alunoSalvo);
	}

	// Deleta alunos
	@DeleteMapping("/{id_aluno}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long id_aluno) {
		this.alunosRepository.deleteById(id_aluno);
	}

}
