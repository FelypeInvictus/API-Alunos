CREATE TABLE alunos (
	id_aluno BIGINT PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	turma VARCHAR(3) NOT NULL,
	ano INT(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO alunos (nome, turma, ano) values ('Felype Rangel','1m1',1);
INSERT INTO alunos (nome, turma, ano) values ('José Fonseca','1m1',1);
INSERT INTO alunos (nome, turma, ano) values ('Lidia Ribeiro da Silva','1m2',1);
INSERT INTO alunos (nome, turma, ano) values ('Félix Pereira Rocha','1m3',1);

