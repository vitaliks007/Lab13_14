package com.mireahw.lab13_14;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import java.util.Arrays;

public class Controller {
    private char turn = 0;
    private int[][] field = new int[4][4];
    private boolean init = false;
    public static Integer horCell = 0;
    public static Integer vertCell= 0;

    @FXML
    public Canvas canvas;

    private GraphicsContext context;

    public void drawField() {
        for (int i = 1; i<4; i++) {
            context.strokeLine(i * 100, 0, i * 100, 400);
            context.strokeLine(0, i * 100, 400, i * 100);
        }
    }

    public void setHorCell(int horCell) {
        this.horCell = horCell;
    }

    public void setVertCell(int vertCell) {
        this.vertCell = vertCell;
    }

    public int getHorCell() {
        return horCell;
    }

    public int getVertCell() {
        return vertCell;
    }

    public Canvas getCanvas() {
        return canvas;
    }

    @FXML
    public void canvasClicked() {
        int horCellInner;
        int vertCellInner;

        if (!init){
            this.context = canvas.getGraphicsContext2D();
            context.setStroke(Color.BLACK);
            context.setLineWidth(2);
            drawField();
            Arrays.stream(field).forEach((s0) -> Arrays.stream(s0).forEach((s1) -> s1 = 0));
            init = true;

        } else {


            horCellInner = Controller.horCell;
            vertCellInner = Controller.vertCell;

            context.strokeText(horCellInner + " " + vertCellInner, 100, 100);

            if (field[horCellInner][vertCellInner] == 0) {
                if (turn == 0) {
                    context.strokeOval(horCellInner * 100 + 5, vertCellInner * 100 + 5,
                            horCellInner * 100 + 90, vertCellInner * 100 + 90);
                }
            }
        }
    }
}