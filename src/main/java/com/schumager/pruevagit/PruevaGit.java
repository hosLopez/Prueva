/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.schumager.pruevagit;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

/**
 *
 * @author Hos
 */
public class PruevaGit {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Hello World2!");
        System.err.println("Hello Wordd3");
        for (int i = 0; i < 10; i++) {
            System.out.println("com.schumager.pruevagit.PruevaGit.main() "+i);
        }
        int j=0;
        while(j<10){
            System.out.println("numero j = "+j);
            ++j;
        }
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        ventana.setSize(300,300);
        ventana.setVisible(true);
    }
}
