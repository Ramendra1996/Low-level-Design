package creationalDesignPattern.BuilderPattern.builderClasses;

import creationalDesignPattern.BuilderPattern.Models.Fortuner;
import creationalDesignPattern.BuilderPattern.Models.ICar;

public class FortunerBuilder implements ICarBuilder{

    Fortuner f1;


    @Override
    public void buildEngine() {
        System.out.println("Fortuner engine getting inserted");
    }

    @Override
    public void buildChassis() {
        System.out.println("Fortuner chassis getting inserted");
    }

    @Override
    public void buildType() {
        System.out.println("Fortuner Type getting inserted");
    }

    @Override
    public void buildBodyShell() {
        System.out.println("Fortuner body getting inserted");
    }

    @Override
    public ICar build() {
        System.out.println("Fortuner is ready");
        return f1;
    }
}
