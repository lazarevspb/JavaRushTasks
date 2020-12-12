package com.javarush.games.spaceinvaders.gameobjects;

import com.javarush.engine.cell.Game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ship extends GameObject {
    public boolean isAlive = true;
    private List<int[][]> frames;
    private int frameIndex;


    @Override
    public void draw(Game game) {
        super.draw(game);
        nextFrame();
    }

    public void nextFrame() {
        if (frameIndex < frames.size() - 1) {
            frameIndex++;
            this.matrix = frames.get(frameIndex);
        }
    }

    public void kill() {
        isAlive = false;
    }

    public void setAnimatedView(int[][]... viewFrames) {
        super.setMatrix(viewFrames[0]);
        frames = Arrays.asList(viewFrames);
        frameIndex = 0;
    }

    public Bullet fire() {
        return null;
    }

    public Ship(double x, double y) {
        super(x, y);
    }

    public void setStaticView(int[][] viewFrame) {
        setMatrix(viewFrame);
        frames = new ArrayList<int[][]>();
        frames.add(viewFrame);
        frameIndex = 0;
    }

}
