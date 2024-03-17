package Views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class ViewsIntro {
    public static JFrame frame = new JFrame("Welcome to G7's projects :)");
    public static JButton buttonnext = new JButton("▶");
    public static ImageIcon img = new ImageIcon("src/Img/img1.jpg");
    
    public ViewsIntro(){
        frame.setBounds(300, 150, img.getIconWidth() , img.getIconHeight()+30);
        frame.setVisible(true);
        frame.setBackground(Color.BLUE);
        frame.setLayout(null);
        setBackGround(); // call function set image for frame // musn't delete this line
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void setBackGround(){
        JLabel background;
        frame.setLayout(null);
        background = new JLabel("",img,JLabel.CENTER);
        background.setBounds(0,0,img.getIconWidth(),img.getIconHeight());

        // set img in background
        buttonnext.setBounds(img.getIconWidth() / 2 - 30, img.getIconHeight() - 80, 100, 30);
        buttonnext.setFont(new Font(Font.DIALOG, 10,30));
        buttonnext.setBorder(null);
        buttonnext.setBackground(Color.GREEN);
        // button will added by background
        frame.add(background);
        background.add(buttonnext);
        click();
    }
    public void click(){
        buttonnext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event){
                frame.setVisible(false);
                new ViewsConvert();
            }
        }); 
    }
    
}
