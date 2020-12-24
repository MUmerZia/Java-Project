/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrationform;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author Muhammad Umer Zia
 */
public class RegistrationForm implements ActionListener  {
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
    JTextField t1,t2,t3,t4,t5,t6;
    JRadioButton male,female;
    JCheckBox checkBox1,checkBox2,checkBox3,checkBox4,checkBox5,checkBox6,checkBox7,checkBox8;
    JComboBox date,month,year,cb;
    JButton b1;
 
        RegistrationForm(){
        
            
        
        JFrame jf = new JFrame();
                
         l1 = new JLabel();
        l1.setText("Name:");
        l1.setBounds(50, 50, 100, 30);
        l1.setForeground(Color.BLACK);
        jf.add(l1);
       
          t1 = new JTextField();
        t1.setBounds(100, 50, 150, 25);
        jf.add(t1);
        
          l2 = new JLabel();
        l2.setText("Father Name:");
        l2.setBounds(300, 50, 100, 30);
        l2.setForeground(Color.BLACK);
        jf.add(l2);
       
          t2 = new JTextField();
        t2.setBounds(380, 50, 150, 25);
        jf.add(t2);
        
         l3 = new JLabel();
        l3.setText("Age:");
        l3.setBounds(50, 100, 100, 30);
        l3.setForeground(Color.BLACK);
        jf.add(l3);
        
         t3 = new JTextField();
        t3.setBounds(100, 100, 50, 25);
        jf.add(t3);
        
           l4 = new JLabel();
        l4.setText("Sex:");
        l4.setBounds(300, 100, 100, 30);
        l4.setForeground(Color.BLACK);
        jf.add(l4);
        
         male=new JRadioButton();        
        male.setBounds(380,100,25,25);        
         jf.add(male);
         
          l5 = new JLabel();
         l5.setBounds(405,100,40,25);
         l5.setText("Male");
         l5.setForeground(Color.BLACK);
         jf.add(l5);
         
          female=new JRadioButton();        
        female.setBounds(450,100,25,25);        
         jf.add(female);
         
           l6 = new JLabel();
         l6.setBounds(475,100,55,25);
         l6.setText("Female");
         l6.setForeground(Color.BLACK);
         jf.add(l6);
         
          l7 = new JLabel();
        l7.setText("Address:");
        l7.setBounds(50, 150, 100, 30);
        l7.setForeground(Color.BLACK);
        jf.add(l7);
         
        t4 = new JTextField();
        t4.setBounds(105, 150, 150, 100);
        jf.add(t4); 
        
           l12 = new JLabel();
        l12.setText("Hobbies:");
        l12.setBounds(50, 280, 100, 30);
        l7.setForeground(Color.BLACK);
        jf.add(l12);
        
         checkBox1 = new JCheckBox("Game");  
        checkBox1.setBounds(100,270, 60,50); 
        
         checkBox2 = new JCheckBox("Quize", true);  
        checkBox2.setBounds(100,300, 60,50);  
        
          checkBox3 = new JCheckBox("Reading");  
        checkBox3.setBounds(160,270, 75,50); 
        
         checkBox4 = new JCheckBox("Stamp", true);  
        checkBox4.setBounds(160,300, 65,50);  
        
           checkBox5 = new JCheckBox("Fishing");  
        checkBox5.setBounds(230,270, 85,50); 
        
         checkBox6 = new JCheckBox("Coin", true);  
        checkBox6.setBounds(230,300, 85,50);  
        
        jf.add(checkBox1);  
        jf.add(checkBox2);
        jf.add(checkBox3);  
        jf.add(checkBox4);
        jf.add(checkBox5);
        jf.add(checkBox6);
        
          l8 = new JLabel();
        l8.setText("DOB:");
        l8.setBounds(300, 140, 150, 30);
        l8.setForeground(Color.BLACK);
        jf.add(l8);
        
            String Date[]={"Date","1","2","3","4","5","6","7","8,","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","27","28","29","30","31"};        
         date=new JComboBox(Date);    
        date.setBounds(380,140,55,25);    
        jf.add(date);   
        
           String Month[]={"Month","January","February","March","March","April","May","June","July","August","September","October","November","December"};        
         month=new JComboBox(Month);    
        month.setBounds(445,140,66,25);    
        jf.add(month);   
        
        String Year[]={"Year","1991","1992","1993","1994","1995","1996","1997","1998","1999","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020"};        
         year=new JComboBox(Year);    
        year.setBounds(520,140,55,25);    
        jf.add(year);   

        
            l9 = new JLabel();
        l9.setText("Phone:");
        l9.setBounds(300, 180, 100, 30);
        l9.setForeground(Color.BLACK);
        jf.add(l9);
        
          t5 = new JTextField();
        t5.setBounds(380,180,150,25);
        jf.add(t5);
        
        
         l10 = new JLabel();
        l10.setText("Email:");
        l10.setBounds(300, 220, 100, 30);
        l10.setForeground(Color.BLACK);
        jf.add(l10);
        
           t6 = new JTextField();
        t6.setBounds(380,220,150,25);
        jf.add(t6);
        
          l11 = new JLabel();
        l11.setText("Nation:");
        l11.setBounds(300, 260, 100, 30);
        l11.setForeground(Color.BLACK);
        jf.add(l11);
        
         String country[]={"India","Australia","U.S.A","England","Newzealand","Pakistan","China"};        
         cb=new JComboBox(country);    
        cb.setBounds(380,260,150,25);    
        jf.add(cb);        
        
        b1=new JButton("submit");
        b1.setBounds(380, 300, 100, 25);
        b1.addActionListener(this);
        jf.add(b1);
              
              
                       
        jf.setSize(800, 500);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setTitle("Registration Form");
    }
        
   

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      
new RegistrationForm();  
    
}
    
public void actionPerformed(ActionEvent ae){

//  string  l1 = "Address : "  +  t1.getText();
    l2.setText(t2);
//    l3.setText(t3.getText());
//    l1.setText(t4.getText());
//    l1.setText(t5.getText());
//    l1.setText(t6.getText());


}

    
 };