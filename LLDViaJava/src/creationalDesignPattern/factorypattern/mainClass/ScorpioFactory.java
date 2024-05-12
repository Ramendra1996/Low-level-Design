package creationalDesignPattern.factorypattern.mainClass;

public class ScorpioFactory {

    public Scorpio crateScorpio(char type){

         switch (type){

             case 'N':
                 return new ScorpioN();
             case 'C':
                 return  new ScorpioClassic();
             default:
                  return  new Scorpio();
         }
    }
    //simpleFactory
}
