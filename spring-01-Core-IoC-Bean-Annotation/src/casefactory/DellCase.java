package casefactory;

public class DellCase extends Case {


    public DellCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer, powerSupply);
    }

    @Override
    public void pressPowerButton() {
        System.out.println("power button pressed");
    }
}
