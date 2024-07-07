package cz.engeto.lekce08.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

@RestController
public class Controller {

    @GetMapping("romantic")
    public String romantic() throws Exception {
        String filename = "src/main/java/cz/engeto/lekce08/Controller/resources/romantic.txt";
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(filename)))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                return line;
            }
        } catch (FileNotFoundException e) {
            throw new Exception("File " + filename + "not found:" + e.getMessage());
        }
        return filename;
    }

    @GetMapping("scifi")
    public String scifi() throws Exception {
        String filename = "src/main/java/cz/engeto/lekce08/Controller/resources/scifi.txt";
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(filename)))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                return line;
            }
        } catch (FileNotFoundException e) {
            throw new Exception("File " + filename + "not found:" + e.getMessage());
        }
        return filename;
    }

    @GetMapping("historic")
    public String historic() throws Exception {
        String filename = "src/main/java/cz/engeto/lekce08/Controller/resources/historic.txt";
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(filename)))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                return line;
            }
        } catch (FileNotFoundException e) {
            throw new Exception("File " + filename + "not found:" + e.getMessage());
        }
        return filename;
    }
}

