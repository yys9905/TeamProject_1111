import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
/**
 * 패널을 생성하고, MouseListener와 KeyListener를 구현하는 클래스
 *
 * @author (2018315036 양유석 2018315039 이윤재)
 * @version (2019.11.11)
 */
public class MyHelloPanelListener extends JPanel implements MouseListener, KeyListener
{
    JLabel jl;
    public MyHelloPanelListener(){
        jl = new JLabel("HELLO");
        add(jl);
        this.addMouseListener(this);
        this.addKeyListener(this);
        this.setFocusable(true);//패널이 포커스를 받을 수 있도록 설정
        this.requestFocus();//패널이 포커스를 주어 키 입력을 받을 수 있게 설정
    }    
    public void keyReleased(KeyEvent e){}
    public void keyPressed(KeyEvent e){
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
    public void keyTyped(KeyEvent e){}
    public void mouseClicked(MouseEvent e){
        int x = e.getX(); // 마우스의 X 좌표
        int y = e.getY(); // 마우스의 Y 좌표
        jl.setLocation(x,y);
        
        this.setFocusable(true);
        this.requestFocus();
    }
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
}
