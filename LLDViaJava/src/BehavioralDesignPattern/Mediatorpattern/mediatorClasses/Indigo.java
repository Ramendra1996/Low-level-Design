package BehavioralDesignPattern.Mediatorpattern.mediatorClasses;

public class Indigo  implements IAircraft{

    ATCTower atcTower;
    Indigo(ATCTower atcTower){
     this.atcTower = atcTower;
    }

    //khud se land ko call naho karega aircarfy , kyuki  permission needed
    @Override
    public void land() {
        System.out.println("Mahendra Indigo land");
    }
    //permission ATC se

    public void  requestPermissionForLanding(){
        //ATC Tower se permission
        System.out.println("calling for ATC Tower");
      atcTower.requestToLand(this);
    }
}
