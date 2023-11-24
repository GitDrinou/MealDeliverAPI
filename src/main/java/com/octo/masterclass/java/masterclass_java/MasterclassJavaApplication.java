package com.octo.masterclass.java.masterclass_java;

import com.octo.masterclass.java.masterclass_java.rerpository.FormuleRepository;
import com.octo.masterclass.java.masterclass_java.rerpository.IngredientRepository;
import com.octo.masterclass.java.masterclass_java.rerpository.PlatRepository;
import com.octo.masterclass.java.masterclass_java.persistence.Plat;
import com.octo.masterclass.java.masterclass_java.persistence.Formule;
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
	@Autowired
	IngredientRepository ingredientRepository;
	@Autowired
	FormuleRepository formuleRepository;

	@Override
	public void run(String... args) throws Exception {

		Ingredient tomate = new Ingredient("tomate", false, 0);
		Ingredient echalote = new Ingredient("Echalotes", false, 1);
		Ingredient parmesan = new Ingredient("Parmigiano Reggiano", false, 0);
		Ingredient riz = new Ingredient("Riz", false, 0);
		Ingredient champignon = new Ingredient("Champignon", true, 0);
		Ingredient farine = new Ingredient("Farine", true, 0);
		Ingredient mozzarella = new Ingredient("Mozzarella", true, 0);
		Ingredient sauceTomate = new Ingredient("Sauce tomate", false, 0);
		Ingredient basilic = new Ingredient("Basilic", false, 0);
		Ingredient huileOlive = new Ingredient("Huile d'olive", false, 0);
		Ingredient banane = new Ingredient("Banane", false, 0);
		Ingredient orange = new Ingredient("Orange", false, 0);
		Ingredient pomme = new Ingredient("Pomme", false, 0);
		Ingredient framboise = new Ingredient("Framboise", false, 0);

		List<Ingredient> tousMesIngredients = List.of(tomate, echalote, parmesan,riz, champignon, farine, mozzarella, sauceTomate, basilic, banane, orange, pomme, framboise);

		Plat bruschetta = new Plat("bruschetta", 5.90, 5, List.of(tomate,echalote,parmesan));
		Plat risotto = new Plat("Risotto al Funghi",14.80, 45, List.of(riz, champignon));
		Plat pizzaMarguerita = new Plat("Margherita", 8.00, 10, List.of(farine, sauceTomate, mozzarella, basilic, huileOlive));
		Plat insalataFrutti = new Plat("Insalata di frutti", 4.60, 5, List.of(banane, orange, pomme, framboise));

		List<Plat> tousMesPlats = List.of(bruschetta, risotto, pizzaMarguerita, insalataFrutti);

		Formule midi = new Formule("Midi", List.of(bruschetta, risotto));
		Formule pizza = new Formule("Pizza", List.of(pizzaMarguerita, insalataFrutti));

		List<Formule> toutesMesFormules = List.of(midi, pizza);


		ingredientRepository.saveAll(tousMesIngredients);
		platRepository.saveAll(tousMesPlats);
		formuleRepository.saveAll(toutesMesFormules);
	}
}
