package furniture.chair;

public class VictorianChair implements IChair{
    @Override
    public String getDesign() {
        return "Victorian chair";
    }

    @Override
    public int howTall() {
        return 2;
    }
}
