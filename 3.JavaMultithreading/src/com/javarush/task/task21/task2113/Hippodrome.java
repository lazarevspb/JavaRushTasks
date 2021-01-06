package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Hippodrome {
    static Hippodrome game;
    private List<Horse> horses;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public static void main(String[] args) throws InterruptedException {
        List<Horse> horses = new ArrayList<>();
        horses.add(new Horse("Плотва0", 3, 0));
        horses.add(new Horse("Плотва1", 3, 0));
        horses.add(new Horse("Плотва2", 3, 0));
        Hippodrome hippodrome = new Hippodrome(horses);
        game = hippodrome;

        game.run();
        game.printWinner();
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public  Horse getWinner(){
       return horses.stream().max(Comparator.comparingDouble(o -> o.distance)).get();
    }

    public  void printWinner(){
        System.out.printf("Winner is %s!",getWinner().name);
    }

    void run() throws InterruptedException {
        for (int i = 1; i < 101; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }
    void move() {
        for (int i = 0; i < horses.size(); i++) {
            horses.get(i).move();
        }
    }

    void print() {
        for (int i = 0; i < horses.size(); i++) {
            horses.get(i).print();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }
}
