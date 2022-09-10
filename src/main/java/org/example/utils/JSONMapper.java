package org.example.utils;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.example.models.User;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JSONMapper {

    private static List<User> stringToUser(List<String> users) {
        String[] data;
        List<User> userObjects = new ArrayList<>();
        for (int i = 1; i < users.size(); i++) {
            data = users.get(i).split(" ");
            userObjects.add(new User(data[0], Integer.parseInt(data[1])));
        }
        return userObjects;
    }

    public static void convertToJSON(List<String> users) {
        List<User> userObjects = stringToUser(users);
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        try {
            writer.writeValue(Paths.get("src/main/resources/user.json").toFile(), userObjects);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
