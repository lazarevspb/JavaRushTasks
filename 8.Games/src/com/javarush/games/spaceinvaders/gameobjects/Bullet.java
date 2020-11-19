package com.javarush.games.spaceinvaders.gameobjects;

import com.javarush.games.spaceinvaders.Direction;
import com.javarush.games.spaceinvaders.ShapeMatrix;

public class Bullet extends GameObject{
    private  int dy;
    public boolean isAlive = true;

    public void kill(){
        isAlive = false;
    }

    public Bullet(double x, double y, Direction direction) {
        super(x, y);
        super.setMatrix(ShapeMatrix.BULLET);
        if (direction == Direction.UP) dy = -1;
        if (direction != Direction.UP) dy = 1;

    }

    public void move(){
        y += dy;
    }
}
