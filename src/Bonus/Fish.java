package Bonus;

public  class Fish extends Animal implements Pet{
    private String name;

    public Fish(int legs) {
        super(legs);
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
