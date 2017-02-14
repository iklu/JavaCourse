package obj_containers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ovidiu on 19-Jan-17.
 */
public class MainApp
{
    public static void main(String[] args) {
        //Generics define the array list type
        List <String> myList = new ArrayList<>();
        myList.add("hello");

        List <Integer> myListInt = new ArrayList<>();
        myListInt.add(1);
    }
}
