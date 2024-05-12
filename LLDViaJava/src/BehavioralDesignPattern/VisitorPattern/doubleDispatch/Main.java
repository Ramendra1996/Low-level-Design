package BehavioralDesignPattern.VisitorPattern.doubleDispatch;

public class Main {
    public static void main(String[] args) {

        Scorpio scorpio= new Scorpio();
        Scorpio advancedScorpio = new AdvancedScorpio();
        StandardBreak standardBreak = new StandardBreak();
        StandardBreak advancedBreak = new AdvancedBreak();
//        scorpio.applyBreak(standardBreak);
//        advancedScorpio.applyBreak(standardBreak);

        scorpio.applyBreak(advancedBreak);
        advancedScorpio.applyBreak(advancedBreak);
    }
}

class StandardBreak{
    public String  playSound(){
        return  "normal break ki sound";
    }
}

class AdvancedBreak extends StandardBreak {
    @Override
    public String playSound(){
      return " adv break ki sound";
    }
}

class AdvancedScorpio extends Scorpio{
    @Override
    public String whatsMyName() {
        return "AdvanceScorpio ";
    }
}


class Scorpio{
    public String whatsMyName(){
        return "Scorpio ";
    }
    public void applyBreak(StandardBreak normalBreak){
        System.out.println(whatsMyName() + "apply normal Break " +normalBreak.playSound());
    }

    public void applyBreak(AdvancedBreak advBreak){
        System.out.println(whatsMyName() + "apply adv break " +advBreak.playSound());
    }
}
