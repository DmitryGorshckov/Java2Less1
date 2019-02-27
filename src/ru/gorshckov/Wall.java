package ru.gorshckov;

public class Wall extends Obstacle {


    protected Wall(int size) {
        super(size);
    }

    @Override
    public void doIt(Animal a) {
        if (a instanceof Jump) {
            ((Jump) a).doJump(size);
        }
        /*else {
            a.setOnDistance(false);
        }*/

    }
}

