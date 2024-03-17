package Views;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.plaf.basic.BasicButtonUI;

import ServiceImplement.DollarServiceImplement;
import ViewGeneral.views;

public class ViewsConvert{
    public JFrame frame = new JFrame("G7 - Currency Convert :) ");
    public String[] type = {"USD - Dollar", "VND - VietNamDong", "CAD - Dollar Canada", "AUD - Dollar Australia", "SGD - Dollar Singapore", "HKD - Dollar HongLong", "CNY - Yuan", "EURO - EURO", "RUB - RUB Rusia", "CHF - Franc Switzerland"};
    public JComboBox comboBoxFrom = new JComboBox<String>(type);
    public JLabel introLabel = new JLabel("Currency Convert !!! ");
    public JLabel selectType = new JLabel("Select Type: ");
    public JButton buttonAction = new JButton("Action");
    public JTextField valueTextField = new JTextField("Enter Value");    

    public JTextField usd = new JTextField(" USD");
    public JTextField vnd = new JTextField(" VND");
    public JTextField cad = new JTextField(" CAD");
    public JTextField aud = new JTextField(" AUD");
    public JTextField sgd = new JTextField(" SGD");
    public JTextField hkd = new JTextField(" HKD");
    public JTextField cny = new JTextField(" CNY");
    public JTextField euro = new JTextField(" EURO");
    public JTextField rub = new JTextField(" RUB");
    public JTextField chf = new JTextField(" CHF");

