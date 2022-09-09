package com.quintrix.conversion;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.quintrix.conversion.model.Student;

import java.io.File;
import java.io.IOException;

public class JSONConversion {

    public static void main(String[] args){
        ObjectMapper mapper = new ObjectMapper();

        // Java object to JSON file
        try {
            mapper.writeValue(new File("test.json"),
                    new Student("Brandon","Larocque","Computer Science"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Java object to JSON string
        String jsonString;
        try {
            jsonString = mapper.writeValueAsString(new Student("Kevin","Durant","Communications"));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        System.out.println(jsonString);
    }

}
