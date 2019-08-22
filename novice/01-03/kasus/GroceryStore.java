import java.util.ArrayList;
import java.util.List;

public class GroceryStore {
    static class Plant {
        private String name;

        public Plant(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    static class Fruit extends Plant {
        private int size;

        public Fruit(String name, int size) {
            super(name);
            this.size = size;
        }

        public int getSize() {
            return size;
        }
    }

    static class Apple extends Fruit {
        private String origin;

        public Apple(String name, int size, String origin) {
            super(name, size);
            this.origin = origin;
        }

        public String getOrigin() {
            return origin;
        }
    }

    public static void main(String[] args) {
        GroceryStore store = new GroceryStore();
        List<? super Fruit> fruitBasket = new ArrayList<>();
        store.fill(fruitBasket);

        assert (fruitBasket.size() == 3);

        List<Apple> anotherBasket = new ArrayList<>();
        anotherBasket.add(new Apple("apple", 5, "US"));
        anotherBasket.add(new Apple("apple", 8, "UK"));
        anotherBasket.add(new Apple("apple", 9, "CN"));

        assert (store.getBiggestFruit(anotherBasket).getSize() == 9);
    }

    public void fill(List<? super Fruit> fruitBasket) {
        fruitBasket.add(new Apple("apple", 5, "US"));
        fruitBasket.add(new Apple("apple", 8, "UK"));
        fruitBasket.add(new Apple("apple", 9, "CN"));
    }

    public Fruit getBiggestFruit(List<? extends Fruit> fruits) {
        assert (!fruits.isEmpty());
        int len = fruits.size();
        Fruit biggestFruit = fruits.get(0);
        for (int i = 1; i < len; i++) {
            if (fruits.get(i).getSize() > biggestFruit.getSize()) {
                biggestFruit = fruits.get(i);
            }
        }
        return biggestFruit;
    }
}