package _04Nested_vlozenie._01StaticNested;

public class Car {

    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    void method(){
        System.out.println(Engine.countOfObject);
        Engine engine = new Engine(200);
        System.out.println(engine.horsePower);
    }

    public static class Engine {
       private int horsePower;
        static int countOfObject;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            countOfObject++;
        }

        @Override
        public String toString() {
            return "My Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Demo {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(150);
        System.out.println(engine);
        Car car = new Car("red", 2, engine);
        System.out.println(car);
        car.method();
    }
}
