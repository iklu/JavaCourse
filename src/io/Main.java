package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by ovidiu on 07-Feb-17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // Stream.read();
        try (BufferedReader in = new BufferedReader(new FileReader("E:/PROGRAMMING/JAVA/CURS/JavaCourse/src/io/bulbhead.flf"))) {
            String line = in.readLine();
            String[] tokens = line.split(" "); //explode() like in php
            System.out.println(line);

            char hardblank = tokens[0].charAt(5);
            int height = Integer.parseInt(tokens[1]);
            int commentsLines = Integer.parseInt(tokens[5]);

            System.out.println(hardblank);
            System.out.println(height);
            System.out.println(commentsLines);
            skipLines(in, commentsLines);

            List<List<String>> characters = new ArrayList<>();

            for(int i = 0; i<102; ++i){
                characters.add(readCharacter(in, height, hardblank));
            }

            for(int i=0; i < height; i++){
                for(char c: "HELLO WORLD".toCharArray()){
                    int index = c - ' ';
                     List<String> character = characters.get(index);
                    System.out.print(character.get(i));

                }
                System.out.println();
            }
        }
    }

    public static void skipLines(BufferedReader reader, int count) throws IOException {
        for (int i = 0; i < count; ++i) {
            reader.readLine();
        }
    }

    public static List<String> readLines(BufferedReader reader, int count) throws IOException {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < count; ++i) {
            list.add(reader.readLine());
        }
        return list;
    }

    public static List<String> readCharacter(BufferedReader reader, int height, char hardblank) throws IOException{
        List<String> list = new ArrayList<>();
        for(String line: readLines(reader, height)){
            String paddingCharacter = line.substring(line.length()-1);
            list.add(line.replace('$', ' ').replace(paddingCharacter, ""));
        }
        return list;
    }
}
