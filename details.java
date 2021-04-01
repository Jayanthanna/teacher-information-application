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
public class details
{
	
	public static void main(String args[])
	{
		details1("C://substitution programme//user data//app//");
	}
	public static void details1(String path)
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
		
		JButton b1=new JButton("next");
		l0.add(b1);
		b1.setBounds(200,220,100,30);
		//to see which option was selected
		
		//action listener 
		
			 b1.addActionListener(new ActionListener()
 			{  
             			 public void actionPerformed(ActionEvent e)
 				{      
					String data =String.valueOf( cb.getItemAt(cb.getSelectedIndex()));
					if(data=="11-12")
					{
						File fi=new File(path+"high");
						String a[]=fi.list();
						details2(a,path+"high",data);
						
					}
					if(data=="9-10")		
					{
						File fi=new File(path+"midhigh");
						String a[]=fi.list();
						details2(a,path+"midhigh",data);
					}
					if(data=="6-8")
					{
						
						File fi=new File(path+"mid");
						String a[]=fi.list();
						details2(a,path+"mid",data);
					
					}
					if(data=="1-5")
					{
						
						File fi=new File(path+"jun");
						String a[]=fi.list();
						details2(a,path+"jun",data);
						
					}
				}
			});
		
		
	
		//button 2
		
		JButton b2=new JButton("back");
		l0.add(b2);
		b2.setBounds(200,260,100,30);
		
		//action listener for button 2 
		
