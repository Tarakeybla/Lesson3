package task1;

import java.util.Arrays;

public class MainAppTask1 {
    static Integer[] arrayInteger = {1, 2, 3, 4, 5};
    static String[] arraString = {"1", "2", "3", "4", "5"};
    static Double[] arrayDouble = {1d, 2d, 3d, 4d, 5d};

    public static void main(String[] args) {
        SwapClass<Object> swapClass = new SwapClass<>();

        try {
            System.out.println(Arrays.toString(swapClass.swapElements(arrayInteger ,0,3)));
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }

        try {
            System.out.println(Arrays.toString(swapClass.swapElements(arraString ,0,3)));
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }

        try {
            System.out.println(Arrays.toString(swapClass.swapElements(arrayDouble ,0,3)));
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }
    }
}