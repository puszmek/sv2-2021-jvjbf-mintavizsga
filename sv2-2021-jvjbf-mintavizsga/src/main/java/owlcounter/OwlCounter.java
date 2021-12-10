package owlcounter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class OwlCounter {

    private List<String> numberOfOwls = new ArrayList<>();

    public void readFromFile(Path path) {
        try {
            numberOfOwls = Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }
    }

    public int getNumberOfOwls(String county) {
        for (String actual : numberOfOwls) {
            if ((actual.split("=")[0]).equals(county)) {
                int number = Integer.parseInt(actual.split("=")[1]);
                return number;
            }
        }
        throw new IllegalArgumentException("No such county in Hungary!");

    }

    public int getNumberOfAllOwls() {
        int count = 0;
        for (String actual : numberOfOwls) {
            int number = Integer.parseInt(actual.split("=")[1]);
            count += number;
        }
        return count;
    }
}
