package com.company;

import java.lang.reflect.InvocationTargetException;

public class Main {
    private static final String s = "{\"name\":\"Барсик\",\"age\":365}";

    public static void main(String[] args) {
        Mapper mapper = new Mapper();
        try {
            Cat cat = mapper.parse(s, Cat.class);
            System.out.println();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
