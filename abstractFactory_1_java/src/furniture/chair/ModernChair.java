package furniture.chair;

public class ModernChair implements IChair{
    @Override
    public String getDesign() {
        return "This is a Modern chair";
    }

    @Override
    public int howTall() {
        return 3;
    }
}
