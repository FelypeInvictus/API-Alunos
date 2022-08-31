package com.exerciciosenai.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Felype Rangel (vulgo: Invictus) <felype.sales@outlook.com>
 * @category API {@summary} Mostra, adiciona e deleta alunos do banco de dados
 * @version 1.0
 */

@SpringBootApplication
public class ApiAlunosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiAlunosApplication.class, args);
	}

}
