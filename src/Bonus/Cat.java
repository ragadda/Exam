package Bonus;

public class Cat extends Animal implements Pet{
    private String name;

    public Cat(int legs, String name) {
        super(legs);
        setName(name);
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {

    }
}
