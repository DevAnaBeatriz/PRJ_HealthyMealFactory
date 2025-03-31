/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factories;
import products.*;



/**
 *
 * @author Ana Beatriz
 */


/**
 * Fábrica concreta para dieta vegana.
 * Cria apenas pratos e sobremesas veganos.
 */
public class VeganMealFactory implements MealFactory {
    @Override
    public MainDish createMainDish() {
        return new VeganMainDish();
    }

    @Override
    public Dessert createDessert() {
        return new VeganDessert();
    }
}
