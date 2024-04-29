package view;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import java.awt.BorderLayout;
import java.awt.Color;


public class VentanaMenu extends JFrame {
    
    private JButton botonPLAY;
    private JButton botonNivelNormal;
    private JButton botonNivelDulce;
    private JButton botonTutorial;
    private JButton botonSalir;

    public VentanaMenu() {
    	setTitle("Menú");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        JPanel panelMenu = new JPanel();
        panelMenu.setLayout(new BoxLayout(panelMenu, BoxLayout.Y_AXIS));
        panelMenu.setBackground(new Color(230, 230, 250));
        panelMenu.setBorder(new TitledBorder("Menu"));

        botonPLAY = new JButton("PLAY");
        botonPLAY.setAlignmentX(JButton.LEFT_ALIGNMENT);
        botonPLAY.setActionCommand("Play");
        panelMenu.add(botonPLAY);
        panelMenu.add(Box.createVerticalGlue());
        panelMenu.add(Box.createVerticalStrut(15));

        botonNivelNormal = new JButton("Nivel Normal");
        botonNivelNormal.setAlignmentX(JButton.LEFT_ALIGNMENT);
        botonNivelNormal.setActionCommand("NORMAL");
        panelMenu.add(botonNivelNormal);
        panelMenu.add(Box.createVerticalGlue()); 

        botonNivelDulce = new JButton("Nivel Dulce");
        botonNivelDulce.setAlignmentX(JButton.LEFT_ALIGNMENT);
        botonNivelDulce.setActionCommand("DULCE");
        panelMenu.add(botonNivelDulce);
        panelMenu.add(Box.createVerticalGlue()); 

        botonTutorial = new JButton("Tutorial");
        botonTutorial.setAlignmentX(JButton.LEFT_ALIGNMENT);
        botonTutorial.setActionCommand("TUTORIAL");
        panelMenu.add(botonTutorial);
        panelMenu.add(Box.createVerticalGlue()); 
        botonSalir = new JButton("Salir");
        botonSalir.setAlignmentX(JButton.LEFT_ALIGNMENT);
        botonSalir.setActionCommand("SALIR");
        panelMenu.add(botonSalir);
        panelMenu.add(Box.createVerticalGlue()); 

        JPanel panelContenedor = new JPanel(new BorderLayout());
        panelContenedor.add(panelMenu, BorderLayout.CENTER);

        add(panelContenedor);

        setVisible(true);
    }
}
