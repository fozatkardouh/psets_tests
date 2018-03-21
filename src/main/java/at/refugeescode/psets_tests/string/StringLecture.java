package main.string;

public class StringLecture {

    public static void main(String[] args) {
        String names = "     Ghias, Ali, Nisreen, Sadra, Sarah, Nour  ";
        System.out.println(names);
        // trimming - trim
        String trim = names.trim();
        System.out.println(trim);
        // put all spaces away
        String underscore = trim.replaceAll(" ", "_");
        System.out.println(underscore);

        // don't create Bariables
        // create Variables

        String semicolon = underscore.replaceAll(",_", ";");
        System.out.println(semicolon);

        String uppercase = semicolon.toUpperCase();
        System.out.println(uppercase);
        System.out.println(names);

        // splitting - split
        String[] split = uppercase.split(";");
        System.out.println(split);
        for (String part : split) {
            System.out.println(part);
        }
        String join = String.join(" ", split);
        System.out.println(join);
        displayNames();


    }

    private static void displayNames(String... names) {
        System.out.println("");
        System.out.println("");
        for (String name : names) {
            System.out.println(name);
        }
    }

}
