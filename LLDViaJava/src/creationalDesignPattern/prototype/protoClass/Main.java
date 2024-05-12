package creationalDesignPattern.prototype.protoClass;

public class Main {
    public static void main(String[] args) {

        //create a prototype
        IScorpioPrototype prototype = new Scorpio();

        //create a Scorpio N
        IScorpioPrototype scorpioN = prototype.clone();
        scorpioN.setEngine(new ScorpioNEngine());
        //create a Scorpio Classic
        IScorpioPrototype scorpioClassic = prototype.clone();
        scorpioClassic.setEngine(new ScorpioClassicEngine());


    }
}
