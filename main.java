/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.refreshtabs;

/**
 *
 * @author Gabriel Menezes Formiga
 */
//import java.util.Scanner;
import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;


//import java.util.concurrent.TimeUnit;
public class Main {
    static void AtualizarAbas(JFrame janela, Robot robo)     {
        boolean loop = true;
        try{
            while(loop){
                //primeira pagina
                robo.delay(3000); //espera 3 segundos ate  o user  clicar na página
                robo.keyPress(KeyEvent.VK_CONTROL);
                robo.keyPress(KeyEvent.VK_F1);
                robo.keyRelease(KeyEvent.VK_F1);
                robo.keyRelease(KeyEvent.VK_CONTROL);
                robo.keyPress(KeyEvent.VK_CONTROL);
                robo.keyPress(KeyEvent.VK_1);
                robo.keyRelease(KeyEvent.VK_1);
                robo.keyRelease(KeyEvent.VK_CONTROL);
                robo.keyPress(KeyEvent.VK_F5);
                robo.keyRelease(KeyEvent.VK_F5);
                robo.delay(60000); 
                robo.delay(60000); 

                for (int i = 0; i < 16; i++) {
                    robo.keyPress(KeyEvent.VK_CONTROL);
                    robo.keyPress(KeyEvent.VK_TAB);
                    robo.keyRelease(KeyEvent.VK_TAB);
                    robo.keyRelease(KeyEvent.VK_CONTROL);
                    robo.keyPress(KeyEvent.VK_F5);
                    robo.keyRelease(KeyEvent.VK_F5);
                    robo.delay(15000);
                }
               
        }
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(janela, "Sorry, something went wrong! Error code: "+e);
            System.exit(0);
        }
    }
    
    
    public static void main(String[] args) throws AWTException {
        Robot robo = new Robot();
        JLabel emptyLabel = new JLabel("");
        emptyLabel.setText(" Para cancelar a execução finalize a janela. ");
        JFrame janela = new JFrame("Atualizar Páginas");
        try{
            janela.add(emptyLabel);
            janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            janela.getContentPane();
            janela.pack();
            janela.setVisible(true);
            //Scanner entrada = new Scanner("System.in");
            int op = JOptionPane.showConfirmDialog(janela, "Deseja atualizar as 16 abas do navegador?");
            janela.setSize(300, 150);
            //0 para sim // 1 para não // 2 para cancelar
            //System.out.println(op);
            switch(op){
                case 0:
                    //System.out.println("ATUALIZAR ABAS");
                    while(op == 0){
                        AtualizarAbas(janela, robo);
                    }
                    break;
                case 1: 
                    //System.out.println("Não faz nada");
                    break;
                case 2:
                    System.exit(0);
                    break;
            }
            //entrada de dados - aceita um int 
            //var = entrada.nextLine();
            //System.out.println("3 segundos");

            System.exit(0);
        }catch(HeadlessException e){
            JOptionPane.showMessageDialog(janela, "Sorry, something went wrong! Error code: "+e);
            System.exit(0);
        }
    }
}
