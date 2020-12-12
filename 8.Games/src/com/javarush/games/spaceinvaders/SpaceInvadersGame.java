package com.javarush.games.spaceinvaders;

import com.javarush.engine.cell.*;
import com.javarush.games.spaceinvaders.gameobjects.Bullet;
import com.javarush.games.spaceinvaders.gameobjects.EnemyFleet;
import com.javarush.games.spaceinvaders.gameobjects.PlayerShip;
import com.javarush.games.spaceinvaders.gameobjects.Star;
import com.javarush.engine.cell.Game;

import java.util.ArrayList;
import java.util.List;


public class SpaceInvadersGame extends Game {
    public static final int WIDTH = 64;
    public static final int HEIGHT = 64;
    public static final int COMPLEXITY = 5;
    private EnemyFleet enemyFleet;
    private List<Star> stars;
    private List<Bullet> enemyBullets;
    private PlayerShip playerShip;
    private boolean isGameStopped;
    private int animationsCount;


    @Override
    public void initialize() {
        setScreenSize(WIDTH, HEIGHT);
        createGame();
//        System.out.println(Color.values()[new  matrix[y][x]]);
    }

    @Override
    public void onKeyPress(Key key) {
        if (key == Key.SPACE && isGameStopped) {
            createGame();
            return;
        }
//        else if (key == Key.SPACE) { createGame(); }
        else if (key == Key.LEFT) { playerShip.setDirection(Direction.LEFT); }
        else if (key == Key.RIGHT) { playerShip.setDirection(Direction.RIGHT); }
    }

    private void stopGameWithDelay() {
        animationsCount++;
        if (animationsCount >= 10) stopGame(playerShip.isAlive);
    }

    private void stopGame(boolean isWin) {
        isGameStopped = true;
        stopTurnTimer();
        if (isWin) showMessageDialog(Color.ALICEBLUE, "Победа", Color.GREEN, 30);
        else showMessageDialog(Color.ALICEBLUE, "Поражение", Color.RED, 54);

    }


    private void check() {
        playerShip.verifyHit(enemyBullets);
        removeDeadBullets();
        if (!playerShip.isAlive) stopGameWithDelay();

    }

    private void removeDeadBullets() {
        enemyBullets.removeIf(bullet1 -> (!bullet1.isAlive) || bullet1.y >= HEIGHT - 1);
    }

    private void moveSpaceObjects() {
        enemyFleet.move();
        enemyBullets.forEach(Bullet::move);
    }


    private void createStars() {
        stars = new ArrayList<Star>();

        for (int i = 0; i < 8; i++) {
            stars.add(new Star(3 + Math.random() * HEIGHT, 3 + Math.random() * WIDTH));
        }


    }


    private void drawField() {
        for (int y = 0; y < WIDTH; y++) {
            for (int x = 0; x < HEIGHT; x++) {
                setCellValueEx(x, y, Color.BLACK, "");

            }
        }
        stars.forEach(star -> star.draw(this));
    }

    private void createGame() {
        createStars();
        enemyFleet = new EnemyFleet();
        enemyBullets = new ArrayList<Bullet>();
        playerShip = new PlayerShip();
        isGameStopped = false;
        animationsCount = 0;
        drawScene();
        setTurnTimer(40);
    }

    private void drawScene() {
        drawField();
        playerShip.draw(this);
        enemyBullets.forEach(bullet -> bullet.draw(this));
        enemyFleet.draw(this);
    }

    @Override
    public void onTurn(int step) {
        Bullet bullet = enemyFleet.fire(this);
        moveSpaceObjects();
        if (bullet != null) enemyBullets.add(bullet);
        check();
        drawScene();
    }
}
