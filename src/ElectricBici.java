import com.nisum.impl.DrivingBehavoiur;

public class ElectricBici extends Vehicle{


    public ElectricBici(){
        setGoBehaviour(new DrivingBehavoiur());

    }


}
