package com.github.mabutamail.javatemplate.core.alishevcore.jsonToObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class jsonToObject {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"age\":33, \"name\":\"zalex\", \"pass\":true}";
//        log.info(json);
        // Java объект из JSON строки
//        Person personFromString = new Person();
//        personFromString.setName("zalex111");
//        String result = null;
//        try {
//            result = mapper.writeValueAsString(personFromString);
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }
//        log.info(result);
        try {
            Person personFromString = mapper.readValue(json, Person.class);
            log.info(String.valueOf(personFromString));
        } catch (JsonProcessingException e) {
            log.error("не парсится ", e);
        }

    }
}