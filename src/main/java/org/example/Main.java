package org.example;

import org.example.models.MenuItem;
import org.example.models.Menu;
import org.example.services.interfaces.IMenuComponent;

public class Main {
    public static void main(String[] args) {

        IMenuComponent fries = new MenuItem("Papas fritas", 2.0f);
        IMenuComponent chickenBurger = new MenuItem("Hamburguesa de pollo", 5.0f);
        IMenuComponent miniBurger = new MenuItem("Mini Burger", 3.5f);
        IMenuComponent coke = new MenuItem("Coca Cola", 1.0f);
        IMenuComponent hotDog = new MenuItem("Hot Dog", 3.0f);
        IMenuComponent appleJuice = new MenuItem("Jugo de manzana", 0.7f);
        IMenuComponent lemonade = new MenuItem("Limonada fresca", 0.5f);

        Menu kidsMenu = new Menu("Menu infantil");
        Menu hotDogMenu = new Menu("Hot dog Combo");
        Menu burgerMenu = new Menu("Burger Combo");

        Menu fastFoodMenu = new Menu("Comida rapida");

        kidsMenu.addComponent(fries);
        kidsMenu.addComponent(miniBurger);
        kidsMenu.addComponent(appleJuice);

        hotDogMenu.addComponent(hotDog);
        hotDogMenu.addComponent(coke);

        burgerMenu.addComponent(chickenBurger);
        burgerMenu.addComponent(hotDogMenu);
        burgerMenu.addComponent(lemonade);

        fastFoodMenu.addComponent(kidsMenu);
        fastFoodMenu.addComponent(burgerMenu);
        fastFoodMenu.addComponent(hotDogMenu);

        fastFoodMenu.showPrice();
        fastFoodMenu.showTotal();

    }
}