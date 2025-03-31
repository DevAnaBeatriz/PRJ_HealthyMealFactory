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
 * Fábrica concreta para dieta low carb.
 * Cria pratos e sobremesas com restrição de carboidratos.
 */
public class LowCarbMealFactory implements MealFactory {
    @Override
    public MainDish createMainDish() {
        return new LowCarbMainDish();
    }

    @Override
    public Dessert createDessert() {
        return new LowCarbDessert();
    }
}

