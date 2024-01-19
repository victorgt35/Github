import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


import javax.swing.JPanel;
import javax.swing.Timer;


public class PanelContador extends JPanel  implements ActionListener, MouseListener
{
    public final static int ANCHO = 400;  // ancho del panel
    public final static int ALTO = 300;  // alto del panel
    private final static int DELAY = 500;  // retardo del timer, cada cuánto genera un evento ActionEvent
    private final static int POS_X = ANCHO / 3;  // posición x del contador
    private final static int POS_Y = ALTO / 3;   // posición y del contador
    private static final int POS_X_TEXTO = 60;
    private static final int POS_Y_TEXTO = 150;
    private int x;
    private int y;
    private boolean limit;
    private int contador;
    private Timer timer;

    

    /**
     * Constructor 
     */
    public PanelContador() 
    {
        this.setPreferredSize(new Dimension(ANCHO, ALTO));
        x = POS_X;
        y = POS_Y;        
        contador = 0;
        // a completar
        limit = true;
        this.timer=new Timer(DELAY,this);

    }

    /**
     *   
     *       
     */
    public void paintComponent(Graphics g)
    {
        Font verdana = new Font("Verdana",Font.BOLD,18);

        super.paintComponent(g);
        this.setBackground(Color.green);
         // a completar
        g.setFont(verdana);
        if(!timer.isRunning()){
            g.drawString("Click en el panel para iniciar",POS_X_TEXTO,POS_Y_TEXTO);
        }
        else {
            g.drawString("Click en el panel para parar la animacion",POS_X_TEXTO,POS_Y_TEXTO);
        }

        

    }

    private void actualizar(){
        if (contador==10){
            limit=true;
        }else if(contador == 0){
            limit=false;

        }
        if(limit){
            contador--;
        }
        else{
            contador++;
        }

    }



    @Override
    public void actionPerformed(ActionEvent e) {
        actualizar();
        repaint();
    }


    public void mousePressed(MouseEvent e) {  };

    public void mouseReleased(MouseEvent e)  {  };

    public void mouseClicked(MouseEvent e)
    {
    	// a completar
        if(timer.isRunning()){
            timer.stop();
        }
        else{
            timer.start();
        }


    }

    public void mouseEntered(MouseEvent e) {  };

    public void mouseExited(MouseEvent e) {  };


}
