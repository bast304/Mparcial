/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Formularios;

/**
 *
 * @author emjuc
 */
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Configura el aspecto visual del sistema operativo
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        SwingUtilities.invokeLater(() -> {
            Matriz matriz = new Matriz();
            matriz.setVisible(true);
        });
    }
}
