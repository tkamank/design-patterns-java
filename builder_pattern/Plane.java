package builder_pattern;

public class Plane {
    private final String model;
    private final float heightFt;
    private final float lengthFt;
    private final float weight;
    private final float width;
    private final float wingSpanFt;
    private EngineType engineType;
    private final int seats;
    private double fuel = 0.0;


    public Plane(String planeModel, EngineType engineType, float heightFt, float lengthFt, float weight, float width, float wingSpanFt, int seats){
        this.model = planeModel;
        this.engineType = engineType;
        this.heightFt = heightFt;
        this.lengthFt = lengthFt;
        this.weight = weight;
        this.width = width;
        this.wingSpanFt = wingSpanFt;
        this.seats = seats;
    }

    public String getModel() {
        return model;
    }

    public EngineType getEngineType(){
        return engineType;
    }

    public float getHeight(){
        return heightFt;
    }

    public float lengthFt(){
        return lengthFt;
    }

    public float getWeight(){
        return weight;
    }

    public float getWidth(){
        return width;
    }

    public float getWingSpan(){
        return wingSpanFt;
    }

    public float getSeats(){
        return seats;
    }

    public void getFuel(){
        System.out.println("Current fuel remaining: " + fuel);
    }

    public void setFuel(double fuel){
        this.fuel = fuel;
    }

}