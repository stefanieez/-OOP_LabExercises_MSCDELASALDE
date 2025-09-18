public class TransportationTester {
    public static void main(String[] args) {
        // Air Transport
        Transportation heli = new Helicopter();
        Transportation plane = new Airplane();
        Transportation shuttle = new SpaceShuttle();

        // Land Transport
        Transportation truck = new Truck();
        Transportation suv = new SUV();
        Transportation tricycle = new Tricycle();
        Transportation motor = new Motorcycle();
        Transportation kariton = new Kariton();

        // Water Transport
        Transportation boat = new Boat();
        Transportation ship = new Ship();

        // Test each
        heli.move();
        plane.move();
        shuttle.move();
        truck.move();
        suv.move();
        tricycle.move();
        motor.move();
        kariton.move();
        boat.move();
        ship.move();
    }
}
