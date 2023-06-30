package builder_pattern.builders;

import builder_pattern.EngineType;

public interface Builder {
    public void setModelName(String modelName);
    public void setModelWidth(float modelWidth);
    public void setModelLength(float modelLength);
    public void setModelHeight(float modelHeight);
    public void setEngineType(EngineType engineType);
    public void setWingSpan(float wingSpan);
    public void setSeats(int seats);
}
