package view;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
    	setTitle("");
        setSize(830, 635);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        JPanel panelMenu = new JPanel();
        panelMenu.setLayout(null); // Usar null layout para control manual
        panelMenu.setBackground(new Color(230, 230, 250));
        panelMenu.setBorder(BorderFactory.createTitledBorder("Menu"));
        panelMenu.setBounds(0, 0, 830, 635); // Tamaño del panel ajustado al tamaño de la ventana
        add(panelMenu);
        
        ImageIcon imagenIcon = new ImageIcon("media/Botones/Main Menu.png");
        JLabel imagenLabel = new JLabel(imagenIcon);
        imagenLabel.setBounds(1, 1, 800, 600);  // Tamaño de la imagen ajustado al tamaño de la ventana
        add(imagenLabel);
       

        ImageIcon playIcon = new ImageIcon("media/Botones/Play Button.png");
        botonPLAY = new JButton(playIcon);
        botonPLAY.setBounds(100, 50, 200, 50); // x, y, width, height
        botonPLAY.setBorderPainted(false);
        botonPLAY.setContentAreaFilled(false);
        botonPLAY.setFocusPainted(false);
        botonPLAY.setActionCommand("Play");
        panelMenu.add(botonPLAY);

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
