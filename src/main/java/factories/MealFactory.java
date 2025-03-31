/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factories;

import products.MainDish;
import products.Dessert;
/**
 *
 * @author Ana Beatriz
 */


/**
 * Padrão Abstract Factory (GoF): 
 * Esta interface define a criação de famílias de objetos relacionados: MainDish e Dessert.
 * 
 * Refactoring Guru: 
 * Permite encapsular a criação e facilitar a troca da lógica de criação com base em contexto (dieta).
 */


public interface MealFactory {
    MainDish createMainDish();
    Dessert createDessert();
}
