import unitsMethod.Factory;
import unitsMethod.Unit;
import unitsMethod.UnitFactory;
import unitsMethod.UnitType;

public class Main {
    public static void main(String[] args) {
        Factory factory = new UnitFactory();

        Unit tank = factory.createUnit(UnitType.TANK);
        Unit infantryman = factory.createUnit(UnitType.RIFLEMAN);
    }
}
