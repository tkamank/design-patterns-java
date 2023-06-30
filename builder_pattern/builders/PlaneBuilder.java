package builder_pattern.builders;

import builder_pattern.EngineType;
import builder_pattern.Plane;

public class PlaneBuilder implements Builder {

    private String modelName;
    private EngineType engineType;
    private float modelWidth;
    private float modelLength;
    private float modelHeight;
    private float wingSpan;
    private int seats;
    @Override
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    @Override
    public void setModelWidth(float modelWidth) {
        this.modelWidth = modelWidth;
    }
    @Override
    public void setModelLength(float modelLength) {
        this.modelLength = modelLength;
    }
    @Override
    public void setModelHeight(float modelHeight) {
        this.modelHeight = modelHeight;
    }
    @Override
    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }
    @Override
    public void setWingSpan(float wingSpan) {
        this.wingSpan = wingSpan;
    }
    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }
    public Plane build(){
        return new Plane(modelName, engineType, modelHeight, modelLength, modelHeight, modelWidth, wingSpan, seats);
    }
}
