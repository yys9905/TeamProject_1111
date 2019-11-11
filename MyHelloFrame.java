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
    JLabel jl;
    JPanel jp;
    public MyHelloFrame()
    {
        this.setSize(400,400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("실습_3(20191111)");
        jp = new JPanel(); //새로운 패널 생성
        jl = new JLabel("HELLO"); //새로운 레이블 생성
        jp.add(jl);// 패널에 레이블 추가하기
        this.add(jp);
        MyHelloPanelListener ml = new MyHelloPanelListener(jl);
        addMouseListener(ml);
        addKeyListener(ml);
    }

}
