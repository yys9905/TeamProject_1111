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
public class MyHelloPanelListener extends JPanel implements MouseListener, KeyListener
{
    JLabel jl;
    public MyHelloPanelListener(){
        jl = new JLabel("HELLO");
        add(jl);
        this.addMouseListener(this);
        this.addKeyListener(this);
        this.setFocusable(true);
        this.requestFocus();
    }
    
    public void keyReleased(KeyEvent e){
        int x = jl.getX();
        int y = jl.getY();
        if (e.getKeyCode() == KeyEvent.VK_UP){
            y -= 10;
            jl.setLocation(x,y);
        }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN){
            y += 10;
            jl.setLocation(x,y);
        }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT){
            x -= 10;
            jl.setLocation(x,y);
        }
        else if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            x += 10;
            jl.setLocation(x,y);
        }
    }
    public void keyPressed(KeyEvent e){
    }
    public void keyTyped(KeyEvent e){
    }
    
    public void mouseClicked(MouseEvent e){
        int x = e.getX(); // 마우스의 X 좌표
        int y = e.getY(); // 마우스의 Y 좌표
        jl.setLocation(x,y);
        
        this.setFocusable(true);
        this.requestFocus();
    }
    public void mouseEntered(MouseEvent e){
        
    }
    public void mouseExited(MouseEvent e){
        
    }
    public void mousePressed(MouseEvent e){
        
    }
    public void mouseReleased(MouseEvent e){
        
    }
}
