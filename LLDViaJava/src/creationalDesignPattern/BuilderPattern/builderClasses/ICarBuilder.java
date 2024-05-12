package creationalDesignPattern.BuilderPattern.builderClasses;

import creationalDesignPattern.BuilderPattern.Models.ICar;

public interface ICarBuilder {

    public void buildEngine();

    public void buildChassis();

    public void buildType();

    public void buildBodyShell();

   //below method returns the final object
    public ICar build();
}
