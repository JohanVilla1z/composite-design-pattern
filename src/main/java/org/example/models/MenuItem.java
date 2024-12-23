package org.example.models;

import org.example.services.interfaces.IMenuComponent;

public class MenuItem implements IMenuComponent {
    private String name;
    private Float price;

    public MenuItem(String name, Float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showPrice() {
        System.out.println("Item: " + name + " - $" + price);
    }

    @Override
    public Float getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}