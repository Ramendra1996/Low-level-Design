package StructuralDesignPattern.CompositePattern.compositeClasses;

import java.util.ArrayList;
import java.util.List;

public class Menu  implements  UIComponent{
    // menu k ander bhahut share parts ho skte h
    //iske ander k saare parts ko main-> children kehrea hu

    List<UIComponent>children = new ArrayList<>();


    @Override
    public void draw() {
        for(UIComponent cmp: children){
            cmp.draw();
        }
    }

    @Override
    public void add(UIComponent component) {
        children.add(component);
    }

    @Override
    public void remove(UIComponent component) {
        children.add(component);
    }
}
