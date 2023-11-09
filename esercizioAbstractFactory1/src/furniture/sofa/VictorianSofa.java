package furniture.sofa;

public class VictorianSofa implements ISofa{
    @Override
    public String getDesign() {
        return "Victorian sofa";
    }

    @Override
    public int howManyPeopleCanHold() {
        return 2;
    }
}
