/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.refreshtabs;

/**
 *
 * @author hepta
 */
//import java.util.Scanner;
import java.awt.AWTException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Robot;
import java.awt.event.KeyEvent;


//import java.util.concurrent.TimeUnit;
public class Main {
    static void AtualizarAbas(JFrame janela, Robot robo)     {
        
        try{
            
            robo.delay(10000); //espera 10 segundos para clicar na página
            robo.keyPress(KeyEvent.VK_F5);
            robo.keyRelease(KeyEvent.VK_F5);
            robo.delay(6000); //espera 10 segundos para clicar na página
            robo.keyPress(KeyEvent.VK_CONTROL);
            robo.keyPress(KeyEvent.VK_TAB);
            robo.keyRelease(KeyEvent.VK_TAB);
            robo.keyRelease(KeyEvent.VK_CONTROL);
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(janela, "Sorry, something went wrong! Error code: "+e);
            System.exit(0);
        }
    }
    
    
    public static void main(String[] args) throws AWTException {
        Robot robo = new Robot();
        JFrame janela = new JFrame("Janela");
        //Scanner entrada = new Scanner("System.in");
        int op = JOptionPane.showConfirmDialog(janela, "Deseja atualizar as 16 abas do navegador?");
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
    }
}
