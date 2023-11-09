import factory.AbstractFurnitureFactory;
import factory.ModernFurnitureFactory;

public class MainClass {
    public static void main(String[] args) {
        String factoryParameter = args.length > 0 ? args[0] : "";
        AbstractFurnitureFactory factory = AbstractFurnitureFactory.getFactory(factoryParameter);
        System.out.println(factory.createBed().design());
        System.out.println(factory.createChair().getDesign());
        System.out.println(factory.createSofa().getDesign());
    }
}
