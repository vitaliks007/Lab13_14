package com.mireahw.lab13_14;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Controller {
    private boolean init = false;
    private char turn = 0;

    @FXML
    private Canvas canvas;

    private GraphicsContext context;

    public void drawField() {
        for (int i = 1; i<4; i++) {
            context.strokeLine(i * 100, 0, i * 100, 400);
            context.strokeLine(0, i * 100, 400, i * 100);
        }
    }

    @FXML
    public void canvasClicked() {
        this.context = canvas.getGraphicsContext2D();
        if (!init) {
            context.setStroke(Color.BLACK);
            context.setLineWidth(2);
            drawField();
        }
    }
}