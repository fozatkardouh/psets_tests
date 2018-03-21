package main.polymorphism.examples.developer;

import main.polymorphism.examples.developer.developers.PhpDeveloper;
import main.polymorphism.examples.developer.developers.Developer;
import main.polymorphism.examples.developer.developers.JavaDeveloper;

public class DeveloperMain {

    public static void main(String[] args) {
        Developer phpDeveloper = new PhpDeveloper();
        Developer javaDeveloper = new JavaDeveloper();

        // this is not possible because the visibility is protected
        // and protected visibility means "only shared among its children and same package"
//        System.out.println("This developer can code: " + phpDeveloper.getProgrammingLanguage());
//        System.out.println("This developer can code: " + javaDeveloper.getProgrammingLanguage());

        // the method "code" is inherited from the abstract class Developer
        phpDeveloper.code();
        javaDeveloper.code();
    }

}
