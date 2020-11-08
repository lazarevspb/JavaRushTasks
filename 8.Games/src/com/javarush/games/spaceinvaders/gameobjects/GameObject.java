package com.javarush.games.spaceinvaders.gameobjects;

import com.javarush.engine.cell.*;

public class GameObject {
    public double x;
    public double y;
    public int[][] matrix;
    public int width;
    public int height;

    public GameObject(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Game game) {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
 /*Color.values() возвращает массив Color, далее будет класс добавлен ShapeMatrix,
 и благодаря двумерному массиву matrix[y][x] будет возможность закрашивать сразу группу элементов в разные цвета.
  color — это цвет элемента из матрицы объекта, который можно получить так: Color.values()[matrix[i][j]],
  где i – координата y в матрице matrix, j – координата x в матрице matrix. */
                game.setCellValueEx((int) this.x + x, (int) this.y + y, Color.values()[matrix[y][x]], "");
            }
        }
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
        width = matrix[0].length;
        height = matrix.length;

    }


}
