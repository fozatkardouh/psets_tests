package main.thebesthummus;

import java.util.Scanner;

public class HummusApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell me how many spoons of yogurt: ");
        int numberOfSpoons = scanner.nextInt();
        System.out.println("Tell me how many kilos of chickpeas: ");
        int kilosOfChickpeas= scanner.nextInt();

        Yogurt yogurt = new Yogurt(numberOfSpoons);
        Chickpeas chickpeas = new Chickpeas(kilosOfChickpeas);
        Salt salt = new Salt(5);
        Tahina tahina = new Tahina(12);
        Oil oil = new Oil(2);
        Lemon lemon = new Lemon(12);
        Pepper pepper = new Pepper(2);
        Kymun kymun = new Kymun(4);
        Garlic garlic = new Garlic(4);

        Cook cook = new Cook();

        Hummus theBestHummus = cook.prepareTheBestHummus(yogurt, chickpeas, salt, tahina, oil, lemon, pepper, kymun, garlic);
        theBestHummus.eat();
    }

}
