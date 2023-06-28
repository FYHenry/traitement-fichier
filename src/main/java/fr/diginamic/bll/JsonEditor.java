package fr.diginamic.bll;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;

public final class JsonEditor {
    private static final ObjectMapper mapper;
    static {
        mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
    }
    private JsonEditor(){}
    public static void exportAsJson(String filePath,
                                    Object object) throws IOException {
        final File file = new File(filePath);
        mapper.writeValue(file, object);
    }
    public static <T> T importAsJson(String filePath, Class<T> clsType) throws IOException {
        final File file = new File(filePath);
        return mapper.readValue(file, clsType);
    }
    public static String stringify(Object object) throws JsonProcessingException {
        return mapper.writeValueAsString(object);
    }
}
