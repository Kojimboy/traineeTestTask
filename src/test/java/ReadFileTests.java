import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class ReadFileTests {

    @Test
    public void secondLineShouldHaveWordAlloha(){
        int n = 1; //2 строка
        try {
            Path filepath = Paths.get("src/test/resources/ReadFileTests.txt");
            String line = Files.readAllLines(filepath).get(n);
            assertEquals("аллоха", line);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