    public ViewsConvert(){
        frame.setBounds(280, 130, 900, 600);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        designLabelIntro();
        degignComboBox();
        desginLabelSeclectType();
        designButtonAction();
        actionButton();
        convertTo();
        designTextField();
        frame.add(valueTextField);
        frame.add(buttonAction);
        frame.add(comboBoxFrom);
        frame.add(introLabel);
        frame.add(selectType);
       
    }
    public void designLabelIntro(){
        introLabel.setBounds(60, 20, 320, 30);
        introLabel.setFont(new Font(null, 10, 30));
    }
    public void degignComboBox(){
        comboBoxFrom.setBounds(20, 130, 200, 50);
        comboBoxFrom.setFont(new Font(null, 10, 15));
    }
    public void desginLabelSeclectType(){
        selectType.setBounds(20, 100, 150, 30);
        selectType.setFont(new Font(null, 10, 15));
    }
    public void designTextField(){
        valueTextField.setBounds(20, 200, 200, 40);
        valueTextField.setFont(new Font(null, 10, 15));
    }
    public void designButtonAction(){
        buttonAction.setBounds(250, 170, 100, 30);
        buttonAction.setFont(new Font("Work Sans", Font.PLAIN, 14));
        buttonAction.setBackground(new Color(205 , 201 , 201));
        buttonAction.setOpaque(true);
        buttonAction.setUI(new BasicButtonUI() {
            @Override
            public void update(Graphics g, JComponent c) {
                if (c.isOpaque()) {
                    Color fillColor = c.getBackground();
    
                    AbstractButton button = (AbstractButton) c;
                    ButtonModel model = button.getModel();
    
                    if (model.isPressed()) {        
                        fillColor = fillColor.darker();     
                    }  
                    else if (model.isRollover()) {
                          fillColor = fillColor.brighter();   
                    }
                    g.setColor(fillColor);
                    g.fillRoundRect(0, 0, c.getWidth(),c.getHeight(), 20, 20);
                }
                paint(g, c);
            }
        }); 
    }
    public void actionButton(){
        buttonAction.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event){
               int index = (int) comboBoxFrom.getSelectedIndex();
            if(!checkIsNumOrNot()){ /* warning because String in textfield value is not number !! */ }
            else if(index == 0) {   fromUSD();  }
            else if(index == 1){    fromVND();  }
            else if(index == 2){    fromCAD();  }
            else if(index == 3){    fromAUD();  }
            else if(index == 4){    fromSGD();  }
            else if(index == 5){    fromHKD();  }
            else if(index == 6){    fromCNY();  }
            else if(index == 7){    fromEURO(); }
            else if(index == 8){    fromRUB();  }
            else if(index == 9){    fromCHF();  }
        }});
    }
    public void convertTo(){
        // set bounds
        usd.setBounds(450, 30, 300, 50);
        vnd.setBounds(450, 80, 300, 50);
        cad.setBounds(450, 130, 300, 50);
        aud.setBounds(450, 180, 300, 50);
        sgd.setBounds(450, 230, 300, 50);
        hkd.setBounds(450, 280, 300, 50);
        cny.setBounds(450, 330, 300, 50);
        euro.setBounds(450, 380,300, 50);
        rub.setBounds(450, 430, 300, 50);
        chf.setBounds(450, 480, 300, 50);
        // set font
        usd.setFont(new Font(null, 10, 15));
        vnd.setFont(new Font(null, 10, 15));
        cad.setFont(new Font(null, 10, 15));
        aud.setFont(new Font(null, 10, 15));
        sgd.setFont(new Font(null, 10, 15));
        hkd.setFont(new Font(null, 10, 15));
        cny.setFont(new Font(null, 10, 15));
        euro.setFont(new Font(null, 10, 15));
        rub.setFont(new Font(null, 10, 15));
        chf.setFont(new Font(null, 10, 15));
        // set border
        usd.setEditable(false);
        usd.setEditable(false);
        vnd.setEditable(false);
        cad.setEditable(false);
        aud.setEditable(false);
        sgd.setEditable(false);
        hkd.setEditable(false);
        cny.setEditable(false);
        euro.setEditable(false);
        rub.setEditable(false);
        chf.setEditable(false);

        frame.add(vnd);
        frame.add(cad);
        frame.add(aud);
        frame.add(sgd);
        frame.add(hkd);
        frame.add(cny);
        frame.add(euro);
        frame.add(rub);
        frame.add(chf);
        frame.add(usd);
    }
    public boolean checkIsNumOrNot(){
        String checkIsNumOrNot = valueTextField.getText();
        String pattern = "[-+]?\\d*\\.?\\d+";
        boolean isNumeric = Pattern.matches(pattern, checkIsNumOrNot);
        if(!isNumeric){
            JOptionPane.showMessageDialog(frame, "Please sure value is number !!! ",
               "Warning !!!", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
    public void fromUSD(){
        DollarServiceImplement dollarServiceImplement = new DollarServiceImplement();
        double value = Double.parseDouble(valueTextField.getText());
        usd.setText(" USD is : \t" + String.valueOf(views.simplifyAFraction(
            value
        )));
        vnd.setText(" VND is : \t" + String.valueOf(views.simplifyAFraction(
           dollarServiceImplement.convertToVND(value)
        )));
        cad.setText(" CAD is :\t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToCAD(value)
        )));
        aud.setText(" AUD is :\t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToAUD(value)
        )));
        sgd.setText(" SGD is :\t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToSGD(value)
        )));
        hkd.setText(" HKD is :\t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToHKD(value)
        )));
        cny.setText(" CNY is :\t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToCNY(value)
        )));
        euro.setText(" EURO is :\t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToEURO(value)
        )));
        rub.setText(" RUB is :\t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToRUB(value)
        )));
        chf.setText(" CHF is :\t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToCHF(value)
        )));
    }
    public void fromVND() {
        DollarServiceImplement dollarServiceImplement = new DollarServiceImplement();
        double value = Double.parseDouble(valueTextField.getText()) / dollarServiceImplement.convertToVND(1);
        usd.setText(" USD is : \t" + String.valueOf(views.simplifyAFraction(
            Double.parseDouble(valueTextField.getText()) / dollarServiceImplement.convertToVND(1)
        )));
        vnd.setText(" VND is : \t" + String.valueOf(views.simplifyAFraction(
            Double.parseDouble(valueTextField.getText()))
        ));

        cad.setText(" CAD is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToCAD(value)
        )));
        aud.setText(" AUD is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToAUD(value)
        )));
        sgd.setText(" SGD is: \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToCAD(value)
        )));
        hkd.setText(" HKD is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToHKD(value)
        )));
        cny.setText(" CNY is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToCNY(value)
        )));
        euro.setText(" EURO is : \t" + String.valueOf(
            views.simplifyAFraction(dollarServiceImplement.convertToEURO(value)
        )));
        rub.setText(" RUB is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToRUB(value)
        )));
        chf.setText(" CHF is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToCHF(value)
        )));
    }
    public void fromCAD(){
        DollarServiceImplement dollarServiceImplement = new DollarServiceImplement();
        double value = Double.parseDouble(valueTextField.getText()) / dollarServiceImplement.convertToCAD(1);
        usd.setText(" USD is : \t" + String.valueOf(views.simplifyAFraction(
            Double.parseDouble(valueTextField.getText()) / dollarServiceImplement.convertToCAD(1)
        )));
        vnd.setText(" VND is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToVND(value)
        )));
        cad.setText(" CAD is : \t" + String.valueOf(views.simplifyAFraction(
            Double.parseDouble(valueTextField.getText())
        )));
        aud.setText(" AUD is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToAUD(value)
        )));
        sgd.setText(" SGD is: \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToCAD(value)
        )));
        hkd.setText(" HKD is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToHKD(value)
        )));
        cny.setText(" CNY is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToCNY(value)
        )));
        euro.setText(" EURO is : \t" + String.valueOf(
            views.simplifyAFraction(dollarServiceImplement.convertToEURO(value)
        )));
        rub.setText(" RUB is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToRUB(value)
        )));
        chf.setText(" CHF is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToCHF(value)
        )));
    }
    public void fromAUD(){
        DollarServiceImplement dollarServiceImplement = new DollarServiceImplement();
        double value = Double.parseDouble(valueTextField.getText()) / dollarServiceImplement.convertToAUD(1);
        usd.setText(" USD is : \t" + String.valueOf(views.simplifyAFraction(
            Double.parseDouble(valueTextField.getText()) / dollarServiceImplement.convertToAUD(1)
        )));
        vnd.setText(" VND is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToVND(value)
        )));
        cad.setText(" CAD is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToCAD(value)

        )));
        aud.setText(" AUD is : \t" + String.valueOf(views.simplifyAFraction(
            Double.parseDouble(valueTextField.getText())
        )));
        sgd.setText(" SGD is: \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToCAD(value)
        )));
        hkd.setText(" HKD is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToHKD(value)
        )));
        cny.setText(" CNY is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToCNY(value)
        )));
        euro.setText(" EURO is : \t" + String.valueOf(
            views.simplifyAFraction(dollarServiceImplement.convertToEURO(value)
        )));
        rub.setText(" RUB is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToRUB(value)
        )));
        chf.setText(" CHF is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToCHF(value)
        )));
    }
    public void fromSGD(){
        DollarServiceImplement dollarServiceImplement = new DollarServiceImplement();
        double value = Double.parseDouble(valueTextField.getText()) / dollarServiceImplement.convertToSGD(1);
        usd.setText(" USD is : \t" + String.valueOf(views.simplifyAFraction(
            Double.parseDouble(valueTextField.getText()) / dollarServiceImplement.convertToSGD(1)
        )));
        vnd.setText(" VND is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToVND(value)
        )));
        cad.setText(" CAD is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToCAD(value)
        )));
        aud.setText(" AUD is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToAUD(value)
        )));
        sgd.setText(" SGD is: \t" + String.valueOf(views.simplifyAFraction(
            Double.parseDouble(valueTextField.getText())
        )));
        hkd.setText(" HKD is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToHKD(value)
        )));
        cny.setText(" CNY is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToCNY(value)
        )));
        euro.setText(" EURO is : \t" + String.valueOf(
            views.simplifyAFraction(dollarServiceImplement.convertToEURO(value)
        )));
        rub.setText(" RUB is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToRUB(value)
        )));
        chf.setText(" CHF is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToCHF(value)
        )));
    }
    public void fromHKD(){
        DollarServiceImplement dollarServiceImplement = new DollarServiceImplement();
        double value = Double.parseDouble(valueTextField.getText()) / dollarServiceImplement.convertToHKD(1);
        usd.setText(" USD is : \t" + String.valueOf(views.simplifyAFraction(
            Double.parseDouble(valueTextField.getText()) / dollarServiceImplement.convertToSGD(1)
        )));
        vnd.setText(" VND is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToVND(value)
        )));
        cad.setText(" CAD is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToCAD(value)
        )));
        aud.setText(" AUD is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToAUD(value)
        )));
        sgd.setText(" SGD is: \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToHKD(value)
        )));
        hkd.setText(" HKD is : \t" + String.valueOf(views.simplifyAFraction(
            Double.parseDouble(valueTextField.getText())
        )));
        cny.setText(" CNY is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToCNY(value)
        )));
        euro.setText(" EURO is : \t" + String.valueOf(
            views.simplifyAFraction(dollarServiceImplement.convertToEURO(value)
        )));
        rub.setText(" RUB is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToRUB(value)
        )));
        chf.setText(" CHF is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToCHF(value)
        )));
    }
    public void fromCNY(){
        DollarServiceImplement dollarServiceImplement = new DollarServiceImplement();
        double value = Double.parseDouble(valueTextField.getText()) / dollarServiceImplement.convertToCNY(1);
        usd.setText(" USD is : \t" + String.valueOf(views.simplifyAFraction(
            Double.parseDouble(valueTextField.getText()) / dollarServiceImplement.convertToSGD(1)
        )));
        vnd.setText(" VND is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToVND(value)
        )));
        cad.setText(" CAD is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToCAD(value)
        )));
        aud.setText(" AUD is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToAUD(value)
        )));
        sgd.setText(" SGD is: \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToHKD(value)
        )));
        hkd.setText(" HKD is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToHKD(value)
        )));
        cny.setText(" CNY is : \t" + String.valueOf(views.simplifyAFraction(
            Double.parseDouble(valueTextField.getText())
        )));
        euro.setText(" EURO is : \t" + String.valueOf(
            views.simplifyAFraction(dollarServiceImplement.convertToEURO(value)
        )));
        rub.setText(" RUB is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToRUB(value)
        )));
        chf.setText(" CHF is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToCHF(value)
        )));
    }
    public void fromEURO(){
        DollarServiceImplement dollarServiceImplement = new DollarServiceImplement();
        double value = Double.parseDouble(valueTextField.getText()) / dollarServiceImplement.convertToEURO(1);
        usd.setText(" USD is : \t" + String.valueOf(views.simplifyAFraction(
            Double.parseDouble(valueTextField.getText()) / dollarServiceImplement.convertToSGD(1)
        )));
        vnd.setText(" VND is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToVND(value)
        )));
        cad.setText(" CAD is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToCAD(value)
        )));
        aud.setText(" AUD is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToAUD(value)
        )));
        sgd.setText(" SGD is: \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToHKD(value)
        )));
        hkd.setText(" HKD is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToCNY(value)
        )));
        cny.setText(" CNY is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToCNY(value)
        )));
        euro.setText(" EURO is : \t" + String.valueOf(views.simplifyAFraction(
            Double.parseDouble(valueTextField.getText())
        )));
        rub.setText(" RUB is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToRUB(value)
        )));
        chf.setText(" CHF is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToCHF(value)
        )));
    }
    public void fromRUB(){
        DollarServiceImplement dollarServiceImplement = new DollarServiceImplement();
        double value = Double.parseDouble(valueTextField.getText()) / dollarServiceImplement.convertToRUB(1);
        usd.setText(" USD is : \t" + String.valueOf(views.simplifyAFraction(
            Double.parseDouble(valueTextField.getText()) / dollarServiceImplement.convertToSGD(1)
        )));
        vnd.setText(" VND is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToVND(value)
        )));
        cad.setText(" CAD is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToCAD(value)
        )));
        aud.setText(" AUD is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToAUD(value)
        )));
        sgd.setText(" SGD is: \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToHKD(value)
        )));
        hkd.setText(" HKD is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToCNY(value)
        )));
        cny.setText(" CNY is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToEURO(value)
        )));
        euro.setText(" EURO is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToEURO(value)
        )));
        rub.setText(" RUB is : \t" + String.valueOf(views.simplifyAFraction(
            Double.parseDouble(valueTextField.getText())
        )));
        chf.setText(" CHF is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToCHF(value)
        )));
    }
    public void fromCHF(){
        DollarServiceImplement dollarServiceImplement = new DollarServiceImplement();
        double value = Double.parseDouble(valueTextField.getText()) / dollarServiceImplement.convertToRUB(1);
        usd.setText(" USD is : \t" + String.valueOf(views.simplifyAFraction(
            Double.parseDouble(valueTextField.getText()) / dollarServiceImplement.convertToSGD(1)
        )));
        vnd.setText(" VND is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToVND(value)
        )));
        cad.setText(" CAD is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToCAD(value)
        )));
        aud.setText(" AUD is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToAUD(value)
        )));
        sgd.setText(" SGD is: \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToHKD(value)
        )));
        hkd.setText(" HKD is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToCNY(value)
        )));
        cny.setText(" CNY is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToEURO(value)
        )));
        euro.setText(" EURO is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToEURO(value)
        )));
        rub.setText(" RUB is : \t" + String.valueOf(views.simplifyAFraction(
            dollarServiceImplement.convertToRUB(value)
        )));
        chf.setText(" CHF is : \t" + String.valueOf(views.simplifyAFraction(
            Double.parseDouble(valueTextField.getText())
        )));
    }
}