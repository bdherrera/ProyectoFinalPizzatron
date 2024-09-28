package salado;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Pizza extends JPanel {
    private Path2D.Double path; // El trazado de puntos para pintar
    private Ellipse2D.Double drawingArea; // El área de dibujo delimitada por un óvalo
    private boolean painting; // Indica si se está pintando o no
    private int lastX, lastY; // Última posición del ratón
    private List<Integer> imagenes;
    private boolean tieneRelleno;

    private ImageIcon imagen1; // La primera imagen
	private ImageIcon imagen2;
	private ImageIcon imagen11; // La undécima imagen
	private ImageIcon imagen3;
	private ImageIcon imagen4;
	private ImageIcon imagen5;
	private ImageIcon imagen8;
	
    private ImageIcon imagen7; // La séptima imagen
    private ImageIcon imagen10;
    private ImageIcon imagen12;
    private ImageIcon imagen13;
    private ImageIcon imagen14;
    private ImageIcon imagen15;
    private ImageIcon imagen16;
    private ImageIcon imagen17;
    private ImageIcon imagen18;
    private ImageIcon imagen19;
    private ImageIcon imagen20;
    private ImageIcon imagen21;
    private ImageIcon imagen22;
    private ImageIcon imagen23;
 
    
    private ImageIcon brushImage1; // La imagen del primer pincel
    private ImageIcon brushImage2; // La imagen del segundo pincel

    private int brushSize1 = 20; // Tamaño del primer pincel
    private int brushWidth1 = 50; // Ancho del primer pincel
    private int brushHeight1 = 70; // Alto del primer pincel

    private int brushSize2 = 20; // Tamaño del segundo pincel
    private int brushWidth2 = 50; // Ancho del segundo pincel
    private int brushHeight2 = 70; // Alto del segundo pincel
    
    private int x1 = 695;
	private int x2 = 0;
	private int x11 = 0;

    private int x7 = 0;
    private int y7 = 457; // Posición y de la imagen 7
    private int x10 = 795;
    private int x12 = 130;
    private int y12 = 320;
    private int x13 = 170;
    private int y13 = 320;
    private int x14 = 220;
    private int y14 = 345;
    private int x16 = 310;
    private int y16 = 367;
    private int x18 = 410;
    private int y18 = 360;
    private int x20 = 500;
    private int y20 = 360;
    private int x22 = 590;
    private int y22 = 360;
    private int x15, y15;
    private int x17, y17;
    private int x19, y19;
    private int x21, y21;
    private int x23, y23;
    private boolean imagen15Visible; // Indica si la imagen 15 está visible o no
    private boolean imagen17Visible;
    private boolean imagen19Visible;
    private boolean imagen21Visible;
    private boolean imagen23Visible;
    private int imagen17Counter = 0;
    private int imagen19Counter = 0;
    private int imagen21Counter = 0;
    private int imagen23Counter = 0;
    private boolean isRedBrush = false; // Indica si el pincel es rojo o no

    public Pizza() {
        this.setSize(820, 630); // Se selecciona el tamaño del panel
        this.imagenes = new ArrayList<>();
        // Aquí puedes agregar las imágenes que tenga la pizza por defecto
        this.imagenes.add(7);
        this.imagenes.add(15);
        this.imagenes.add(17);
        this.imagenes.add(19);
        this.imagenes.add(21);
        this.imagenes.add(23);
        // Aquí puedes establecer si la pizza tiene relleno por defecto
        this.tieneRelleno = true;
        imagen1 = new ImageIcon(getClass().getResource("/Imagenes/tuberia.png"));
        imagen2 = new ImageIcon(getClass().getResource("/Imagenes/BARRA.png"));
        imagen11 = new ImageIcon(getClass().getResource("/Imagenes/Estante.png"));
        imagen3 = new ImageIcon(getClass().getResource("/Imagenes/AgarradorIzquierdoFront.png"));
        imagen4 = new ImageIcon(getClass().getResource("/Imagenes/AgarradorIzquierdo Back.png"));
        imagen5 = new ImageIcon(getClass().getResource("/Imagenes/Agarrador Derecho Front.png"));
        imagen8 = new ImageIcon(getClass().getResource("/Imagenes/Crust.png"));
        
        imagen7 = new ImageIcon(getClass().getResource("/Imagenes/Base.png"));
        imagen10 = new ImageIcon(getClass().getResource("/Imagenes/Caja.png"));
        
        imagen12 = new ImageIcon(getClass().getResource("/Imagenes/SalsadePizza.png"));
        imagen13 = new ImageIcon(getClass().getResource("/Imagenes/SalsaPicante.png"));
        
        imagen14 = new ImageIcon(getClass().getResource("/Imagenes/KESO.png"));
        imagen15 = new ImageIcon(getClass().getResource("/Imagenes/quesoenpizza.png"));
        
        imagen16 = new ImageIcon(getClass().getResource("/Imagenes/ALGAS.png"));
        imagen17 = new ImageIcon(getClass().getResource("/Imagenes/ALGITA.png"));
        
        imagen18 = new ImageIcon(getClass().getResource("/Imagenes/peces.png"));
        imagen19 = new ImageIcon(getClass().getResource("/Imagenes/Fish1.png"));
        
        imagen20 = new ImageIcon(getClass().getResource("/Imagenes/Calamares.png"));
        imagen21 = new ImageIcon(getClass().getResource("/Imagenes/Squid2.png"));
        
        imagen22 = new ImageIcon(getClass().getResource("/Imagenes/CAMARONES.png"));
        imagen23 = new ImageIcon(getClass().getResource("/Imagenes/sHRIMP.png"));
        
        
        brushImage1 = new ImageIcon(getClass().getResource("/Imagenes/SalsaPicante.png"));
        brushImage2 = new ImageIcon(getClass().getResource("/Imagenes/SalsadePizza.png"));
        
        x15 = x7 + 30;
        y15 = y7 + 50; // Cambia esto según sea necesario
        imagen15Visible = false;
        
        x17 = x7 + 30;
        y17 = y7 + 50; // Cambia esto según sea necesario
        imagen17Visible = false;
        
        x19 = x7 + 30;
        y19 = y7 + 50; // Cambia esto según sea necesario
        imagen19Visible = false;
        
        x21 = x7 + 30;
        y21 = y7 + 50; // Cambia esto según sea necesario
        imagen21Visible = false;
        
        x23 = x7 + 30;
        y23 = y7 + 50; // Cambia esto según sea necesario
        imagen23Visible = false;
        
        

        path = new Path2D.Double();
        painting = false;

        // Calcular el tamaño del óvalo para delimitar el área de dibujo
     // Calcular el tamaño del óvalo para delimitar el área de dibujo
        double width = imagen7.getIconWidth() * 0.25; // Reducir el ancho a un 20% del tamaño original
        double height = imagen7.getIconHeight() * 0.29; // Reducir la altura a un 20% del tamaño original

        drawingArea = new Ellipse2D.Double(x7, y7, width, height);

        

        // Agregar un MouseListener para detectar clics dentro del área de dibujo
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                // Iniciar el trazado del path cuando se hace clic en el área de dibujo
                if (drawingArea.contains(e.getPoint())) {
                    path.moveTo(e.getX(), e.getY());
                    painting = true;
                    lastX = e.getX();
                    lastY = e.getY();
                }
                // Detectar el clic en la imagen 12
                if (x12 <= e.getX() && e.getX() <= x12 + 60 && y12 <= e.getY() && e.getY() <= y12 + 175) {
                    brushImage2 = imagen12; // Cambiar al pincel 2 si se selecciona la imagen 12
                    brushSize2 = 30; // Cambiar el tamaño del segundo pincel si se selecciona la imagen 12
                    isRedBrush = false; // Establecer el color del trazo a naranja
                    System.out.println("Se ha tocado la imagen 12");
                }
                // Detectar el clic en la imagen 13
                if (x13 <= e.getX() && e.getX() <= x13 + 60 && y13 <= e.getY() && e.getY() <= y13 + 175) {
                    brushImage1 = imagen13; // Cambiar al pincel 1 si se selecciona la imagen 13
                    brushSize1 = 15; // Cambiar el tamaño del primer pincel si se selecciona la imagen 13
                    isRedBrush = true; // Establecer el color del trazo a rojo
                    System.out.println("Se ha tocado la imagen 13");
                }
                if (x14 <= e.getX() && e.getX() <= x14 + 180 && y14 <= e.getY() && e.getY() <= y14 + 125) {
                    setImagen15Visible(true);
                }
                if (x16 <= e.getX() && e.getX() <= x16 + 115 && y16 <= e.getY() && e.getY() <= y16 + 145) {
                    setImagen17Visible(true); // Generar la imagen 17
                    
                }
                if (x18 <= e.getX() && e.getX() <= x18 + 115 && y18 <= e.getY() && e.getY() <= y18 + 145) {
                    setImagen19Visible(true); // Generar la imagen 17
                }

                // Generar imagen21
                if (x20 <= e.getX() && e.getX() <= x20 + 115 && y20 <= e.getY() && e.getY() <= y20 + 145) {
                    setImagen21Visible(true); // Generar la imagen 21
                }

                // Generar imagen23
                if (x22 <= e.getX() && e.getX() <= x22 + 115 && y22 <= e.getY() && e.getY() <= y22 + 145) {
                    setImagen23Visible(true); // Generar la imagen 23
                }

            
        }
        

            @Override
            public void mouseReleased(MouseEvent e) {
                // Finalizar el trazado del path cuando se suelta el botón del ratón
                painting = false;
            }
        });
        
        // Agregar un MouseListener para detectar clics en la imagen 16
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (x16 <= e.getX() && e.getX() <= x16 + 115 && y16 <= e.getY() && e.getY() <= y16 + 145) {
                    generarImagenes17();
                }
                
                if (x18 <= e.getX() && e.getX() <= x18 + 115 && y18 <= e.getY() && e.getY() <= y18 + 145) {
                    generarImagenes19();
                }
                if (x20 <= e.getX() && e.getX() <= x20 + 115 && y20 <= e.getY() && e.getY() <= y20 + 145) {
                    generarImagenes21();
                }
                if (x22 <= e.getX() && e.getX() <= x22 + 115 && y22 <= e.getY() && e.getY() <= y22 + 145) {
                    generarImagenes23();
                }
                
                
            }
        });


        // Agregar un MouseMotionListener para pintar mientras se mueve el ratón
        addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                if (painting && drawingArea.contains(e.getPoint())) {
                    // Crear un contexto de gráficos específico para el área de dibujo
                    Graphics2D g2d = (Graphics2D) getGraphics();
                    Graphics2D areaG2d = (Graphics2D) g2d.create();

                    // Dibujar el trazo con la imagen del pincel en el área de dibujo
                    areaG2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                    if (isRedBrush) {
                        areaG2d.drawImage(brushImage1.getImage(), e.getX() - brushSize1 / 2, e.getY() - brushSize1 / 2, brushWidth1, brushHeight1, null);
                    } else {
                        areaG2d.drawImage(brushImage2.getImage(), e.getX() - brushSize2 / 2, e.getY() - brushSize2 / 2, brushWidth2, brushHeight2, null);
                    }
                    areaG2d.dispose();

                    // Cambiar el color del trazo si el pincel es rojo
                    if (isRedBrush) {
                        g2d.setColor(Color.RED);
                    } else {
                        g2d.setColor(Color.ORANGE);
                    }

                    // Añadir puntos al trazado mientras se arrastra el ratón dentro del área de dibujo
                    path.quadTo(lastX, lastY, (lastX + e.getX()) / 2, (lastY + e.getY()) / 2);
                    lastX = e.getX();
                    lastY = e.getY();
                    repaint();
                }
            }
        });


        // Configurar temporizadores para mover las imágenes
        configureTimers();
    }

    private void configureTimers() {
        Timer timer10 = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x7 += 1; // Cambia esto para ajustar la velocidad de movimiento en el eje x
                if (x7 > getWidth()) { // Si la imagen ha llegado al final del panel
                    x7 = -imagen7.getIconWidth(); // La imagen vuelve al inicio
                }
             // Actualizar el tamaño del área de dibujo del óvalo manteniendo su posición central
                double width = imagen7.getIconWidth() * 0.263; // Reducir el ancho a un 20% del tamaño original
                double height = imagen7.getIconHeight() * 0.28; // Reducir la altura a un 20% del tamaño original
       
                drawingArea.setFrame(x7 - (width / 500)+10, y7 - (height / 10000000)+11.5, width, height);


                detectarColision();
                repaint();
            }
        });
        timer10.start();
    }

    private void detectarColision() {
        Rectangle cajaBounds = new Rectangle(x10, 356, 220, 287); // Área de la caja
        Rectangle pizzaBounds = new Rectangle(x7, y7, 220, 220); // Área de la pizza

        if (cajaBounds.intersects(pizzaBounds)) { // Si hay intersección entre las dos áreas
            System.out.println("¡Colisión detectada!"); // Mostrar mensaje en la consola
            reiniciarDibujo(); // Reiniciar el trazado del área de dibujo
            limpiarImagenes(); // Limpiar las imágenes generadas encima de la imagen 7
        }
    }

    private void reiniciarDibujo() {
        // Reiniciar el trazado del path
        path.reset();
        repaint(); // Volver a pintar el panel para reflejar los cambios
    }

    private void limpiarImagenes() {
        // Establecer el contador de imágenes a 0
        imagen17Counter = 0;
        imagen19Counter = 0;
        imagen21Counter = 0;
        imagen23Counter = 0;
        setImagen15Visible(false);

        // Redibujar el panel para eliminar las imágenes generadas
        repaint();
    }
    
    //primera parte
    
    private void generarImagenes17() {
        imagen17Counter++; // Incrementar el contador de imágenes 17
        System.out.println("Se han generado " + imagen17Counter + " imágenes 17");

        // Redibujar el panel para mostrar las imágenes 17 generadas
        repaint();
    }
    
    private void drawImagen17(Graphics g, int xOffset, int yOffset) {
        // Calcular las coordenadas relativas a la posición de la imagen 7
        int relativeX = x7 + xOffset;
        int relativeY = y7 + yOffset;
        
        // Mover la imagen 17 para que siga a la imagen 7
        moveImage17(relativeX, relativeY); // Actualizar la posición de la imagen 17
        
        // Dibujar la imagen 17
        g.drawImage(imagen17.getImage(), relativeX, relativeY, 100, 100, null);
        
        // Ajustar las coordenadas de la próxima imagen 17
        x17 += 110; // Mover la siguiente imagen 17 hacia la derecha
        if (x17 + xOffset > getWidth()) {
            x17 = x7; // Volver a la posición inicial si se alcanza el límite del panel
            y17 += 30; // Mover la siguiente imagen 17 hacia abajo
        }
    }
    
    public void moveImage17(int deltaX, int deltaY) {
        // Mover la imagen 15 relativa a la imagen 7
        x17 += deltaX;
        y17 += deltaY;
    }
    public void setImagen17Visible(boolean visible) {
        imagen17Visible = visible;
    }
    
    ///segunda parte
    
    private void generarImagenes19() {
        imagen19Counter++; // Incrementar el contador de imágenes 17
        System.out.println("Se han generado " + imagen17Counter + " imágenes 19");

        // Redibujar el panel para mostrar las imágenes 17 generadas
        repaint();
    }
    
    private void drawImagen19(Graphics g, int xOffset, int yOffset) {
        // Calcular las coordenadas relativas a la posición de la imagen 7
        int relativeX = x7 + xOffset;
        int relativeY = y7 + yOffset;
        
        // Mover la imagen 17 para que siga a la imagen 7
        moveImage19(relativeX, relativeY); // Actualizar la posición de la imagen 17
        
        // Dibujar la imagen 17
        g.drawImage(imagen19.getImage(), relativeX, relativeY, 100, 100, null);
        
        // Ajustar las coordenadas de la próxima imagen 17
        x19 += 110; // Mover la siguiente imagen 17 hacia la derecha
        if (x19 + xOffset > getWidth()) {
            x19 = x7; // Volver a la posición inicial si se alcanza el límite del panel
            y19 += 30; // Mover la siguiente imagen 17 hacia abajo
        }
    }
    
    public void moveImage19(int deltaX, int deltaY) {
        // Mover la imagen 15 relativa a la imagen 7
        x19 += deltaX;
        y19 += deltaY;
    }
    public void setImagen19Visible(boolean visible) {
        imagen19Visible = visible;
    }
    
    //tercera parte
    
    private void generarImagenes21() {
        imagen21Counter++; // Incrementar el contador de imágenes 17
        System.out.println("Se han generado " + imagen17Counter + " imágenes 21");

        // Redibujar el panel para mostrar las imágenes 17 generadas
        repaint();
    }
    
    private void drawImagen21(Graphics g, int xOffset, int yOffset) {
        // Calcular las coordenadas relativas a la posición de la imagen 7
        int relativeX = x7 + xOffset;
        int relativeY = y7 + yOffset;
        
        // Mover la imagen 17 para que siga a la imagen 7
        moveImage21(relativeX, relativeY); // Actualizar la posición de la imagen 17
        
        // Dibujar la imagen 17
        g.drawImage(imagen21.getImage(), relativeX, relativeY, 100, 100, null);
        
        // Ajustar las coordenadas de la próxima imagen 17
        x21 += 110; // Mover la siguiente imagen 17 hacia la derecha
        if (x21 + xOffset > getWidth()) {
            x21 = x7; // Volver a la posición inicial si se alcanza el límite del panel
            y21 += 30; // Mover la siguiente imagen 17 hacia abajo
        }
    }
    
    public void moveImage21(int deltaX, int deltaY) {
        // Mover la imagen 15 relativa a la imagen 7
        x21 += deltaX;
        y21 += deltaY;
    }
    public void setImagen21Visible(boolean visible) {
        imagen21Visible = visible;
    }
    //cuarta parte
    
  
    private void generarImagenes23() {
        imagen23Counter++; // Incrementar el contador de imágenes 17
        System.out.println("Se han generado " + imagen17Counter + " imágenes 23");

        // Redibujar el panel para mostrar las imágenes 17 generadas
        repaint();
    }
    
    
    private void drawImagen23(Graphics g, int xOffset, int yOffset) {
        // Calcular las coordenadas relativas a la posición de la imagen 7
        int relativeX = x7 + xOffset;
        int relativeY = y7 + yOffset;
        
        // Mover la imagen 17 para que siga a la imagen 7
        moveImage23(relativeX, relativeY); // Actualizar la posición de la imagen 17
        
        // Dibujar la imagen 17
        g.drawImage(imagen23.getImage(), relativeX, relativeY, 50, 50, null);
        
        // Ajustar las coordenadas de la próxima imagen 17
        x23 += 110; // Mover la siguiente imagen 17 hacia la derecha
        if (x23 + xOffset > getWidth()) {
            x23 = x7; // Volver a la posición inicial si se alcanza el límite del panel
            y23 += 30; // Mover la siguiente imagen 17 hacia abajo
        }
    }
    
    public void moveImage23(int deltaX, int deltaY) {
        // Mover la imagen 15 relativa a la imagen 7
        x23 += deltaX;
        y23 += deltaY;
    }
    public void setImagen23Visible(boolean visible) {
        imagen23Visible = visible;
    }
    
    //quinta parte


    private void drawImagen15(Graphics g) {
        // Dibujar la imagen 15 encima de la imagen 7 y del área de pintado
        g.drawImage(imagen15.getImage(), x15, y15, 220, 160, null);
        //System.out.println("Se ha generado la imagen 15 encima de la imagen 7 y del área de pintado");
    }

    public void moveImage15(int deltaX, int deltaY) {
        // Mover la imagen 15 relativa a la imagen 7
        x15 += deltaX;
        y15 += deltaY;
    }
    
    public void setImagen15Visible(boolean visible) {
        imagen15Visible = visible;
        if (visible) {
            //System.out.println("Se ha generado la imagen 15 encima de la imagen 7 y del área de pintado");
        }
        
        
    }
 // Método para verificar si la pizza tiene relleno
    public boolean tieneRelleno() {
        return this.tieneRelleno;
    }

    // Método para obtener las imágenes que tiene la pizza
    public List<Integer> getImagenes() {
        return this.imagenes;
    }

    

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setOpaque(false); // Establecer el panel como transparente
    

        // Dibujar las imágenes en el panel
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        g2d.drawImage(imagen7.getImage(), x7, y7, 220,  170, null);
        g2d.drawImage(imagen8.getImage(), x7, y7, 220,  170, null);
        
        
        
        g2d.drawImage(imagen2.getImage(), x2,  363, 820, 90, null);
        g2d.drawImage(imagen4.getImage(), 126, 368, 45, 30, null);
        g2d.drawImage(imagen22.getImage(), x22, y22, 125, 80, null);
        
        
        
	    g2d.drawImage(imagen1.getImage(), x1,  335, 130, 300, null);
	    g2d.drawImage(imagen12.getImage(), x12, y12, 35, 100, null);
        g2d.drawImage(imagen13.getImage(), x13, y13, 40, 100, null);
        
        
	    g2d.drawImage(imagen3.getImage(), 100, 363, 70, 70, null);
	    g2d.drawImage(imagen5.getImage(), 173, 353, 60, 60, null);
	    g2d.drawImage(imagen11.getImage(), x11, 200, 120, 430, null);
	    
        
        g2d.drawImage(imagen10.getImage(), x10, 400, 220, 287, null);
        g2d.drawImage(imagen14.getImage(), x14, y14, 125, 100, null);
        g2d.drawImage(imagen16.getImage(), x16, y16, 135, 80, null);
        g2d.drawImage(imagen18.getImage(), x18, y18, 125, 80, null);
        g2d.drawImage(imagen20.getImage(), x20, y20, 125, 80, null);
        

     // Dibujar el óvalo que delimita el área de dibujo encima de la imagen 7
        g2d.setColor(Color.BLACK); // Color transparentenew Color(0, 0, 0, 0)new Color(0, 0, 0, 0)
        g2d.setStroke(new BasicStroke(0)); // Sin trazo
        g2d.draw(drawingArea);


     // Dibujar el trazado del path dentro del área de dibujo de la pizza
        g2d.setClip(drawingArea);
        
        // Dibujar la imagen 15 si se ha hecho clic en la imagen 14
        

        // Cambiar el color del trazo y el relleno del óvalo según el tipo de pincel 
        if (isRedBrush) {
            g2d.setColor(Color.RED); // Restablecer el color del trazo a rojo
            g2d.setStroke(new BasicStroke(12, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND)); // Restablecer el trazo
            g2d.draw(path);
            g2d.setColor(Color.RED); // Rellenar el óvalo con color rojo
        } else {
            g2d.setColor(new Color(255,69,0)); // Restablecer el color del trazo a naranja
            g2d.setStroke(new BasicStroke(12, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND)); // Restablecer el trazo
            g2d.draw(path);
            g2d.setColor(new Color(255,69,0)); // Rellenar el óvalo con color naranja
        }

        // Calcular el área total del óvalo
        double areaTotal = Math.PI * drawingArea.getWidth() * drawingArea.getHeight() / 4;

        // Calcular el área cubierta por el path
        double pathArea = path.getBounds2D().getWidth() * path.getBounds2D().getHeight();

        // Verificar si el área cubierta por el path es al menos el 80% del área total
        // Rellenar el óvalo solo si el área cubierta por el path es al menos el 80% del área total
        if (pathArea >= 0.8 * areaTotal) {
        	
        	System.out.println("El área de la pizza está completamente cubierta.");
           
            g2d.fill(drawingArea);
        }
        
        
        
        // Dibujar la imagen 15 si está visible
        if (imagen15Visible) {
            moveImage15(x7 - x15 + 0, y7 - y15 + 0); // Mover la imagen 15 para que siga a la imagen 7
            drawImagen15(g);
        }
        // Dibujar todas las imágenes 17 generadas
        int xOffset17 = 10;
        int yOffset17 = 10;
        for (int i = 0; i < imagen17Counter; i++) {
            drawImagen17(g2d, xOffset17, yOffset17);
            // Aumentar los desplazamientos para la siguiente imagen 17
            xOffset17 += 110; // Espacio horizontal entre imágenes 17
            yOffset17 += 20; // Espacio vertical entre imágenes 17
        }

        // Dibujar todas las imágenes 19 generadas
        int xOffset19 = 10;
        int yOffset19 = 10;
        for (int i = 0; i < imagen19Counter; i++) {
            drawImagen19(g2d, xOffset19, yOffset19);
            // Aumentar los desplazamientos para la siguiente imagen 19
            xOffset19 += 110; // Espacio horizontal entre imágenes 19
            yOffset19 += 20; // Espacio vertical entre imágenes 19
        }

        // Dibujar todas las imágenes 21 generadas
        int xOffset21 = 10;
        int yOffset21 = 10;
        for (int i = 0; i < imagen21Counter; i++) {
            drawImagen21(g2d, xOffset21, yOffset21);
            // Aumentar los desplazamientos para la siguiente imagen 21
            xOffset21 += 110; // Espacio horizontal entre imágenes 21
            yOffset21 += 20; // Espacio vertical entre imágenes 21
        }

        // Dibujar todas las imágenes 23 generadas
        int xOffset23 = 10;
        int yOffset23 = 10;
        for (int i = 0; i < imagen23Counter; i++) {
            drawImagen23(g2d, xOffset23, yOffset23);
            // Aumentar los desplazamientos para la siguiente imagen 23
            xOffset23 += 10; // Espacio horizontal entre imágenes 23
            yOffset23 += 50; // Espacio vertical entre imágenes 23
        }
    
    
        

        // Dibujar el pincel solo si estamos pintando
        if (painting) {
            Graphics2D brushGraphics = (Graphics2D) g2d.create();
            if (isRedBrush) {
                brushGraphics.drawImage(brushImage1.getImage(), lastX - brushWidth1 / 2, lastY - brushHeight1 / 2, brushWidth1, brushHeight1, null);
            } else {
                brushGraphics.drawImage(brushImage2.getImage(), lastX - brushWidth2 / 2, lastY - brushHeight2 / 2, brushWidth2, brushHeight2, null);
            }
            brushGraphics.dispose();
        }
        
        
     // Dibujar las imágenes en el panel
     // Verificar qué imágenes de la lista dada están presentes
        System.out.println("Imágenes presentes:");
        if (imagen17Counter > 0) {
            System.out.println("Imagen 17 está presente.");
        }
        if (imagen19Counter > 0) {
            System.out.println("Imagen 19 está presente.");
        }
        g2d.dispose();
        // Repetir para las otras imágenes de la lista...
    }

       


        
        
       
         // Establecer el panel como transparente
    }
  

