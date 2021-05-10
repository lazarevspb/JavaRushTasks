package com.javarush.task.task23.task2312;

import java.util.ArrayList;
import java.util.List;

public class Snake {
    private List<SnakeSection> sections;
    private boolean isAlive;
    private SnakeDirection direction;

    void move() {
        if (!isAlive) {
            return;
        }
        if (direction == SnakeDirection.UP) {
            move(0, -1);
        }
        if (direction == SnakeDirection.RIGHT) {
            move(1, 0);
        }
        if (direction == SnakeDirection.DOWN) {
            move(0, 1);
        }
        if (direction == SnakeDirection.LEFT) {
            move(-1, 0);
        }
    }

    void move(int x, int y) {
        SnakeSection head = new SnakeSection(sections.get(0).getX() + x, sections.get(0).getY() + y);
        SnakeSection lastElement = sections.get(sections.size() - 1);
        Mouse mouse = Room.game.getMouse();

        checkBorders(head);
        checkBody(head);

        step(head, lastElement);
        eatMouse(head, lastElement, mouse);
    }

    private void step(SnakeSection head, SnakeSection lastElement) {
        if (isAlive) {
            sections.add(0, head);
            sections.remove(lastElement);
        }
    }

    private void eatMouse(SnakeSection newHead, SnakeSection lastElement, Mouse mouse) {
        if (newHead.getX() == mouse.getX() && newHead.getY() == mouse.getY()) {
            Room.game.eatMouse();
            sections.add(0, newHead);
        } else {
            sections.remove(lastElement);
        }
    }

    public Snake(int x, int y) {
        sections = new ArrayList<>();
        sections.add(new SnakeSection(x, y));
        this.isAlive = true;
    }

    int getX() {
        return sections.get(0).getX();
    }

    int getY() {

        return sections.get(0).getY();
    }

    public void setDirection(SnakeDirection direction) {
        this.direction = direction;
    }

    public List<SnakeSection> getSections() {
        return sections;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public SnakeDirection getDirection() {
        return direction;
    }

    void checkBorders(SnakeSection head) {
        if (head.getX() >= Room.game.getWidth()
                || head.getY() >= Room.game.getHeight()) {
            isAlive = false;
        }
    }

    void checkBody(SnakeSection head) {
        if (sections.contains(head)) {
            isAlive = false;
        }
    }
}
