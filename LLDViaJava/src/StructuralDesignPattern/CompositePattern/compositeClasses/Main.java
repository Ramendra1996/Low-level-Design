package StructuralDesignPattern.CompositePattern.compositeClasses;

public class Main {
    public static void main(String[] args) {

        UIComponent uiComponent = new Menu();
        uiComponent.add(new Button());
        uiComponent.add(new Button());
        uiComponent.add(new Button());
        uiComponent.draw();
    }
}
