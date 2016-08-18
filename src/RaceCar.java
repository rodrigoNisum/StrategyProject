import com.nisum.impl.DrivingFastBehavoiur;

public class RaceCar extends Vehicle{

    public RaceCar(){
        setGoBehaviour(new DrivingFastBehavoiur());
    }
}
