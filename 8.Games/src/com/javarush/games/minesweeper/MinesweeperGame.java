package com.javarush.games.minesweeper;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

import java.util.ArrayList;
import java.util.List;

public class MinesweeperGame extends Game {
    private static final String MINE = "\uD83D\uDCA3";
    private static final String FLAG = "\uD83D\uDEA9";
    private static final int SIDE = 9;
    private int score;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];
    private int countClosedTiles = SIDE * SIDE;
    private int countMinesOnField; // количество сгенерированных мин
    private int countFlags; //приватное поле countFlags типа int,  в котором будет храниться количество неиспользованных флагов.

    private boolean isGameStopped;


    @Override
    public void initialize() {
        /*Для указания размерности в движке существует метод setScreenSize(int, int),
        который принимает параметрами ширину и высоту (количество ячеек по ширине и высоте).*/
        setScreenSize(SIDE, SIDE);
        createGame();
    }

    @Override
    public void onMouseLeftClick(int x, int y) {

        if(!isGameStopped){
            openTile(x, y);
        } else {
            restart();
            return;
        }
    }

    @Override
    public void onMouseRightClick(int x, int y) {
        markTile(x, y);
    }

    private void gameOver() {
        isGameStopped = true;
        showMessageDialog(Color.RED, "Это конец!", Color.BLACK, 50);
    }

    private void restart() {
        isGameStopped = false;
        countClosedTiles = SIDE * SIDE;
        score = 0;
        countMinesOnField = 0;
        setScore(score);
        createGame();

    }

    private void win() {
        isGameStopped = true;
        showMessageDialog(Color.DEEPSKYBLUE, "Победа", Color.AQUA, 70);
    }

    private void openTile(int x, int y) {  // открытие ячейки
        GameObject gameObject = gameField[y][x];

        if (countMinesOnField == countClosedTiles - 1 && !gameObject.isMine) {
            win();
        }

        if (!isGameStopped && !gameObject.isOpen && !gameObject.isFlag) {
            gameObject.isOpen = true;
            countClosedTiles--;

            if (!gameObject.isMine) {
                score += 5;
                setScore(score);
            }

            if (gameObject.isMine) { //если в ячейке мина
                setCellValueEx(x, y, Color.RED, MINE);
                gameOver();
            } else if (gameObject.countMineNeighbors == 0) { // если не мина и нету мин соседей

                setCellValue(gameObject.x, gameObject.y, "");
                List<GameObject> neighbors = getNeighbors(gameObject);
                for (GameObject neighbor : neighbors) {
                    if (!neighbor.isOpen) {
                        openTile(neighbor.x, neighbor.y);
                    }
                }
            } else {
                setCellNumber(x, y, gameObject.countMineNeighbors);
            }
            setCellColor(x, y, Color.GREEN);

        } else {
            return;
        }

    }

    private void createGame() {// отрисовка матрицы на отображении

//        for (int y = 0; y < SIDE; y++) {
//                for (int x = 0; x < SIDE; x++) {
//                    setCellValue(x, y, "");
//                }
//            }
        if (!isGameStopped){
            for (int y = 0; y < SIDE; y++) {
                for (int x = 0; x < SIDE; x++) {
                    setCellValue(x, y, ""); //удаление старых значений

                    /* метод getRandomNumber(int n) класса Game,
                    который возвращает случайное число от 0 до n-1 включительно.
                    Следовательно, вероятность генерации определенного числа равна 1/n.*/
                    boolean isMine = getRandomNumber(10) < 1; //генерация мин
                    if (isMine) {
                        countMinesOnField++; // подсчет количества сгенерированных мин
                    }
                    gameField[y][x] = new GameObject(x, y, isMine);
                    setCellColor(x, y, Color.ORANGE);
                }
            }
            countMineNeighbors();

        /*Согласно правилам игры, в помощь игроку даются флаги. Они нужны,
        чтобы помечать потенциально "заминированные" ячейки. Поэтому количество
         флагов countFlags должно равняться количеству мин countMinesOnField.*/
            countFlags = countMinesOnField;
        }
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

    private void markTile(int x, int y) {
        if (!isGameStopped) {

            if (gameField[y][x].isOpen || countFlags == 0 && !gameField[y][x].isFlag) {
                return;
            } else if (!(gameField[y][x].isFlag)) {
                gameField[y][x].isFlag = true;
                countFlags--;
                setCellValue(x, y, FLAG);
                setCellColor(x, y, Color.AZURE);
                return;
            } else if (gameField[y][x].isFlag) {
                countFlags++;
                setCellValue(x, y, "");
                gameField[y][x].isFlag = false;
                setCellColor(x, y, Color.ORANGE);
                return;
            }
        }
    }
}