package org.example;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ) throws IOException {
        Student student=new Student();
        student.setCity("Delhi");
        student.setName("Nira j");
        student.setCourse("Java Full Stack");

        System.out.println(student);
        System.out.println("====================================================");
        ObjectMapper objectMapper=new ObjectMapper();
        String object=objectMapper.writeValueAsString(student);

    }
}
