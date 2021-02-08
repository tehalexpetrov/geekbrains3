package lesson1;

import java.util.ArrayList;

public class Box <T extends Fruit>{
    private ArrayList<T> box = new ArrayList<>();
    private T fruit;

    public Box() {

    }

    public float getWeiht(){
        float weight = 0.0f;

        for (T t : box) {
           weight += t.getWeight();
        }
        return weight;
    }

    public boolean compare(Box anotherBox) {
        if (getWeiht() == anotherBox.getWeiht()){
            return true;
        }
        return false;
    }

    public void pourTo(Box <T>anotherBox){
        anotherBox.box.addAll(box);
        box.clear();
    }

    public void addFruit(T fruit, int amount) {
        for (int i = 0; i < amount; i++) {
            box.add(fruit);
        }
    }
}
