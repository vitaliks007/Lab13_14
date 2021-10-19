package com.mireahw.lab13_14;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Drawer {
    private Canvas canvas;
    private GraphicsContext context = canvas.getGraphicsContext2D();

    public Drawer(Canvas canvas) {
        this.canvas = canvas;
        context.setStroke(Color.BLACK);
        context.setLineWidth(2);
    }

    public void drawField() {
        for (int i = 1; i<4; i++) {
            context.strokeLine(i * 100, 0, i * 100, 400);
        }
    }
}
