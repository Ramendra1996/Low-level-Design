package creationalDesignPattern.BuilderPattern.builderClasses;

public class Director {

    ICarBuilder carBuilder;

    public  Director(ICarBuilder carBuilder){
        this.carBuilder =carBuilder;
    }

    //instruction

    public  void construct(boolean needed){
        carBuilder.buildEngine();
        if(needed){
            carBuilder.buildType();
        }

        carBuilder.buildChassis();
        carBuilder.buildBodyShell();
    }
}
