package generics;

import java.util.List;

/**
 * Created by ovidiu on 30-Jan-17.
 */
public class Homework {

    public static <T> void switchElements(T objGen1, T objGen2) {
        T aux;
        aux = objGen1;
        objGen1 = objGen1;
        objGen2 = aux;
    }

    public static <T> void switchElementsInArray(T[] arr, int i, int j) {
        T aux;
        aux = arr[i];
        arr[i] = arr[j];
        arr[j] = aux;
    }

    //the method that will find max
    //it will receive object only that can be comparated
    public static <T extends Comparable<T>> T max(List<T> genList){
        T gen=null;
        return gen;
    }
}
