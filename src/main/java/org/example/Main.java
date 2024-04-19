package org.example;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        test1();

//1. Create the frame.
        JFrame frame = new JFrame("FrameDemo");

//2. Optional: What happens when the frame closes?
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//3. Create components and put them in the frame.
//...create emptyLabel...
        frame.getContentPane();

//4. Size the frame.
        frame.pack();

//5. Show it.
        frame.setVisible(true);

    }

    private static void test1(){
        Persona p1 = new Persona();
        p1.getAge();
    }

    private static void test2() {

    }

}