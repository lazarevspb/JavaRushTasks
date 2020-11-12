package com.javarush.games.spaceinvaders.gameobjects;

import com.javarush.engine.cell.Game;
import com.javarush.games.spaceinvaders.ShapeMatrix;

import java.util.ArrayList;
import java.util.List;

/**
 * будет хранить список кораблей, количество рядов кораблей(ROWS_COUNT), количество кораблей в ряду(COLUMNS_COUNT) и
 * расстояние между левыми верхними углами соседних кораблей(STEP). Создавать корабли и заполнять ими список(ships)
 * мы будем в методе createShips
 */
public class EnemyFleet {
    final private static int ROWS_COUNT = 3;
    final private static int COLUMNS_COUNT = 10;
    final private static int STEP = ShapeMatrix.ENEMY.length + 1;
    private List<EnemyShip> ships;

    public EnemyFleet() {
        createShips();
    }



    private double getRightBorder() {
        double max = 0;
        max = ships.get(0).x + ships.get(0).width;
        for (int i = 0; i < ships.size(); i++) {
            if (ships.get(i).x + ships.get(i).width > max) {
                max = ships.get(i).x + ships.get(i).width;
            }
        }
        return max;
    }

    private double getLeftBorder() {
        double min = 0;
        min = ships.get(0).x;
        for (int i = 0; i < ships.size(); i++) {
            if (ships.get(i).x < min) {
                min = ships.get(i).x;
            }
        }
        return min;
    }


    public void draw(Game game) {
        for (int i = 0; i < ships.size(); i++) {
            ships.get(i).draw(game);
        }

    }

    private void createShips() {
        ships = new ArrayList<>();

        for (int y = 0; y < ROWS_COUNT; y++) {
            for (int x = 0; x < COLUMNS_COUNT; x++) {

                ships.add(new EnemyShip(x * STEP, y * STEP + 12));
            }
        }
    }


}
