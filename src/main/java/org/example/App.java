package org.example;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
    // declare a new container to get the content pain
    Container window = getContentPane();

    /* Set Fonts and Colors ======================================= */



    /* Set Program Components ===================================== */



    /* Constructors =============================================== */
    public App(String title, int width, int height) {
        // create the window frame
        createWindow(title, width, height);

        // add components to the window

    }

    /* Methods ==================================================== */
    public void createWindow(String title, int width, int height) {
        // set title, visibility, size and default close operation
        setTitle(title);
        setVisible(true);
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /* Listeners ================================================== */


}