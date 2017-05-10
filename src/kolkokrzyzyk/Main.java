/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolkokrzyzyk;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Bartus
 */
public class Main extends JFrame{

    int counter =0;
    
    public Main(){
       setSize(800,800);
       setVisible(true);
       setTitle("Kółko i krzyżyk");
       setLayout(new GridLayout(3,3));
       for(int i=1; i <=9; i++){
            JButton button = new JButton("X");
            add(button);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton button = (JButton)e.getSource();
                    if(counter % 2 == 0){
                        button.setText("X");
                        System.out.println("X");
                    }else{
                        button.setText("O");
                        System.out.println("O");
                    }
                    button.setEnabled(false);
                    counter++;
                }
            });
       }
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run() {
                new Main();
            }
        });    
    } 
}
