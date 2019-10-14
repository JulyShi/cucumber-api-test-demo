package com.thoughtworks.it.util;

public class TemplateUtil {
    public static String render(String template, JtwigModel model){
        return classpathTemplate(templete).render(model);
    }
}
