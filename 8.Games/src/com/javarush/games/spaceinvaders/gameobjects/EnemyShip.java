package com.javarush.games.spaceinvaders.gameobjects;

import com.javarush.games.spaceinvaders.Direction;
import com.javarush.games.spaceinvaders.ShapeMatrix;

public class EnemyShip extends Ship {

    public EnemyShip(double x, double y) {
        super(x, y);
        setStaticView(ShapeMatrix.ENEMY);
    }

    public void move(Direction direction, double speed) {

        if (direction == Direction.RIGHT) {
            this.x += speed;
        } else if (direction == Direction.LEFT) {
            this.x -= speed;
        } else if (direction == Direction.DOWN) {
            this.y += 2;
        }

    }

}
