package main.optional;

public class Pizza {

    private String type;

    public Pizza(String type) {
        this.type = type;
    }

    public void eat(){
        System.out.println("Pizza type: " + type);
    }

}
