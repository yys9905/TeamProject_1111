import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
/**
 * Write a description of class MyHelloFrameListener here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyHelloPanelListener extends MouseAdapter implements KeyListener
{
    JLabel jl;
    public MyHelloPanelListener(JLabel jl){
        this.jl = jl;
    }
    public void keyReleased(KeyEvent e){
        
    }
    public void keyPressed(KeyEvent e){
    }
    public void keyTyped(KeyEvent e){
    }
    public void mousePressed(MouseEvent e){
    }
}
