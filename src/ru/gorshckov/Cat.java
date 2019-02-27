package ru.gorshckov;

public class Cat extends Animal implements Jump {
    int jumpHeight;


    public Cat(int canRunDistance, int jumpHeight) {
         super(canRunDistance, "cat");
         this.jumpHeight = jumpHeight;
     }



    @Override
    public void doJump(int height) {
        if (this.jumpHeight < height) {
            setOnDistance(false);
        }

    }
}