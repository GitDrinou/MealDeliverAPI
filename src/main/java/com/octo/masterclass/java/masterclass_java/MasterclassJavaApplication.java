package com.octo.masterclass.java.masterclass_java;

import com.octo.masterclass.java.masterclass_java.rerpository.PlatRepository;
import com.octo.masterclass.java.masterclass_java.persistence.Plat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.octo.masterclass.java.masterclass_java.persistence.Ingredient;

import java.util.List;

@SpringBootApplication
public class MasterclassJavaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MasterclassJavaApplication.class, args);
	}

	@Autowired
	PlatRepository platRepository;

	@Override
	public void run(String... args) throws Exception {
		Ingredient tomate = new Ingredient("tomate", false, 0);
		Ingredient echalote = new Ingredient("Echalotes", false, 1);
		Ingredient parmesan = new Ingredient("Parmigiano Reggiano", false, 0);
		Plat bruschetta = new Plat("bruschetta", 5.90, 1, List.of(tomate,echalote,parmesan));

		platRepository.save(bruschetta);
	}
}
