package StructuralDesignPattern.CompositePattern.compositeClasses;

public interface UIComponent {

    void  draw();
    void  add(UIComponent component);
    void remove(UIComponent component);

}
