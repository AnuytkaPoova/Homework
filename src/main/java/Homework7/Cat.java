package Homework7;

public class Cat {

    private String name;
    private int appetite;
    protected static boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public Cat() {
    }
    public Cat(String name, int appetite, boolean fullness) {
        this.name = name;
        this.appetite = appetite;
        Cat.fullness = fullness;
    }


    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFullness() {
        return fullness;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public static void setFullness(boolean fullness) {
        Cat.fullness = fullness;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", fullness=" + fullness +
                '}';
    }
    public void info(){
        System.out.println(toString());
    }
}
