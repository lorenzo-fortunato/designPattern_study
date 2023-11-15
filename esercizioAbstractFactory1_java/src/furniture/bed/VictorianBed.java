package furniture.bed;

public class VictorianBed implements IBed{
    @Override
    public String design() {
        return "Victorian Bed for Kings!";
    }

    @Override
    public Comfortable howConfortable() {
        return Comfortable.NOT_CONFORTABLE;
    }
}
