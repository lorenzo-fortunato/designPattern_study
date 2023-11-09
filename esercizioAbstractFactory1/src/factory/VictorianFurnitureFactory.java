package factory;

import furniture.bed.IBed;
import furniture.bed.VictorianBed;
import furniture.chair.IChair;
import furniture.chair.VictorianChair;
import furniture.sofa.ISofa;
import furniture.sofa.VictorianSofa;

public class VictorianFurnitureFactory extends AbstractFurnitureFactory{
    @Override
    public IBed createBed() {
        return new VictorianBed();
    }

    @Override
    public IChair createChair() {
        return new VictorianChair();
    }

    @Override
    public ISofa createSofa() {
        return new VictorianSofa();
    }
}
