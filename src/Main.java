public class Main {

    public static void main(String[] args) {

        Vehicle helicopter = new Helicopter();
        Vehicle raceCar = new RaceCar();
        Vehicle electricBici = new ElectricBici();

        helicopter.go();
        raceCar.go();
        electricBici.go();

    }
}
