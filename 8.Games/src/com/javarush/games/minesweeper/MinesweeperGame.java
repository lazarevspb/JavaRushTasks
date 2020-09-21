package com.javarush.games.minesweeper;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

import java.util.ArrayList;
import java.util.List;

public class MinesweeperGame extends Game {
    private static final int SIDE = 9;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];
    private int countMinesOnField;

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }

    private void createGame() {
        for (int y = 0; y < SIDE; y++) {

            for (int x = 0; x < SIDE; x++) {
                boolean isMine = getRandomNumber(10) < 1;
                if (isMine) {
                    countMinesOnField++;
                }
                gameField[y][x] = new GameObject(x, y, isMine);
                setCellColor(x, y, Color.ORANGE);

            }
        }
        countMineNeighbors();
    }

    private List<GameObject> getNeighbors(GameObject gameObject) {
        List<GameObject> result = new ArrayList<>();
        for (int y = gameObject.y - 1; y <= gameObject.y + 1; y++) {
            for (int x = gameObject.x - 1; x <= gameObject.x + 1; x++) {
                if (y < 0 || y >= SIDE) {
                    continue;
                }
                if (x < 0 || x >= SIDE) {
                    continue;
                }
                if (gameField[y][x] == gameObject) {
                    continue;
                }
                result.add(gameField[y][x]);
            }
        }
        return result;
    }


    //Метод countMineNeighbors() должен для каждой ячейки "не мины" из матрицы gameField подсчитать
    // количество соседних ячеек "мин" и установить это значение в поле countMineNeighbors.
    //Убедись, что метод countMineNeighbors() для каждого элемента матрицы gameField,
    // который не является миной, считает количество соседних ячеек-мин.
    private void countMineNeighbors() {
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {

                if (!gameField[y][x].isMine) {
                    getNeighbors(gameField[y][x]);
//                    List<GameObject> list = getNeighbors(gameField[y][x]);

                    gameField[y][x].countMineNeighbors = (int) getNeighbors(gameField[y][x])
                            .stream()
                            .filter(g -> g.isMine)
                            .count();
                }
            }
        }
    }
}