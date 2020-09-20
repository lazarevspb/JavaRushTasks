package com.javarush.games.minesweeper;

import com.javarush.engine.cell.*;

public class MinesweeperGame extends Game {
    private final static int SIDE = 9;

    private GameObject[][] gameField = new GameObject[SIDE][SIDE];

    @Override
    public void initialize() {
        super.initialize();
        setScreenSize(SIDE, SIDE);
        createGame();
    }

   private void createGame(){
       for (int i = 0; i < SIDE; i++) {
           for (int j = 0; j < SIDE; j++) {
               gameField[j][i] = new GameObject(i, j);
               setCellColor(i, j, Color.BLUE);
           }
       }
   }
}

