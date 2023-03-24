package org.example.oops;
//Composition- HAS A relationship between objects
class Engine{
    private String engineName;

    public void setEngineName(String getEngineName) {
        this.engineName=getEngineName;
    }

    public String getEngineName() {
        return engineName;
    }
}
public class Car1 {
    private String color;
    private Engine engine;
    
    public Car1(String color, String engineName) {
        this.engine = new Engine();
        engine.setEngineName(engineName);
        this.color = color;
    }
    public String getEngineName() {
        return engine.getEngineName();
    }

    public static void main(String[] args) {
        Car1 car=new Car1("black","abc engine");
        System.out.println(car.getEngineName());
        System.out.println(car.color);
    }
}

