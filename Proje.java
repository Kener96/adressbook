import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;



import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

// Swingle en baþta yaptýðým
public class Proje extends JFrame {
	

	JComboBox gend;
	
	
	
	public static void main(String[] args) {
		
	 new Proje();
	 
	}
	   public Proje() {
		   this.setSize(400,200);
		   Toolkit tk=Toolkit.getDefaultToolkit();
			Dimension dim=tk.getScreenSize();
			
			int xPoz=(dim.width/2)-(this.getWidth()/2);
			int yPoz=(dim.height/2)-(this.getHeight()/2);
			this.setLocation(xPoz, yPoz);
			this.setResizable(false);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			this.setTitle("Address Book");
			
			JPanel panelim=new JPanel();
			//panelim.setBackground(Color.gray);
			//panelim.setForeground(Color.YELLOW);
			
			
			JLabel label1=new JLabel("ID");
			panelim.add(label1);
			JTextField textField1=new JTextField("",30);			
			//textField1.setFont(new Font("Timesroman",Font.ITALIC,12));
			textField1.setDocument(new JTextFieldLimit(4));
			textField1.setColumns(32);
			textField1.setToolTipText("For ex:1234..");
			panelim.add(textField1);
			
		
			
			
			JLabel label2=new JLabel("Name\n");
			panelim.add(label2);
			JTextField textField2=new JTextField("",30);
			textField2.setDocument(new JTextFieldLimit(32));
			textField2.setColumns(30);
			textField2.setToolTipText("For example: Alen..");
		    panelim.add(textField2);
			
		    
		    
		    JLabel label3=new JLabel("\nStreet");
			panelim.add(label3);
			JTextField textField3=new JTextField("",30);//seyin uzunlugu
			textField3.setDocument(new JTextFieldLimit(32));
			textField3.setColumns(30);
			textField3.setToolTipText("For example:20.street..");
		    panelim.add(textField3);
			
			
		    
		    JLabel label4=new JLabel("\nCity");
			panelim.add(label4);
			JTextField textField4=new JTextField("",30);
			textField4.setDocument(new JTextFieldLimit(20));
			textField4.setColumns(8);//seyin uzunlugu
			textField4.setToolTipText("For example:Ýzmir..");
		    panelim.add(textField4);
		    
		    

		    
		    JLabel label5=new JLabel("\nGender");
			panelim.add(label5);
			
	        String[] gender= {"Famale"};
			gend=new JComboBox(gender);
			gend.addItem("Male");
			
			panelim.add(gend);
		       
           
		    
		    
		    JLabel label6=new JLabel("\nZip");
			panelim.add(label6);
			JTextField textField6=new JTextField("",30);
			textField6.setDocument(new JTextFieldLimit(5));
			textField6.setColumns(8);//seyin uzunlugu
			textField6.setToolTipText("For example: 4567");
		    panelim.add(textField6);
		    
		    
		    
		    
		    JButton buton1=new JButton("Add");
			buton1.setToolTipText("New register");
			 JButton buton2=new JButton("First");
			 JButton buton3=new JButton("Next");
			 JButton buton4=new JButton("Previous");
			 JButton buton5=new JButton("Last");
			 JButton buton6=new JButton("Update");
			 JButton buton7=new JButton("Search");
			panelim.add(buton1);
			panelim.add(buton2);
			panelim.add(buton3);
			panelim.add(buton4);
			panelim.add(buton5);
			panelim.add(buton6);
			panelim.add(buton7);
		    
		    
		    
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		    
		    
		 
			
			this.add(panelim);
			this.setVisible(true);
	    
		
		
		
	}
		
	   class JTextFieldLimit extends PlainDocument {
		   private int limit;
		   JTextFieldLimit(int limit) {
		     super();
		     this.limit = limit;
		   }

		   JTextFieldLimit(int limit, boolean upper) {
		     super();
		     this.limit = limit;
		   }

		   public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
		     if (str == null)
		       return;

		     if ((getLength() + str.length()) <= limit) {
		       super.insertString(offset, str, attr);
		     }
		   }
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   

  }
	   
	


