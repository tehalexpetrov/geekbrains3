package lesson1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("***** Задание 1 **************");
        String[] arr = {"a", "b", "c", "d", "e"};
        System.out.println("Выводим обычный строковый массив");
        System.out.println(Arrays.toString(arr));

       //Первое задание
        arrayBack(arr);
        System.out.println("*******************");

        //Второе задание
        System.out.println("\n****Задание 2******");
        arrList(arr);
        System.out.println("*********************");

        //Третье задание


    }

    public static void arrayBack(Object[] arr){  //Пишем метод, который будет менять первых два элемента массива местами
        System.out.println("\nРезультат работы метода");
        Object ar = arr[0];
        arr[0] = arr[1];
        arr[1] = ar;
        System.out.println(Arrays.toString(arr));
    }

    public static  <T> void arrList(T[] arr){
        ArrayList<T> arrConvert = new ArrayList<>(Arrays.asList(arr));
        System.out.println(arrConvert);
    }
}
