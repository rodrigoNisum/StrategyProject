import com.nisum.interfaces.GoBehaviour;

public class Vehicle {

    GoBehaviour goBehaviour;

    public Vehicle(){}

    public void setGoBehaviour(GoBehaviour newGoBehaviour){
        goBehaviour = newGoBehaviour;
    }
    public void go(){
       goBehaviour.go();
    }



}
