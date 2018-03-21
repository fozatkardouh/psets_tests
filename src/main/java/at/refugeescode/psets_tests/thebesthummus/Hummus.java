package main.thebesthummus;

public class Hummus {

    private Yogurt yogurt;
    private Chickpeas chickpeas;
    private Salt salt;
    private Tahina tahina;
    private Oil oil;
    private Lemon lemon;
    private Pepper pepper;
    private Kymun kymun;
    private Garlic garlic;

    public Hummus(Yogurt yogurt, Chickpeas chickpeas, Salt salt, Tahina tahina, Oil oil, Lemon lemon, Pepper pepper, Kymun kymun, Garlic garlic) {
        this.yogurt = yogurt;
        this.chickpeas = chickpeas;
        this.salt = salt;
        this.tahina = tahina;
        this.oil = oil;
        this.lemon = lemon;
        this.pepper = pepper;
        this.kymun = kymun;
        this.garlic = garlic;
    }

    public void eat() {
        StringBuilder builder = new StringBuilder();

        builder.append("This great Hummus tastes amazing. ");
        builder.append("These are the ingredients that it contains:");
        builder.append("\n");
        builder.append(yogurt.getName());
        builder.append(" number of spoons: ");
        builder.append(yogurt.getNumberOfSpoons());
        builder.append("\n");
        builder.append(chickpeas.getName());
        builder.append(" kilos: ");
        builder.append(chickpeas.getKilos());
        builder.append("\nAnd so much more...");

        System.out.println(builder.toString());
    }
}
