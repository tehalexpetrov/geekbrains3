package lesson1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

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
        Box<Apple> ap = new Box<>();
        Box<Apple> ap1 = new Box<>();
        Box<Orange> or = new Box<>();
        Box<Orange> or1 = new Box<>();

        ap.addFruit(new Apple(),10);
        ap1.addFruit(new Apple(),8);
        or.addFruit(new Orange(), 7);
        or1.addFruit(new Orange(), 4);

        equalBox(ap, ap1, or, or1); //Сравним коробки

        or.pourTo(or1);
        ap.pourTo(ap1);

        weightBox(ap, ap1, or, or1);
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

    private static void equalBox(Box<Apple> ap, Box<Apple> ap1, Box<Orange> or, Box<Orange> or1) {
        System.out.println("Box 1 equals box 3: "+ or.compare(ap));
        System.out.println("Box 2 equals box 4: "+ or1.compare(ap1));
    }

    private static void weightBox(Box<Apple> ap, Box<Apple> ap1, Box<Orange> or, Box<Orange> or1) {
        System.out.println("Первая коробка с апельсинами: "+ or.getWeiht());
        System.out.println("Вторая коробка с апельсинами: "+ or1.getWeiht());
        System.out.println("Первая коробка с яблоками: "+ ap.getWeiht());
        System.out.println("Вторая коробка с яблоками: "+ ap1.getWeiht());
    }
}
