package com.javarush.games.snake;

import com.javarush.engine.cell.*;

import java.util.ArrayList;
import java.util.List;

public class Snake {
//    private static final String HEAD_SIGN = "\uD83D\uDC7E";
//    private static final String BODY_SIGN = "\u26AB";
// https://codepen.io/ram99/pen/aqWROV?__cf_chl_jschl_tk__=40820757a595ab391927945d178e82e4f5d69d3f-1603009726-0-AYM2xoCmKTUxpmfl9WTumcC0I2C1V-A04phgnR-fg3p4bTBW9sidi7JPX2GHK5Z3xBukNbbuPe_s5RU8UP6FrvhdPwx3-HaP5f_DSVq9GyNrc8p7CF6RAOJaRODingeMy9EjzaBzQarElz7ZxsFjItGSciLpJYnwG7cDMa0p3issKwDGYqtT05DHVqVWRP1CR8stsHYvodRnGse2BY1gL7A_yqLHCusxRyBtF4AP0l-RYvUr46cZxYAEuTd6iuBOzGqCF-OTXVqrV4IKS7HMwMe0Dk5_7FxVYHoE6jZmiavmf2p86t44culDfK1AkRSf_QIoaovdJPycyQZfg2absMUlaWRU6gJNTr-ZopusP647

    private static final String HEAD_SIGN = "⬛";
    private static final String BODY_SIGN = "◼";
    private Direction direction = Direction.LEFT;
    public boolean isAlive = true;
    private int x;
    private int y;

    private List<GameObject> snakeParts = new ArrayList<>();

    public int getLength() {
        return snakeParts.size();
    }

    public void setDirection(Direction direction) {
/* если требуемое направление LEFT, и сегменты змейки 0 и 1 находятся в одной горизонтали,
то direction изменять не надо. итд*/
        if (this.direction == Direction.LEFT && snakeParts.get(0).x == snakeParts.get(1).x
                || this.direction == Direction.RIGHT && snakeParts.get(0).x == snakeParts.get(1).x
                || this.direction == Direction.UP && snakeParts.get(0).y == snakeParts.get(1).y
                || this.direction == Direction.DOWN && snakeParts.get(0).y == snakeParts.get(1).y
        ) {
            return;
        }
        if (direction.getOpposite() != this.direction) {
            this.direction = direction;
        }
    }

    public Snake(int x, int y) {
        this.x = x;
        this.y = y;

        for (int i = 0; i < 3; i++) {
            snakeParts.add(new GameObject(x + i, y)); //Создание змейки из трех сегментов
        }
    }


    public void removeTail() {
        snakeParts.remove(snakeParts.size() - 1);
    }

    public void move(Apple apple) {
        GameObject snakeHead = createNewHead();


        if (snakeHead.x < 0
                || snakeHead.y < 0
                || snakeHead.x >= SnakeGame.WIDTH
                || snakeHead.y >= SnakeGame.HEIGHT
        ) {
            isAlive = false;
            return;
        } else {

            if (checkCollision(snakeHead)) {
                isAlive = false;
                return;
            }

            snakeParts.add(0, snakeHead);
            if (apple.x == snakeHead.x && apple.y == snakeHead.y) {
                apple.isAlive = false;
                return;
            }
            removeTail();
        }
    }

    public boolean checkCollision(GameObject gameObject) {

        for (int i = 0; i < snakeParts.size(); i++) {
            if (snakeParts.get(i).x == gameObject.x && snakeParts.get(i).y == gameObject.y) {
                return true;
            }
        }

        return false;
    }

    public void draw(Game game) {
        for (int i = 0; i < snakeParts.size(); i++) {
            game.setCellValueEx(
                    snakeParts.get(i).x, snakeParts.get(i).y, Color.NONE,
                    i == 0 ? HEAD_SIGN : BODY_SIGN, isAlive ? Color.BLACK : Color.RED, 75);
        }
    }

    public GameObject createNewHead() {

        switch (direction) {
            case UP:
                return new GameObject(snakeParts.get(0).x, snakeParts.get(0).y - 1);

            case DOWN:
                return new GameObject(snakeParts.get(0).x, snakeParts.get(0).y + 1);

            case LEFT:
                return new GameObject(snakeParts.get(0).x - 1, snakeParts.get(0).y);

            case RIGHT:
                return new GameObject(snakeParts.get(0).x + 1, snakeParts.get(0).y);

        }
        return new GameObject(snakeParts.get(0).x - 1, snakeParts.get(0).y);
    }
}
