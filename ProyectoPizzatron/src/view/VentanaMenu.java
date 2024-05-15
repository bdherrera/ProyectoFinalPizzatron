package view;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.PerfilJugador;

import java.awt.BorderLayout;
import java.awt.Color;

public class VentanaMenu extends JFrame {

    private VentanaPLAY jugador;
    private VentanaProfiles jugador2;
    private VentanaRegistroJugador jugador3;
    private VentanaTutorial jugador4;
    private JButton botonPLAY;

    private JButton botonTutorial;

    private JButton botonProfiles;
    private JButton botonCharacter;
    private PerfilJugador perfilJugador;

    public VentanaMenu(PerfilJugador perfilJugador) {
        this.perfilJugador = perfilJugador;
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
        imagenLabel.setBounds(1, 1, 800, 600); // Tamaño de la imagen ajustado al tamaño de la ventana
        panelMenu.add(imagenLabel);

        ImageIcon playIcon = new ImageIcon("media/Botones/Play Button.png");
        botonPLAY = new JButton(playIcon);
        botonPLAY.setBounds(60, 280, 200, 50); // x, y, width, height
        botonPLAY.setAlignmentX(JButton.LEFT_ALIGNMENT);
        botonPLAY.setActionCommand("PLAY");
        botonPLAY.repaint();
        panelMenu.add(botonPLAY);

        ImageIcon profilesIcon = new ImageIcon("media/Botones/profiles.png");
        botonProfiles = new JButton(profilesIcon);
        botonProfiles.setBounds(60, 320, 200, 50);
        botonProfiles.setAlignmentX(JButton.LEFT_ALIGNMENT);
        botonProfiles.setActionCommand("PROFILES");
        botonProfiles.repaint();
        panelMenu.add(botonProfiles);

        ImageIcon tutorialIcon = new ImageIcon("media/Botones/how to play.png");
        botonTutorial = new JButton(tutorialIcon);
        botonTutorial.setBounds(60, 370, 200, 50);
        botonTutorial.setAlignmentX(JButton.LEFT_ALIGNMENT);
        botonTutorial.setActionCommand("TUTORIAL");
        panelMenu.add(botonTutorial);

        ImageIcon characterIcon = new ImageIcon("media/Botones/character.png");
        botonCharacter = new JButton(characterIcon);
        botonCharacter.setBounds(60, 410, 200, 50);
        botonCharacter.setAlignmentX(JButton.LEFT_ALIGNMENT);
        botonCharacter.setActionCommand("CHARACTER");
        botonCharacter.repaint();
        panelMenu.add(botonCharacter);

        JPanel panelContenedor = new JPanel(new BorderLayout());
        panelContenedor.add(panelMenu, BorderLayout.CENTER);

        add(panelContenedor);

        setVisible(true);

        panelMenu.validate();
        panelMenu.repaint();
    }

    public JButton getBotonPLAY() {
        return botonPLAY;
    }

    public JButton getBotonTutorial() {
        return botonTutorial;
    }

    public JButton getBotonProfiles() {
        return botonProfiles;
    }

    public JButton getBotonCharacter() {
        return botonCharacter;
    }
}
