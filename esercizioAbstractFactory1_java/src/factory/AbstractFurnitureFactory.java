package factory;

import furniture.bed.IBed;
import furniture.chair.IChair;
import furniture.sofa.ISofa;

public abstract class AbstractFurnitureFactory {
    public abstract IBed createBed();
    public abstract IChair createChair();
    public abstract ISofa createSofa();

    public static AbstractFurnitureFactory getFactory(String whichFactory) {
        if (whichFactory.equalsIgnoreCase("victorian")) {
            return new VictorianFurnitureFactory();
        }
        return new ModernFurnitureFactory();

    }

}
