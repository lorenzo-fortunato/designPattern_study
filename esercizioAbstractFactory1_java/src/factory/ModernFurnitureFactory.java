package factory;

import furniture.bed.IBed;
import furniture.bed.ModernBed;
import furniture.chair.IChair;
import furniture.chair.ModernChair;
import furniture.sofa.ISofa;
import furniture.sofa.ModernSofa;

public class ModernFurnitureFactory extends AbstractFurnitureFactory{
    @Override
    public IBed createBed() {
        return new ModernBed();
    }

    @Override
    public IChair createChair() {
        return new ModernChair();
    }

    @Override
    public ISofa createSofa() {
        return new ModernSofa();
    }
}
