import java.io.File;
import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
import java.applet.*;
import java.io.*; 
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.io.File;  
import java.io.IOException;
public class remove
{
	public static void main(String args[])
	{
		remove1();
	}
	public static void remove1()
	{

		//frame 

		JFrame f= new JFrame(); 
		
		//background image 

		ImageIcon img= new ImageIcon("background!@#$.jpg");
		JLabel l0=new JLabel("",img,JLabel.CENTER);
		f.add(l0);
		l0.setBounds(0,0,1400,1000);
		
		//label 1

		JLabel ll1=new JLabel(" PLEASE SELECT CLASS: ");
		l0.add(ll1);
		ll1.setBounds(50,180,300,30);
 
		//combobox 1

		String classes[]={"11-12","9-10","6-8","1-5"};        
    		JComboBox cb=new JComboBox(classes);    
   		cb.setBounds(200, 180,100,30);    
   		l0.add(cb);
		
		//button 1
		
		JButton b1=new JButton("DELETE");
		l0.add(b1);
		b1.setBounds(200,220,100,30);
		//to see which option was selected
		
		//action listener 
		
			 b1.addActionListener(new ActionListener()
 			{  
             			 public void actionPerformed(ActionEvent e)
 				{   
					int a1=JOptionPane.showConfirmDialog(f,"Are you sure?you want to delete all data.");  
					if(a1==JOptionPane.YES_OPTION)
					{   
						String data =String.valueOf( cb.getItemAt(cb.getSelectedIndex()));
						if(data=="11-12")
						{
							File fi=new File("C:\\substitution programme\\user data\\app\\high");
							String a[]=fi.list();
							for(int i=0;i<a.length;i++)
							{
								File ob=new File("C:\\substitution programme\\user data\\app\\high\\"+a[i]);
								ob.delete();
							}
						}
						if(data=="9-10")		
						{
							File fi=new File("C:\\substitution programme\\user data\\app\\midhigh");
							String a[]=fi.list();
							for(int i=0;i<a.length;i++)
							{
								File ob=new File("C:\\substitution programme\\user data\\app\\midhigh\\"+a[i]);
								ob.delete();
							}
						
						}
						if(data=="6-8")
						{
						
							File fi=new File("C:\\substitution programme\\user data\\app\\mid");
							String a[]=fi.list();
							for(int i=0;i<a.length;i++)
							{
								File ob=new File("C:\\substitution programme\\user data\\app\\mid\\"+a[i]);
								ob.delete();
							}
						
					
						}
						if(data=="1-5")
						{
							
							File fi=new File("C:\\substitution programme\\user data\\app\\jun");
							String a[]=fi.list();
							for(int i=0;i<a.length;i++)
							{
								File ob=new File("C:\\substitution programme\\user data\\app\\jun\\"+a[i]);
								ob.delete();
							}
						
						}
						 try
       						{  
           						String command = "m1.bat"; 
            						Runtime run  = Runtime.getRuntime(); 
            						Process proc = run.exec(command);
							// to remove the time gap 
							Thread.sleep(1000);
							System.exit(0);
			
        		 			} 
  
        					catch (Exception e1) 
       						{ 
           						 e1.printStackTrace(); 
        					}
					}
				}
			});

		//button 2
		
		JButton b2=new JButton("BACK");
		l0.add(b2);
		b2.setBounds(200,255,100,30);

		//button 1 action listener

		b2.addActionListener(new ActionListener()
 		{  
             		 public void actionPerformed(ActionEvent e)
 			{      try
       				{  
           				String command = "m1.bat"; 
            				Runtime run  = Runtime.getRuntime(); 
            				Process proc = run.exec(command);
					// to remove the time gap 
					Thread.sleep(1000);
					System.exit(0);
			
        		 	} 
  
        			catch (Exception e1) 
       				{ 
           				 e1.printStackTrace(); 
        			} 
			}
		});

		//final commands

          	f.setSize(1400,1000);  
         	f.setLayout(null);  
         	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		f.setVisible(true);
	}
}
		