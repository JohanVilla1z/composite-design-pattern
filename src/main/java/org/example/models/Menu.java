package org.example.models;

import org.example.services.interfaces.IMenuComponent;

import java.util.ArrayList;
import java.util.List;

public class Menu implements IMenuComponent {

    private String name;
    private List<IMenuComponent> components;

    public Menu(String name) {
        this.name = name;
        this.components = new ArrayList<IMenuComponent>();

    }

    @Override
    public void showPrice() {
        System.out.println("Menu: " + name);
        for (IMenuComponent component : components) {
            component.showPrice();
        }
    }

    @Override
    public Float getPrice() {
        Float price = 0.0f;
        for (IMenuComponent component : components) {
            price += component.getPrice();
        }
        return price;
    }

    public void addComponent(IMenuComponent component) {
        components.add(component);
    }

    public void showTotal() {
        System.out.println("Pecio total del menu " +getName() + ": $" + getPrice());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<IMenuComponent> getComponents() {
        return components;
    }

    public void setComponents(List<IMenuComponent> components) {
        this.components = components;
    }
}