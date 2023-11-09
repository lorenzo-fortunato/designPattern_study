package furniture.bed;

public class ModernBed implements IBed{
    @Override
    public String design() {
        return "This is a Modern bed";
    }

    @Override
    public Comfortable howConfortable() {
        return Comfortable.VERY_CONFORTABLE;
    }
}
