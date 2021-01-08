package com.javarush.games.spaceinvaders.gameobjects;

import com.javarush.games.spaceinvaders.Direction;
import com.javarush.games.spaceinvaders.ShapeMatrix;
import com.javarush.games.spaceinvaders.SpaceInvadersGame;

import java.util.List;

public class PlayerShip extends Ship {
    private Direction direction = Direction.UP;

    public Direction getDirection() {
        return direction;
    }

    public PlayerShip() {
        super(SpaceInvadersGame.WIDTH / 2.0, SpaceInvadersGame.HEIGHT - ShapeMatrix.PLAYER.length - 1);
        setStaticView(ShapeMatrix.PLAYER);
    }

    public void move() {
        if (isAlive == false) return;

        if (direction == Direction.RIGHT) {
            this.x++;
        } else if (direction == Direction.LEFT) {
            this.x--;
        }
        if (this.x < 0) x = 0;
        if (this.x + width > SpaceInvadersGame.WIDTH) this.x = SpaceInvadersGame.WIDTH - width;

    }

    public void setDirection(Direction newDirection) {
        if (newDirection != Direction.DOWN) {
            this.direction = newDirection;
        }
    }

    @Override
    public void kill() {
        if (!this.isAlive) return;
        isAlive = false;
        super.setAnimatedView(
                ShapeMatrix.KILL_PLAYER_ANIMATION_FIRST,
                ShapeMatrix.KILL_PLAYER_ANIMATION_SECOND,
                ShapeMatrix.KILL_PLAYER_ANIMATION_THIRD,
                ShapeMatrix.DEAD_PLAYER);
    }

    public void verifyHit(List<Bullet> bullets) {
        if (bullets.isEmpty()) {
            return;
        }
        if (this.isAlive) {
            for (int i = 0; i < bullets.size(); i++) {
                if (bullets.get(i).isAlive) {
                    if (isCollision(bullets.get(i))) {
                        kill();
                        bullets.get(i).kill();
                    }
                }
            }
        }
    }
}
