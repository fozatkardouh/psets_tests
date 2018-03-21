package main.thebesthummus;

public class Cook {

    public Hummus prepareTheBestHummus(
            Yogurt yogurt, Chickpeas chickpeas, Salt salt,
            Tahina tahina, Oil oil, Lemon lemon,
            Pepper pepper, Kymun kymun, Garlic garlic) {

        Hummus hummus = new Hummus(yogurt, chickpeas, salt,
                tahina, oil, lemon,
                pepper, kymun, garlic);

        return hummus;
    }

}
