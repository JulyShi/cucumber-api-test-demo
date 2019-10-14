package com.thoughtworks.it.util;

import java.util.List;
import java.util.Map;

public class JsonUtil {

    public static Map<String, Object> parseJson(String content) throws java.io.IOException{
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(content, new TypeReference<Map<Steing,Object>>(){
        });
    }

    public static List<> parseJsonArray(String content) throws  java.io.IOException{
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(content, new TypeReference<List<Map<String, Object>>>(){
        });
    }
}
