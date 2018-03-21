package at.refugeescode.psets_tests.inheritance.animalstalking.version1;

public class Cat extends Pet {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void talk() {
        System.out.println(getName() + " says miau");
    }
}
