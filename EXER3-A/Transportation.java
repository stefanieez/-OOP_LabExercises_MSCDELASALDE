class Transportation {
    public void move() {
        System.out.println("This is a mode of transportation.");
    }
}

class AirTransport extends Transportation {
    @Override
    public void move() {
        System.out.println("Air transport moves through the sky.");
    }
}

class Helicopter extends AirTransport {
    @Override
    public void move() {
        System.out.println("Helicopter hovers and flies vertically.");
    }
}

class Airplane extends AirTransport {
    @Override
    public void move() {
        System.out.println("Airplane flies long distances in the sky.");
    }
}

class SpaceShuttle extends AirTransport {
    @Override
    public void move() {
        System.out.println("Space Shuttle travels into space.");
    }
}

// Subclass - Land
class LandTransport extends Transportation {
    @Override
    public void move() {
        System.out.println("Land transport moves on roads or rails.");
    }
}

class Truck extends LandTransport {
    @Override
    public void move() {
        System.out.println("Truck carries heavy loads on land.");
    }
}

class SUV extends LandTransport {
    @Override
    public void move() {
        System.out.println("SUV is a passenger vehicle for rough terrains.");
    }
}

class Tricycle extends LandTransport {
    @Override
    public void move() {
        System.out.println("Tricycle is a three-wheeled vehicle for short distances.");
    }
}

class Motorcycle extends LandTransport {
    @Override
    public void move() {
        System.out.println("Motorcycle is a two-wheeled fast transport.");
    }
}

class Kariton extends LandTransport {
    @Override
    public void move() {
        System.out.println("Kariton is a hand-pulled cart.");
    }
}

// Subclass - Water
class WaterTransport extends Transportation {
    @Override
    public void move() {
        System.out.println("Water transport moves through rivers, lakes, or oceans.");
    }
}

class Boat extends WaterTransport {
    @Override
    public void move() {
        System.out.println("Boat is a small vessel for short water travel.");
    }
}

class Ship extends WaterTransport {
    @Override
    public void move() {
        System.out.println("Ship is a large vessel for long sea journeys.");
    }
}
