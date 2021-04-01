import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
import java.applet.*;
public class main_page extends Frame
{	main_page(){}
	public static void main1()
	{

		//frame 

		JFrame jf=new JFrame();
		
		//background image 

		ImageIcon img= new ImageIcon("background!@#$.jpg");
		JLabel l0=new JLabel("",img,JLabel.CENTER);
		jf.add(l0);
		l0.setBounds(0,0,1400,1000);

		//label 0
		
		JLabel l=new JLabel("MAINPAGE: ");
		Font  f1  = new Font(Font.SERIF,  Font.BOLD, 30);
		l.setFont(f1);
		l0.add(l);
		l.setBounds(535,150,1000,200);
		
		//button 1

		JButton b1=new JButton("add");
		l0.add(b1);
		b1.setBounds(550,300,100,30);

		//button 2

		JButton b2=new JButton("absent");
		l0.add(b2);
		b2.setBounds(550,350,100,30);

		//button 3

		JButton b3=new JButton("details");
		l0.add(b3);
		b3.setBounds(550,400,100,30);

		//button 4

		JButton b4=new JButton("remove");
		l0.add(b4);
		b4.setBounds(550,450,100,30);
		
		//action listener 1

		b1.addActionListener(new ActionListener()
		{  
			public void actionPerformed(ActionEvent e)
			{
				
				try
       				 {  
           				String command = "C:\\substitution programme\\user data\\add1.bat"; 
            				Runtime run  = Runtime.getRuntime(); 
            				Process proc = run.exec(command); 
					Thread.sleep(1000);
					System.exit(0);
        			 } 
  
        			 catch (Exception e1) 
       				 { 
           				 e1.printStackTrace(); 
        			 }  
			}
		});
		
		//action listener 2

		b2.addActionListener(new ActionListener()
		{  
			public void actionPerformed(ActionEvent e)
			{
				
				  
				try
       				 {  
           				String command = "C:\\substitution programme\\user data\\absent.bat"; 
            				Runtime run  = Runtime.getRuntime(); 
            				Process proc = run.exec(command); 
					Thread.sleep(1000);
					System.exit(0);
        			 } 
  
        			 catch (Exception e1) 
       				 { 
           				 e1.printStackTrace(); 
        			 }
			}
		});
		
		//action listener 3

		b3.addActionListener(new ActionListener()
		{  
			public void actionPerformed(ActionEvent e)
			{
				
				
				try
       				 {  
           				String command = "C:\\substitution programme\\user data\\tell.bat"; 
            				Runtime run  = Runtime.getRuntime(); 
            				Process proc = run.exec(command); 
					Thread.sleep(1000);
					System.exit(0);
        			 } 
  
        			 catch (Exception e1) 
       				 { 
           				 e1.printStackTrace(); 
        			 }
				  
			}
		});

		//action listener 4

		b4.addActionListener(new ActionListener()
		{  
			public void actionPerformed(ActionEvent e)
			{
				
				try
       				 {  
           				String command = "C:\\substitution programme\\user data\\remove1.bat"; 
            				Runtime run  = Runtime.getRuntime(); 
            				Process proc = run.exec(command); 
					Thread.sleep(1000);
					System.exit(0);
        			 } 
  
        			 catch (Exception e1) 
       				 { 
           				 e1.printStackTrace(); 
        			 }  
			}
		});
		// final commands

   		jf.setSize(1400,1000);  
    		jf.setLayout(null); 
    		jf.setVisible(true);  
    		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}
	public static void main(String args[])
	{
		main_page ob=new main_page();
		ob.main1();
	}

}
		