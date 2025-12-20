package CreationalDesign.BuilderPattern;

public class Car {
    private String engine;
    private int wheels;
    private int seats;
    private String colour;
    private boolean sunroof;
    private boolean navigationSystem;

    public Car() {
    }

    public Car(String engine, int wheels, int seats, String colour, boolean sunroof, boolean navigationSystem) {
        this.engine = engine;
        this.wheels = wheels;
        this.seats = seats;
        this.colour = colour;
        this.sunroof = sunroof;
        this.navigationSystem = navigationSystem;
    }


    Car(CarBuilder builder){
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.seats = builder.seats;
        this.colour = builder.colour;
        this.sunroof = builder.sunroof;
        this.navigationSystem = builder.navigationSystem;
    }

    public String getColour() {
        return colour;
    }

    public String getEngine() {
        return engine;
    }

    public boolean isNavigationSystem() {
        return navigationSystem;
    }

    public int getSeats() {
        return seats;
    }

    public boolean isSunroof() {
        return sunroof;
    }

    public int getWheels() {
        return wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", engine='" + engine + '\'' +
                ", wheels=" + wheels +
                ", seats=" + seats +
                ", sunroof=" + sunroof +
                ", navigationSystem=" + navigationSystem +
                '}';
    }

    public static   class  CarBuilder {
        private String engine;
        private int wheels = 4;
        private int seats = 5;
        private String  colour = "Black";
        private boolean sunroof = false;
        private boolean navigationSystem = false;

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }
        public  CarBuilder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public CarBuilder setColour(String colour) {
            this.colour = colour;
            return this;
        }
        public CarBuilder setSunroof(boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }
        public CarBuilder setNavigationSystem(boolean navigationSystem) {
            this.navigationSystem = navigationSystem;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

}
