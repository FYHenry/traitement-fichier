package fr.diginamic.ui;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import fr.diginamic.dto.FilmJson;
import fr.diginamic.dto.JsonData;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class Lecteur {
    public static void main(String[] args) {
        try {
            File jsonFile = new File("filmsShort.json");
            final ObjectMapper mapper =
                    new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
            final JsonData input =
                    new JsonData(mapper.readValue(jsonFile, List.class));
            final String objectString = mapper.writeValueAsString(input);
            final Scanner reader = new Scanner(jsonFile);
            String fileString = "";
            while (reader.hasNextLine()){
                fileString.concat(reader.nextLine());
            }
            System.out.println(objectString);
            System.out.println("Égalité des JSON ? : " +
                    objectString.compareTo(fileString));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
