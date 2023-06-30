package builder_pattern.director;
import builder_pattern.EngineType;
import builder_pattern.builders.Builder;

public class PlaneDirector {
    
    public void buildBiPlane(Builder planeBuilder, String planeName){
        planeBuilder.setModelName(planeName);
        planeBuilder.setEngineType(EngineType.SINGLE_ENGINE);
        planeBuilder.setModelHeight(6);
        planeBuilder.setModelLength(17);
        planeBuilder.setWingSpan(20);
        planeBuilder.setSeats(2);
    }

    public void buildCommericalBoeingPlane(Builder planeBuilder){
        planeBuilder.setModelName("Boeing-737");
        planeBuilder.setEngineType(EngineType.MULTI_ENGINE);
        planeBuilder.setModelHeight(41);
        planeBuilder.setModelLength(33.6f);
        planeBuilder.setWingSpan(117.5f);
        planeBuilder.setSeats(160);
    }
}
