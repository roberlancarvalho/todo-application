package com.roberlan.todo.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roberlan.todo.domain.Todo;
import com.roberlan.todo.repositories.TodoRepository;

@Service
public class DBService {

	@Autowired
	private TodoRepository todoRepository;

	public void instanciaBaseDeDados() throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Todo t1 = new Todo(null, "Estudos", "String Boot 2 e Angular 11",
				sdf.parse("25/03/2022"), false);
		Todo t2 = new Todo(null, "Exercícios", "Fazer 30 minutos de exercícios",
				sdf.parse("25/03/2022"), true);
		Todo t3 = new Todo(null, "Trabalho", "Trabalhar por 6 horas", 
				sdf.parse("25/03/2022"), false);
		Todo t4 = new Todo(null, "Xadrez", "Jogar xadrez por 20 minutos",
				sdf.parse("30/05/2021"), true);

		todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4));
	}
}
