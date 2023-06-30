package builder_pattern;
import builder_pattern.builders.Builder;
import builder_pattern.builders.PlaneBuilder;
import builder_pattern.director.PlaneDirector;
public class BuilderPatternDemo {
    
    public static void main(String[] args){
        PlaneDirector director = new PlaneDirector();
        PlaneBuilder builder = new PlaneBuilder();

        //Build biplane
        director.buildBiPlane(builder, "Cessna-172");
        Plane yellowCessna = builder.build();
        //Build commerical plane
        director.buildCommericalBoeingPlane(builder);
        Plane commericalAirPlane = builder.build();

        System.out.println(yellowCessna.getModel() + '\n' + yellowCessna.getEngineType() + '\n' + yellowCessna.getSeats() + '\n');

        System.out.println(commericalAirPlane.getModel() + '\n' + commericalAirPlane.getEngineType() + '\n' + commericalAirPlane.getSeats() + '\n');

    }
}
