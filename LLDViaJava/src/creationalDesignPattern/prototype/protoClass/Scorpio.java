package creationalDesignPattern.prototype.protoClass;

public class Scorpio  implements IScorpioPrototype ,Cloneable{

    //default engine
    ScorpioEngine engine ;

    //deep copy ke liye
    public Scorpio(){
        this.engine = new ScorpioEngine();
    }
    private Scorpio(ScorpioEngine scorpioEngine){
        this.engine =new ScorpioEngine(scorpioEngine);
    }


    @Override
    public IScorpioPrototype clone() {
        /*try {
            return (Scorpio) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }*/

        /*IScorpioPrototype clonedScorpio = new Scorpio();
        clonedScorpio.setEngine(new ScorpioEngine());
        return clonedScorpio;*/
        IScorpioPrototype clonedScorpio = new Scorpio(this.engine);
        return clonedScorpio;


    }

    @Override
    public void setEngine(ScorpioEngine scorpioEngine) {
             this.engine= engine;
    }

    @Override
    public void start() {
        System.out.println("start ho gyi scorpio");
    }
}
