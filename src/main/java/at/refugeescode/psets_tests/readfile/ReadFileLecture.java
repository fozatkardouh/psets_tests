package main.readfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadFileLecture {

    public static void main(String[] args) {
        try {
            String filePath = "src/oop/readfile/names.txt";
            Path path = Paths.get(filePath);
            System.out.println(path.toAbsolutePath());



            List<String> lines = Files.readAllLines(path);

            List<Participant> participants = new ArrayList<>();

            // refactor

            for (String line : lines) {
                String[] names = line.split(", ");
                for (String name : names) {
                    Participant participant = new Participant();
                    participant.setName(name);
                    participants.add(participant);
                }
            }

            participants.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Farah took care of this. There is no such file");
            e.printStackTrace();
        }
    }

}
