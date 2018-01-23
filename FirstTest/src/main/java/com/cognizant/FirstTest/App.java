package com.cognizant.FirstTest;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(final String[] args) {
        final Gson gson = new Gson();
        System.out.println(gson.toJson("Hello World!"));
    }
}
