package generics;

import university.PersonInterface;
import university.Student;

/**
 * Created by ovidiu on 19-Jan-17.
 */
public class Main {
    public static void main(String[] args) {

        // 1L = transforma in long
        //Pair<Integer , String> p1 = new Pair<>(1L,"apple");
        Pair<Integer , String> p1 = new Pair<>(1,"apple");
        Pair<Integer , String> p2 = new Pair<>(2,"pear");
        System.out.println(Util.compare(p1,p2));


        Student student = new Student();
        Pair<PersonInterface , Student> p3 = new Pair<PersonInterface , Student>(student, student);
        Pair<PersonInterface , Integer> p4 = new Pair<PersonInterface , Integer>(new Student(), 1);

      //  System.out.println(Util.compare(p3,p4));

        //TEME GENERICS
        MyGenericClass<String> word = new MyGenericClass<>();
        word.set("hola");
        word.get();

        //se face automat autoboxing (Integer, String etc)
        Homework.switchElements("string", "string");


    }
}
