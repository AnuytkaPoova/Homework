package Homework7;

public class Plate extends Cat {

    private int food;

    public Plate(int food) {

        this.food = food;
    }
    public void decreaseFood(int n) {
        if(n > food) {
            //food = 0;
            System.out.println("Кот ен ест, еды в мисле осталось " + food + " - не хватает для насыщения");
            Cat.setFullness(false);
        } else {
            food -= n;
            Cat.setFullness(true);
        }
    }
        public void increaseFood(int n) {
            if(food + n <= 100)
            food += n;
            else
                food = 100;
        }

        public void info() {
        System.out.println("plate: " + food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

}
