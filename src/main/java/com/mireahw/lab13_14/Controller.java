package com.mireahw.lab13_14;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;

public class Controller {
    private boolean init = false;
    private char turn = 0;

    @FXML
    private Canvas canvas;

    private Drawer drawer = new Drawer(canvas);

    @FXML
    public void canvasClicked() {
        if (!init) {

        }
    }
}