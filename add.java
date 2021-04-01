import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
import java.applet.*;
import java.io.*; 

import java.nio.file.Files;  
import  javax.swing.table.*;
public class add extends Frame
{
	//frame

	JFrame jf=new JFrame();
	public static void add2()
	{	
		
		//frame

		JFrame jf=new JFrame();

		//background image 

		ImageIcon img= new ImageIcon("background!@#$.jpg");
		JLabel l0=new JLabel("",img,JLabel.CENTER);
		jf.add(l0);
		l0.setBounds(0,0,1400,1000);

		
		//main label
		
		JLabel l=new JLabel("please enter details of the teacher: ");
		Font  f1  = new Font(Font.SERIF,  Font.BOLD, 30);
		l.setFont(f1);
		l0.add(l);
		l.setBounds(0,0,1000,200);
		

		//label 1

		JLabel l1=new JLabel("NAME: ");
		l0.add(l1);
		l1.setBounds(100,150,200,30);

		//textfield 1

		JTextField tf1 =new JTextField("");
		l0.add(tf1);
		tf1.setBounds(160,150,200,30);

		//label 2

		JLabel l2=new JLabel("CLASSES: ");
		l0.add(l2);
		l2.setBounds(100,180,200,30);

		//combobox

		String country[]={"11-12","9-10","6-8","1-5"};        
    		JComboBox cb=new JComboBox(country);    
   		cb.setBounds(170, 180,100,30);    
   		l0.add(cb);

		//button 1
		
		JButton b1=new JButton("back");
		l0.add(b1);
		b1.setBounds(500,400,100,30);
		
 		//button 2

		JButton b2=new JButton("next");
		l0.add(b2);
		b2.setBounds(600,400,100,30);
		
		
		//double dimension array
  
		String data[][]=new String [7][10]; 
		data[0][1]="1";
		data[0][2]="2";
		data[0][3]="3";
		data[0][4]="4";
		data[0][5]="Break";
		data[0][6]="5";
		data[0][7]="6";
		data[0][8]="7";		
		data[0][9]="8";
		data[1][0]="MONDAY";
		data[2][0]="TUESDAY";
		data[3][0]="WEDNESDAY";
		data[4][0]="THURSDAY";
		data[5][0]="FRIDAY";
		data[6][0]="SATURDAY";
		
		//column

		String column[]={"0","1","2","3","4","break","5","6","7","8"};

		//jtable

		JTable jt=new JTable(data,column);    
		jt.setBounds(0,250,1300,110); 
		l0.add(jt);
		
		
		//action listener 1
		
		b1.addActionListener(new ActionListener()
		{  
			public void actionPerformed(ActionEvent e)
			{
				
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
		});

		//action listener 2

		b2.addActionListener(new ActionListener()
		{  
			public void actionPerformed(ActionEvent e)
			{
				//making file classes
				String data =String.valueOf( cb.getItemAt(cb.getSelectedIndex()));
				
				if(data=="11-12")
				{ 	  
					String st=tf1.getText();
					period(jt,st,1); 
				}
				if(data=="9-10")
				{ 	  
					String st=tf1.getText();
					period(jt,st,2); 
				}
				if(data=="6-8")
				{ 	  
					String st=tf1.getText();
					period(jt,st,3); 
				}
				if(data=="1-5")
				{   
					String st=tf1.getText();
					period(jt,st,4); 
				}
			}
		});
		//final commands

		jf.setSize(1400,1000);  
    		jf.setLayout(null); 
    		jf.setVisible(true);  
    		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	}
    
 	public static void period(JTable table,String st,int k)
	{
		if(k==1)
		{
    			try
			{
       				 TableModel model = table.getModel();
        			 FileWriter excel = new FileWriter("C:\\substitution programme\\user data\\app\\high\\"+st+".txt");
				 excel.write(";");
        			 for(int i=1; i< model.getRowCount(); i++) 
				 {
            				for(int j=0; j < model.getColumnCount(); j++) 
					{       if(model.getValueAt(i,j)!=null)
                				excel.write(model.getValueAt(i,j).toString()+",");
						if(model.getValueAt(i,j)==null)
						excel.write("@,");
            				}
            				excel.write(";");
       				 }

        			excel.close();

    			}catch(Exception ee){}
		}
		if(k==2)
		{
    			try
			{
       				 TableModel model = table.getModel();
        			 FileWriter excel = new FileWriter("C:\\substitution programme\\user data\\app\\midhigh\\"+st+".txt");
				 excel.write(";");
        			 for(int i=1; i< model.getRowCount(); i++) 
				 {
            				for(int j=0; j < model.getColumnCount(); j++) 
					{       if(model.getValueAt(i,j)!=null)
                				excel.write(model.getValueAt(i,j).toString()+",");
						if(model.getValueAt(i,j)==null)
						excel.write("@,");
            				}
            				excel.write(";");
       				 }

        			excel.close();

    			}catch(Exception ee){}
		}
		
		if(k==3)
		{
    			try
			{
       				 TableModel model = table.getModel();
        			 FileWriter excel = new FileWriter("C:\\substitution programme\\user data\\app\\mid\\"+st+".txt");
				 excel.write(";");
        			 for(int i=1; i< model.getRowCount(); i++) 
				 {
            				for(int j=0; j < model.getColumnCount(); j++) 
					{       if(model.getValueAt(i,j)!=null)
                				excel.write(model.getValueAt(i,j).toString()+",");
						if(model.getValueAt(i,j)==null)
						excel.write("@,");
            				}
            				excel.write(";");
       				 }

        			excel.close();

    			}catch(Exception ee){}
		}
		
		if(k==4)
		{
    			try
			{
       				 TableModel model = table.getModel();
        			 FileWriter excel = new FileWriter("C:\\substitution programme\\user data\\app\\jun\\"+st+".txt");
				 excel.write(";");
        			 for(int i=1; i< model.getRowCount(); i++) 
				 {
            				for(int j=0; j < model.getColumnCount(); j++) 
					{       if(model.getValueAt(i,j)!=null)
                				excel.write(model.getValueAt(i,j).toString()+",");
						if(model.getValueAt(i,j)==null)
						excel.write("@,");
            				}
            				excel.write(";");
       				 }

        			excel.close();

    			}catch(Exception ee){}
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

	public static void main(String args[])
	{
		add ob=new add();
		ob.add2();
	}
}