package salado;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;

public class MouseEventListener extends MouseAdapter {
    private int x, y;

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON3) { // Verificar si se presionó el botón derecho del ratón
            x = e.getX();
            y = e.getY();
        } else {
            System.out.println("Mouse presionado en: " + e.getX() + ", " + e.getY());
        }
    }

   @Override
   public void mouseDragged(MouseEvent e) {
	    if ((e.getModifiersEx() & MouseEvent.BUTTON3) != 0) { // Verificar si se está arrastrando con el botón derecho
	        JComponent source = (JComponent) e.getSource();
	        source.setLocation(source.getX() + e.getX() - x, source.getY() + e.getY() - y);
	    }
	}	

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse liberado en: " + e.getX() + ", " + e.getY());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse entró al panel");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse salió del panel");
    }
}

