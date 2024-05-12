package creationalDesignPattern.BuilderPattern.builderClasses;

import creationalDesignPattern.BuilderPattern.Models.ICar;
import creationalDesignPattern.BuilderPattern.Models.Scorpio;

public class ScorpioBuilder implements  ICarBuilder {

    Scorpio s1;

    @Override
    public void buildEngine() {
        System.out.println("Scorpio engine getting inserted");
    }

    @Override
    public void buildChassis() {
        System.out.println("Scorpio chassis getting inserted");
    }

    @Override
    public void buildType() {
        System.out.println("Scorpio Type getting inserted");
    }

    @Override
    public void buildBodyShell() {
        System.out.println("Scorpio body getting inserted");
    }

    @Override
    public ICar build() {
        System.out.println("Scorpio is ready");
        return s1;
    }
}
