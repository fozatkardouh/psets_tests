package main.polymorphism.examples.developer.developers;

public class JavaDeveloper extends Developer{

    // forced by his parent to implement this method
    @Override
    public String getProgrammingLanguage() {
        return "Java";
    }
}
