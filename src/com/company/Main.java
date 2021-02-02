package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {
    int x=1;
    int y=1;

    public static void main(String[] args) {
        Main main=new Main();
        main.go();
    }
    public void go(){
        JFrame frame=new JFrame();
        MyDraw myDraw=new MyDraw();
        frame.getContentPane().add(myDraw);
        frame.setSize(700,400);
        frame.setVisible(true);
        for(int i=0;i<124;i++,x++,y++){
            x++;
            myDraw.repaint();
            try {
                Thread.sleep(50);
            }catch (Exception ex){}
        }

    }
    class MyDraw extends JPanel{
        public void paintComponent(Graphics g){
            g.setColor(Color.BLUE);
            g.fillRect(0,0,500,250);
            g.setColor(Color.white);
            g.fillRect(x,y,500-x*2,250-y*2);


        }
    }
}