			b2.addActionListener(new ActionListener()
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

		//final commands

          	f.setSize(1400,1000);  
         	f.setLayout(null);  
         	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		f.setVisible(true);
	}
	public static void details2(String a[],String path,String classes)
	{
		//frame 

		JFrame f= new JFrame(); 
		
		//background image 

		ImageIcon img= new ImageIcon("background!@#$.jpg");
		JLabel l0=new JLabel("",img,JLabel.CENTER);
		f.add(l0);
		l0.setBounds(0,0,1400,1000);

		//main label

		JLabel l=new JLabel("please select teacher :");
		Font  f1  = new Font(Font.SERIF,  Font.BOLD, 30);
		l.setFont(f1);
		l0.add(l);
		l.setBounds(0,0,1000,100);
		
	
		//list
		DefaultListModel<String> l1 = new DefaultListModel<>();  
		for(int i=0;i<a.length;i++)
		{
			l1.addElement(a[i]);
		}
		JList<String> list = new JList<>(l1);  
         	list.setBounds(00,70,1400,450);  
          	l0.add(list); 
		 
		//button 1
		
		JButton b1=new JButton("open");
		l0.add(b1);
		b1.setBounds(550,550,100,30);
		

		

		//action listener 1
			 b1.addActionListener(new ActionListener()
 			{  
             			 public void actionPerformed(ActionEvent e)
 				{
					if (list.getSelectedIndex() != -1) 
                				details3(path+"//"+list.getSelectedValue(),list.getSelectedValue(),classes);                       
                    				 
				}
			});
		//button 2
		
		JButton b2=new JButton("back");
		l0.add(b2);
		b2.setBounds(550,600,100,30);
		
		//action listener 2
		
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
	public static void details3(String path,String name,String classes)
	{
		//correcting name
		try{
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)=='.'&&name.charAt(i+1)=='t'&&name.charAt(i+2)=='x'&&name.charAt(i+3)=='t')
			{
				name=name.substring(0,i);
				break;
			}
		}}catch(Exception e){System.out.println(e);}
		//frame 
		
		JFrame f= new JFrame(); 
		
		//background image 

		ImageIcon img= new ImageIcon("background!@#$.jpg");
		JLabel l0=new JLabel("",img,JLabel.CENTER);
		f.add(l0);
		l0.setBounds(0,0,1400,1000);
		
		//time table of teacher

		String st="";
		try
		{    
            		FileInputStream fin=new FileInputStream(path);    
               
            		for(int i=0;i!=-1;i=fin.read())//reads the string .Always keep i!=-1.
			{   
             			st=st+(char)i; //prints the string   
            		}    
            		fin.close();    
          	}
		catch(Exception e)
		{
			System.out.println(e);
		}
		String a[]=new String[60];
		String timeTable[][]=new String[7][10];;
		for(int j=0;j<7;j++)
		{	for(int i=0;i<10;i++)
			{
				timeTable[j][i]="%";
			}
		}
		a=st.split(",");
		a[0]="";	
		for(int j=1;j<60;j++)
		{
			String st1=a[j];
			if(st1.charAt(0)==';')
				a[j]="";
		}
		int k=0;
		for(int i=1;i<7;i++)
		{
			for(int j=0;j<10;j++)
			{
				//if(k<61){
				timeTable[i][j]=a[k];
				k++;//}
			}
		}
		timeTable[0][0]="";
		timeTable[1][0]="MONDAY";
		timeTable[2][0]="TUESDAY";
		timeTable[3][0]="WEDNESDAY";
		timeTable[4][0]="THURSDAY";
		timeTable[5][0]="FRIDAY";
		timeTable[6][0]="SATURDAY";
		timeTable[0][1]="1";
		timeTable[0][2]="2";
		timeTable[0][3]="3";
		timeTable[0][4]="4";
		timeTable[0][5]="BREAK";
		timeTable[0][6]="5";
		timeTable[0][7]="6";
		timeTable[0][8]="7";
		timeTable[0][9]="8";

		for(int i=1;i<7;i++)
		{
			for(int j=0;j<10;j++)
			{
				if(timeTable[i][j].equalsIgnoreCase("@"))
					timeTable[i][j]=null;
			}
		}
		
		//label 1

		JLabel l1=new JLabel("NAME: "+name);
		l0.add(l1);
		Font  f1  = new Font(Font.SERIF,  Font.BOLD, 30);
		l1.setFont(f1);
		l1.setBounds(100,130,300,30);

		//label 2

		JLabel l2=new JLabel("CLASSES: "+classes);
		l0.add(l2);
		Font  f2  = new Font(Font.SERIF,  Font.BOLD, 30);
		l2.setFont(f2);
		l2.setBounds(100,180,200,30);

		//column

		String column[]={"0","1","2","3","4","break","5","6","7","8"};

		//jtable

		JTable jt=new JTable(timeTable,column);    
		jt.setBounds(0,250,1300,110); 
		l0.add(jt);
		
		//button 1
		
		JButton b1=new JButton("done");
		l0.add(b1);
		b1.setBounds(550,400,100,30);
		
		//button 2
		
		JButton b2=new JButton("edit");
		l0.add(b2);
		b2.setBounds(1130,150,100,30);
		
		//button 3
		
		JButton b3=new JButton("delete");
		l0.add(b3);
		b3.setBounds(1130,190,100,30);
		
		//button 1 action listener

		b1.addActionListener(new ActionListener()
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
		
		//button 2 action listener

		b2.addActionListener(new ActionListener()
 		{  
             		 public void actionPerformed(ActionEvent e)
 			{      
				edit(path,classes,jt); 
			}
		});
		
		//button 2 action listener

		b3.addActionListener(new ActionListener()
 		{  
             		 public void actionPerformed(ActionEvent e)
 			{      
				int a=JOptionPane.showConfirmDialog(f,"Are you sure?you want to delete this persons data.");  
				if(a==JOptionPane.YES_OPTION)
					{
						File ob=new File(path);
						ob.delete();
					}
				
			}
		});

		//final commands

          	f.setSize(1400,1000);  
         	f.setLayout(null);  
         	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		f.setVisible(true);
	}
	public static void edit(String path,String classes,JTable jt)
	{
	    //NAME
		//getting name from path
		String st=path;int c=0;String name="";

		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)=='/' && st.charAt(i-1)=='/')
			{
				c++;
				if(c==5)
				{
					name=st.substring(i+1,st.length());
				}
			}
		}

		//correcting name

		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)=='.'&&name.charAt(i+1)=='t'&&name.charAt(i+2)=='x'&&name.charAt(i+3)=='t')
			{
				name=name.substring(0,i);
				break;
			}
		}

		//frame 

		JFrame f= new JFrame(); 
		
		//background image 

		ImageIcon img= new ImageIcon("background!@#$.jpg");
		JLabel l0=new JLabel("",img,JLabel.CENTER);
		f.add(l0);
		l0.setBounds(0,0,1400,1000);
		
		//label 1

		JLabel l1=new JLabel("NAME: ");
		l0.add(l1);
		l1.setBounds(100,150,200,30);

		//textfield 1

		JTextField tf1 =new JTextField("");
		l0.add(tf1);
		tf1.setText(name);
		tf1.setBounds(160,150,200,30);
		
		//label 2

		JLabel l2=new JLabel("CLASSES: ");
		l0.add(l2);
		l2.setBounds(100,180,200,30);

		//combobox

		String country[]={"11-12","9-10","6-8","1-5"};        
    		JComboBox cb=new JComboBox(country);    
   		cb.setBounds(170, 180,100,30); 
		cb.setSelectedItem(classes);  
   		l0.add(cb);

		//column

		String column[]={"0","1","2","3","4","break","5","6","7","8"};
		
		//jtable
   
		jt.setBounds(0,250,1300,110); 
		l0.add(jt);
		
		//button 1
		
		JButton b1=new JButton("back");
		l0.add(b1);
		b1.setBounds(500,400,100,30);
		
 		//button 2

		JButton b2=new JButton("done");
		l0.add(b2);
		b2.setBounds(600,400,100,30);
		
		//button 1 action listener

		b1.addActionListener(new ActionListener()
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
		;
		
		//button 2 action listener
		int k;
		b2.addActionListener(new ActionListener()
 		{
			 public void actionPerformed(ActionEvent e)
 			{   
				//deleting old file

             			File ob2=new File(path);
				ob2.delete();
				String name1=tf1.getText();
				String classes1=String.valueOf( cb.getItemAt(cb.getSelectedIndex()));
				if(classes1=="11-12")
				{ 	  
					
					add.period(jt,name1,1); 
				}
				if(classes1=="9-10")
				{ 	  
					
					add.period(jt,name1,2); 
				}
				if(classes1=="6-8")
				{ 	  
					
					add.period(jt,name1,3); 
				}
				if(classes1=="1-5")
				{   
					
					add.period(jt,name1,4); 
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