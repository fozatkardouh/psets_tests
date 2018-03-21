package main.polymorphism.examples.developer.developers;

public class PhpDeveloper extends Developer {

    // forced by his parent to implement this method
    @Override
    public String getProgrammingLanguage() {
        return "PHP";
    }
}
