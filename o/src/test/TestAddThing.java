package test;

import common.model.Thing;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class TestAddThing extends TestJavaAPIs{
    public static void main(String[] ars){
        Thing thing = new Thing("Hello");

        File file = new File("https://jsonplaceholder.typicode.com/posts");
        Thing thingFile = new Thing(file);


        }
}