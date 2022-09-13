package task2;

import java.util.ArrayList;

public class Box <T extends Fruit>{

    T[] fruitBox;

    ArrayList<T> fruitList;

    public Box(T[] fruitBox, ArrayList<T> fruitList) {
        this.fruitBox = fruitBox;
        this.fruitList = fruitList;
    }

    public Float getWeightBox () {
        Float result = 0f;
        for (T t: getFruitList()) {
            if(t!=null) {
                Float value = t.getWeight();
                result += value;
            }
        }
        return result;
    }

    public Boolean compare (Box<? extends Fruit> box) {
        if (this.getWeightBox().intValue() == box.getWeightBox().intValue())
            return true;
        return false;
    }

    public T[] getFruitBox() {
        return fruitBox;
    }

    public ArrayList<T> getFruitList() {
        return fruitList;
    }
}
