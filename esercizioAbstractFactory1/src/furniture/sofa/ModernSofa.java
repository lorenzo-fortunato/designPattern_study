package furniture.sofa;

public class ModernSofa implements ISofa{
    @Override
    public String getDesign() {
        return "This is Modern sofa";
    }

    @Override
    public int howManyPeopleCanHold() {
        return 5;
    }
}
