package lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main<T> {
    public static void main (String[] args) {
        String[] strings = {"Apple", "Orange", "Pear", "Watermelon"};
        Integer[] numbers = {1, 2, 3, 4, 5, 6};

        System.out.println(Arrays.toString(strings));
        swapArray(strings, 0, 2);
        System.out.println(Arrays.toString(strings));

        System.out.println(Arrays.toString(numbers));
        swapArray(numbers, 1, 3);
        System.out.println(Arrays.toString(numbers));

        System.out.println(strings.getClass());
        System.out.println(convertToList(strings).getClass());

        System.out.println(numbers.getClass());
        System.out.println(convertToList(numbers).getClass());

        Box<Apple> boxOfApples = new Box<>();
        Box<Apple> newBoxOfApples = new Box<>();
        Box<Orange> boxOfOrange = new Box<>();
        Box<Orange> newBoxOfOrange = new Box<>();

        for (int i = 0; i < 10; i++) {
            boxOfApples.addFruit(new Apple());
            boxOfOrange.addFruit(new Orange());
        }

        System.out.println("Weight of Apple box:" + boxOfApples.getWeight());
        System.out.println("Weight of Orange box:" + boxOfOrange.getWeight());
        System.out.println("Compare weight Orange and Orange:" + boxOfOrange.compare(boxOfOrange));
        System.out.println("Compare weight Orange and Apple:" + boxOfOrange.compare(boxOfApples));
        boxOfApples.changeBox(newBoxOfApples);
        System.out.println("Weight of Apple box:" + boxOfApples.getWeight());
        System.out.println("Weight of new Apple box:" + newBoxOfApples.getWeight());
        boxOfOrange.changeBox(newBoxOfOrange);
        System.out.println("Weight of Orange box:" + boxOfOrange.getWeight());
        System.out.println("Weight of new Orange box:" + newBoxOfOrange.getWeight());
    }

    private static <T> void swapArray(T[] array, int firstIndex, int secondIndex) {
        T temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
    private static <T> ArrayList<? extends  T> convertToList(T[] array) {
        return new ArrayList<>(Arrays.asList());
    }
}
