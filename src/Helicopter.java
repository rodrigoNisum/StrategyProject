import com.nisum.impl.FlyingBehavoiur;

public class Helicopter extends Vehicle {

    public Helicopter(){
      setGoBehaviour(new FlyingBehavoiur());
  }
}
