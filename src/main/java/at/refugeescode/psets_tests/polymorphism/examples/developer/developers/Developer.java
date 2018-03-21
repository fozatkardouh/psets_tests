package main.polymorphism.examples.developer.developers;

public abstract class Developer {

    // this method will be inherited by its children and also visible to everyone
    public void code() {
        System.out.println("I'm going to code in: " + getProgrammingLanguage());
    }

    // requests its children to provide the programming language
    // forces each class that extends from this one to implement this method
    protected abstract String getProgrammingLanguage();

}
