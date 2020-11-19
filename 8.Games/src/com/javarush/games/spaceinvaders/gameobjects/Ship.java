package com.javarush.games.spaceinvaders.gameobjects;

public class Ship extends GameObject{
    public boolean isAlive = true;

    public void kill(){
        isAlive = false;
    }

    public Bullet fire(){
        return null;
    }

    public Ship(double x, double y) {
        super(x, y);
    }

   public void setStaticView(int[][] viewFrame){
       setMatrix(viewFrame);
    }

}
