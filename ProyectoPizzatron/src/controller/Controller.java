package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.VentanaGorras;
import view.VentanaCamisas;
import view.VentanaPantalones;
import view.VentanaColor;
import view.VentanaItems;

public class Controller {
    
    private VentanaItems ventanaItems;

    public Controller() {
        ventanaItems = new VentanaItems();
        ventanaItems.setActionListenerGorra(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Abrir la ventana de selección de gorras
                VentanaGorras ventanaGorras = new VentanaGorras();
                ventanaGorras.setVisible(true);
            }
        });

        ventanaItems.setActionListenerCamisa(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Abrir la ventana de selección de camisas
                VentanaCamisas ventanaCamisas = new VentanaCamisas();
                ventanaCamisas.setVisible(true);
            }
        });

        ventanaItems.setActionListenerPantalon(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Abrir la ventana de selección de pantalones
                VentanaPantalones ventanaPantalones = new VentanaPantalones();
                ventanaPantalones.setVisible(true);
            }
        });

        ventanaItems.setActionListenerColor(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Abrir la ventana de selección de color
                VentanaColor ventanaColor = new VentanaColor();
                ventanaColor.setVisible(true);
            }
        });
    }
}
