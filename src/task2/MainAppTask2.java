package task2;

import java.util.ArrayList;

public class MainAppTask2 {
    public static void main(String[] args) {
        Apple[] apple = new Apple[10];
        ArrayList<Apple> appleList = new ArrayList<>();

        Orange[] orange = new Orange[10];
        ArrayList<Orange> orangeList = new ArrayList<>();

        Apple appleNew = new Apple();
        appleList.add(appleNew);
        appleList.add(appleNew);

        Orange orengeNew = new Orange();
        orangeList.add(orengeNew);
        orangeList.add(orengeNew);

        Box<Orange> boxOrange = new Box<>(orange, orangeList);
        Box<Apple> boxApple = new Box<>(apple, appleList);

        System.out.println(boxApple.getWeightBox());
        System.out.println(boxOrange.getWeightBox());

        System.out.println(boxApple.compare(boxOrange));
    }
}
