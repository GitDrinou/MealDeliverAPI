package com.octo.masterclass.java.masterclass_java;

import com.octo.masterclass.java.masterclass_java.persistence.*;
import com.octo.masterclass.java.masterclass_java.rerpository.FormuleRepository;
import com.octo.masterclass.java.masterclass_java.rerpository.IngredientRepository;
import com.octo.masterclass.java.masterclass_java.rerpository.PlatRepository;
import com.octo.masterclass.java.masterclass_java.persistence.Dessert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
		Ingredient salade = new Ingredient("Salade", false, 0);
		Ingredient anchois = new Ingredient("Filets d'anchois", false, 0);
		Ingredient croutons = new Ingredient("Croûtons", true, 0);
		Ingredient riz = new Ingredient("Riz", false, 0);
		Ingredient champignon = new Ingredient("Champignon", true, 0);
		Ingredient farine = new Ingredient("Farine", true, 0);
		Ingredient mozzarella = new Ingredient("Mozzarella", true, 0);
		Ingredient sauceTomate = new Ingredient("Sauce tomate", false, 0);
		Ingredient basilic = new Ingredient("Basilic", false, 0);
		Ingredient huileOlive = new Ingredient("Huile d'olive", false, 0);
		Ingredient poulet = new Ingredient("Filet de poulet", false, 0);
		Ingredient oeuf = new Ingredient("Oeuf", true, 0);
		Ingredient bacon= new Ingredient("Bacon", false, 0);
		Ingredient calamar = new Ingredient("Calamar", false, 0);
		Ingredient poulpe= new Ingredient("Poulpe", false, 0);
		Ingredient ail = new Ingredient("Ail", false, 0);
		Ingredient patate = new Ingredient("Pomme de terre", false, 0);
		Ingredient oignonRouge = new Ingredient("Oignon rouge", false, 1);
		Ingredient balsamique = new Ingredient("Vinaigre balsamique", false, 0);
		Ingredient sauceCesar = new Ingredient("Sauce césar", false, 0);
		Ingredient sauceAioli = new Ingredient("Sauce aïoli", false, 0);
		Ingredient banane = new Ingredient("Banane", false, 0);
		Ingredient orange = new Ingredient("Orange", false, 0);
		Ingredient pomme = new Ingredient("Pomme", false, 0);
		Ingredient framboise = new Ingredient("Framboise", false, 0);
		Ingredient creme = new Ingredient("Crème fraiche", false, 0);
		Ingredient vanille = new Ingredient("Vanille", false, 0);

		List<Ingredient> tousMesIngredients = List.of(tomate, echalote, parmesan,riz, champignon, farine, mozzarella, sauceTomate, basilic, banane, orange, pomme, framboise);

		Plat bruschetta = new Entree("bruschetta", 5.90, 5, List.of(tomate,echalote,parmesan), true);
		Plat cesar = new Entree("Insalata César", 11.80, 10, List.of(poulet, oeuf, bacon, salade, parmesan, tomate, croutons, sauceCesar,anchois), true);
		Plat calamari = new Entree("Calamari Fritti Alla Romana", 12.80, 30, List.of(calamar, sauceAioli), false);
		Plat risotto = new Principal("Risotto al Funghi",14.80, 45, List.of(riz, champignon), false);
		Plat pizzaMarguerita = new Principal("Margherita", 8.00, 10, List.of(farine, sauceTomate, mozzarella, basilic, huileOlive), false);
		Plat insalataDiPolpi = new Principal("Insalata di Polpi",16.00, 45, List.of(poulpe, ail, salade, patate, tomate, oignonRouge, huileOlive, balsamique, basilic), true);
		Plat insalataFrutti = new Dessert("Insalata di frutti", 4.60, 5, List.of(banane, orange, pomme, framboise));
		Plat pannacotta = new Dessert("Panacotta et framboise", 5.60, 5, List.of(creme, vanille, framboise));

		List<Plat> tousMesPlats = List.of(bruschetta, cesar, calamari, insalataDiPolpi, risotto, pizzaMarguerita, insalataFrutti, pannacotta);

		Formule midi = new Formule("Midi", List.of(bruschetta, risotto));
		Formule pizza = new Formule("Pizza", List.of(pizzaMarguerita, insalataFrutti));

		List<Formule> toutesMesFormules = List.of(midi, pizza);

		ingredientRepository.saveAll(tousMesIngredients);
		platRepository.saveAll(tousMesPlats);
		formuleRepository.saveAll(toutesMesFormules);
	}
}
