import java.awt.*;
import javax.swing.*;
/**
 * Write a description of class MyHelloFrame here.
 *
 * @author (2018315036 양유석 2018315039 이윤재)
 * @version (2019.11.11)
 */
public class MyHelloFrame extends JFrame
{   
    public MyHelloFrame()
    {
        this.setSize(400,400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("실습_3(20191111)");
        MyHelloPanelListener ml = new MyHelloPanelListener();
        this.add(ml);
    }

}
