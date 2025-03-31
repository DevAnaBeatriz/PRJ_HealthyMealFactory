/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


import factories.*;
import products.*;
/**
 *
 * @author Ana Beatriz
 */


/**
 * Classe cliente que depende apenas da interface MealFactory.
 * Não há conhecimento direto dos produtos concretos.
 * 
 * GoF: Consistência entre os produtos relacionados.
 * Refactoring Guru: Criação desacoplada e baseada em contexto.
 */

public class PRJ_healthyMealFactory {

public static void main(String[] args) {
        MealFactory factory;

        String dieta = "vegan"; // ou "vegan"

        if (dieta.equalsIgnoreCase("vegan")) {
            factory = new VeganMealFactory();
        } else {
            factory = new LowCarbMealFactory();
        }

        // A aplicação está desacoplada das classes concretas.
        MainDish prato = factory.createMainDish();
        Dessert sobremesa = factory.createDessert();

        prato.serve();
        sobremesa.serve();
    }
}





