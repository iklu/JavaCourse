package io;

import java.io.*;

/**
 * by ovidiu on 07-Feb-17.
 */
public class Stream {
    public static void read () throws IOException {
        FileInputStream input = null;
        FileOutputStream output = null;
        try{
            //byte
            input = new FileInputStream("E:\\PROGRAMMING\\JAVA\\CURS\\JavaCourse\\src\\io\\in.txt");
            output = new FileOutputStream("E:\\PROGRAMMING\\JAVA\\CURS\\JavaCourse\\src\\io\\out.txt");
            int val;

            //DECORATOR pattern
            BufferedInputStream in = new BufferedInputStream(input);
            BufferedOutputStream out = new BufferedOutputStream(output);

            while ((val = input.read()) != -1) {
                output.write(val);
            }

        } finally {
            if (input != null) {
                input.close();
            }
            if (output != null) {
                output.close();
            }
        }
    }
}
