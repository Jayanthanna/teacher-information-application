import java.io.File;
import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
import java.applet.*;
import java.io.*; 
 import javax.swing.JScrollPane;
import javax.swing.JTable;
public class absent
{
	
	public static void main(String args[])
	{
		combo("C:\\substitution programme\\user data\\app\\");
	}
	public static void combo(String ob1)
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
		
		//label 2

		JLabel ll2=new JLabel(" PLEASE SELECT DAY: ");
		l0.add(ll2);
		ll2.setBounds(250,180,300,30);
 
		//combobox 2

		String classes1[]={"MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};        
    		JComboBox cb1=new JComboBox(classes1);    
   		cb1.setBounds(380, 180,100,30);    
   		l0.add(cb1);
		
		
		//button 1
		
		JButton b1=new JButton("next");
		l0.add(b1);
		b1.setBounds(300,220,100,30);
		//to see which option was selected
		
		//action listener 
		
			 b1.addActionListener(new ActionListener()
 			{  
             			 public void actionPerformed(ActionEvent e)
 				{      
					String data =String.valueOf( cb.getItemAt(cb.getSelectedIndex()));
					String data2=String.valueOf( cb1.getItemAt(cb1.getSelectedIndex()));
					if(data=="11-12")
					{
						if(data2=="MONDAY")
						{
							File fi=new File(ob1+"high");
							String a[]=fi.list();
							show_files(a,ob1+"high",1);
						}
						if(data2=="TUESDAY")
						{
							File fi=new File(ob1+"high");
							String a[]=fi.list();
							show_files(a,ob1+"high",2);
						}
						if(data2=="WEDNESDAY")
						{
							File fi=new File(ob1+"high");
							String a[]=fi.list();
							show_files(a,ob1+"high",3);
						}
						if(data2=="THURSDAY")
						{
							File fi=new File(ob1+"high");
							String a[]=fi.list();
							show_files(a,ob1+"high",4);
						}
						if(data2=="FRIDAY")
						{
							File fi=new File(ob1+"high");
							String a[]=fi.list();
							show_files(a,ob1+"high",5);
						}
						if(data2=="SATURDAY")
						{
							File fi=new File(ob1+"high");
							String a[]=fi.list();
							show_files(a,ob1+"high",6);
						}
					}
					if(data=="9-10")		
					{
						if(data2=="MONDAY")
						{
							File fi=new File(ob1+"midhigh");
							String a[]=fi.list();
							show_files(a,ob1+"midhigh",1);
						}
						if(data2=="TUESDAY")
						{
							File fi=new File(ob1+"midhigh");
							String a[]=fi.list();
							show_files(a,ob1+"midhigh",2);
						}
						if(data2=="WEDNESDAY")
						{
							File fi=new File(ob1+"midhigh");
							String a[]=fi.list();
							show_files(a,ob1+"midhigh",3);
						}
						if(data2=="THURSDAY")
						{
							File fi=new File(ob1+"midhigh");
							String a[]=fi.list();
							show_files(a,ob1+"midhigh",4);
						}
						if(data2=="FRIDAY")
						{
							File fi=new File(ob1+"midhigh");
							String a[]=fi.list();
							show_files(a,ob1+"midhigh",5);
						}
						if(data2=="SATURDAY")
						{
							File fi=new File(ob1+"midhigh");
							String a[]=fi.list();
							show_files(a,ob1+"midhigh",6);
						}
					}
					if(data=="6-8")
					{
						if(data2=="MONDAY")
						{
							File fi=new File(ob1+"mid");
							String a[]=fi.list();
							show_files(a,ob1+"mid",1);
						}
						if(data2=="TUESDAY")
						{
							File fi=new File(ob1+"mid");
							String a[]=fi.list();
							show_files(a,ob1+"mid",2);
						}
						if(data2=="WEDNESDAY")
						{
							File fi=new File(ob1+"mid");
							String a[]=fi.list();
							show_files(a,ob1+"mid",3);
						}
						if(data2=="THURSDAY")
						{
							File fi=new File(ob1+"mid");
							String a[]=fi.list();
							show_files(a,ob1+"mid",4);
						}
						if(data2=="FRIDAY")
						{
							File fi=new File(ob1+"mid");
							String a[]=fi.list();
							show_files(a,ob1+"mid",5);
						}
						if(data2=="SATURDAY")
						{
							File fi=new File(ob1+"mid");
							String a[]=fi.list();
							show_files(a,ob1+"mid",6);
						}
					}
					if(data=="1-5")
					{
						if(data2=="MONDAY")
						{
							File fi=new File(ob1+"jun");
							String a[]=fi.list();
							show_files(a,ob1+"jun",1);
						}	
						if(data2=="TUESDAY")
						{
							File fi=new File(ob1+"jun");
							String a[]=fi.list();
							show_files(a,ob1+"jun",2);
						}
						if(data2=="WEDNESDAY")
						{
							File fi=new File(ob1+"jun");
							String a[]=fi.list();
							show_files(a,ob1+"jun",3);
						}
						if(data2=="THURSDAY")
						{
							File fi=new File(ob1+"jun");
							String a[]=fi.list();
							show_files(a,ob1+"jun",4);
						}
						if(data2=="FRIDAY")
						{
							File fi=new File(ob1+"jun");
							String a[]=fi.list();
							show_files(a,ob1+"jun",5);
						}
						if(data2=="SATURDAY")
						{
							File fi=new File(ob1+"jun");
							String a[]=fi.list();
							show_files(a,ob1+"jun",6);
						}
					}
				}
			});
		
		
	
		//button 2
		
		JButton b2=new JButton("back");
		l0.add(b2);
		b2.setBounds(300,260,100,30);
		
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

//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

	public static void show_files(String a[],String  path,int d)
	{

		
		//frame 

		JFrame f= new JFrame(); 
		
		//background image 

		ImageIcon img= new ImageIcon("background!@#$.jpg");
		JLabel l0=new JLabel("",img,JLabel.CENTER);
		f.add(l0);
		l0.setBounds(0,0,1400,1000);

		//main label

		JLabel l=new JLabel("please select teachers who are absent: ");
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
		
		JButton b1=new JButton("add");
		l0.add(b1);
		b1.setBounds(550,550,100,30);
		

		//textfield
	
		JTextField tf=new JTextField("");
		l0.add(tf);
		tf.setBounds(00,600,1400,30);

		//action listener 1
			 b1.addActionListener(new ActionListener()
 			{  
             			 public void actionPerformed(ActionEvent e)
 				{   
                			String data = "";  
                 			if (list.getSelectedIndex() != -1) 
					{                       
                    				data = tf.getText()+list.getSelectedValue()+",";   
                    				tf.setText(data);  
                 			}  
				}
			});
		
		
		
		//button 2
		
		JButton b2=new JButton("next");
		l0.add(b2);
		b2.setBounds(600,650,100,30);
		
		//action listener 2
		
		 b2.addActionListener(new ActionListener()
 		{  
             		 public void actionPerformed(ActionEvent e)
 			{       try{
				String st1=tf.getText();
				assign(st1,path,d); }catch(Exception ex){}

			}
		});
		
		//button 3
		
		JButton b3=new JButton("back");
		l0.add(b3);
		b3.setBounds(500,650,100,30);
		
		//action listener 3
		
		 b3.addActionListener(new ActionListener()
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
	public static void assign(String absent1,String path,int d)throws IOException
	{
		//array of absent teachers and filling it

		String absentArr[]=absent1.split(",");

		//all files in app folder

		File f=new File(path);

		//storing all files in app folder

		String allTeach[]=f.list();

		// array of present teachers

		String presentArr[]=new String[allTeach.length-absentArr.length];
		int g=0;
		int u1=0;
		for(int i=0;i<allTeach.length;i++)
		{
			for (int j=0;j<absentArr.length;j++)
			{
				if(allTeach[i].equalsIgnoreCase(absentArr[j]))
					g=g+1;
			}
			if(g==0)
			{
				presentArr[u1]=allTeach[i];
				u1++;
			}
			else
			{
				g=0;
			}
		
		}
		

//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$	
	
	//ABSENT TEACHERS

		//absent teacher time table
		
		String absentTimeTable[][]=new String[absentArr.length][10];
		for(int i=0;i<absentArr.length;i++)
			absentTimeTable[i][0]=absentArr[i];
		
		//counter variable

		int counter=-1;

		//gonna store al periods of that day in string format

		String end="";

		//gonna store all periods of the teacher

		String st="";

		//putting the tt of absent teachers in dd array

		for(int q=0;q<absentArr.length;q++)
		{
			FileInputStream fin=new FileInputStream(path+"\\"+absentArr[q]);
			for(int i=0;i!=-1;i=fin.read())
			{
		 		st=st+(char)i;
			}
	
       			for (int j=0;j<st.length();j++)
			{
				if(st.charAt(j)==';')
				{
					counter ++;
					if(counter==d-1)
					{	
						for(int a=j+1;a<st.length();a++)
						{
							if(st.charAt(a)==';')
							{
								
								end=st.substring(j+1,a-1);
										
								break;
							}
						}
						break;
					}
				}
			}
			String temp[]=end.split(",");
			
				for (int o=1;o<10;o++)
				{
					absentTimeTable[q][o]=temp[o];counter=-1;
				}st="";end="";
		}
//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

	//PRESENT TEACHERS		

		//present teacher time table

		
		String presentTimeTable[][]=new String[presentArr.length][10];
		for(int i=0;i<presentArr.length;i++)
			presentTimeTable[i][0]=presentArr[i];
		
		//counter variable

		counter=-1;

		//gonna store al periods of that day in string format

		end="";

		//gonna store all periods of the teacher

		st="";
		for(int q=0;q<presentArr.length;q++)
		{
			
				FileInputStream fin2=new FileInputStream(path+"\\"+presentArr[q]);
				for(int i=0;i!=-1;i=fin2.read())
				{
		 			st=st+(char)i;
				}

				
				for (int j=0;j<st.length();j++)
				{
					if(st.charAt(j)==';')
					{
						counter ++;
						if(counter==d-1)
						{	
							for(int a=j+1;a<st.length();a++)
							{
								if(st.charAt(a)==';')
								{
									end=st.substring(j+1,a-1);
									break;
								}
							}
							break;
						}
					}
				
			}
			String temp[]=end.split(",");
			
				for (int o=1;o<10;o++)
				{
					presentTimeTable[q][o]=temp[o];
				}st="";end="";counter=-1;
			
		}
//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

		//substituting	
		//period array stores no. of periods of present teachers
		
		int cv=0;
		int period[]=new int[presentArr.length];
		for(int i=0;i<presentArr.length;i++)
		{
			for (int j=1;j<10;j++)
			{
				
				if(!presentTimeTable[i][j].equalsIgnoreCase("@"))
				{
					cv++;
				}
			}
			period[i]=cv;
			cv=0;
		}

		//swapping present time tables elements according to the no. of periods they have
		
		int qq=0;
		for(int i = 0; i < period.length; i++)
   		 {	 qq=0;
       			 for(int j = 0; j < period.length-i-1; j++)
       			 {	
           			 if( period[j] > period[j+1])
            			{
                			// swap the elements of period
               				int temp = period[j];
                			period[j] = period[j+1];
                			period[j+1] = temp;
					for(int a=0;a<10;a++)
					{
						if(qq<presentArr.length-1)
						{
							String temp1=presentTimeTable[qq][a];
							presentTimeTable[qq][a]=presentTimeTable[qq+1][a];
							presentTimeTable[qq+1][a]=temp1;
						}
					}
					qq++;
           			 }
				qq++; 
       			 }
  		  }
		  

		qq=0;

		String notSubstituted[]=new String [1000];
		int a=0;
		
		//removing posibility of null pointer exception

		for (int i=0;i<1000;i++)
		{
			notSubstituted[i]="%";
		}

		//substitution

		try{

		for(int i=0;i<absentArr.length;i++)
		{
			for(int j=1;j<10;j++)
			{
				if(period[qq]>=7&&qq<presentArr.length-1)
				{
					qq++;
				}
				if(!presentTimeTable[qq][j].equalsIgnoreCase("@")&&!absentTimeTable[i][j].equalsIgnoreCase("@"))	
				{
					int p=func3(qq,j,presentTimeTable,presentArr.length);
					if(p!=1431)
					{
						presentTimeTable[p][j]=absentTimeTable[i][j];
						period[p]++;
					}
					if(p==1431)
					{a=a+1;
						if(j==1)
							{notSubstituted[a]=j+"st period of "+absentTimeTable[i][0]+" didnt went to substitution class "+absentTimeTable[i][j];}
						if(j==2)
							{notSubstituted[a]=j+"nd period of "+absentTimeTable[i][0]+" didnt went to substitution class "+absentTimeTable[i][j];}
						if(j==3)
							{notSubstituted[a]=j+"rd period of "+absentTimeTable[i][0]+" didnt went to substitution class "+absentTimeTable[i][j];}
						if(j==5)
							{notSubstituted[a]=" break of"+absentTimeTable[i][0]+" didnt went to substitution class "+absentTimeTable[i][j];}
						if(j==4)
							{notSubstituted[a]=j+"th period of "+absentTimeTable[i][0]+" didnt went to substitution class "+absentTimeTable[i][j];}
						if(j==6||j==7||j==8||j==9)
							{notSubstituted[a]=j-1+"th period of "+absentTimeTable[i][0]+" didnt went to substitution class "+absentTimeTable[i][j];}
					}
					continue;
				}
				if(presentTimeTable[qq][j].equalsIgnoreCase("@")&&!absentTimeTable[i][j].equalsIgnoreCase("@"))	
				{
					presentTimeTable[qq][j]=absentTimeTable[i][j];
					period[qq]++;
					continue;
				}
				if(qq>=presentArr.length-1&&!absentTimeTable[i][j].equalsIgnoreCase("@"))
				{a=a+1;
					if(j==1)
						{notSubstituted[a]=j+"st period of "+absentTimeTable[i][0]+" didnt went to substitution class "+absentTimeTable[i][j];}
					if(j==2)
						{notSubstituted[a]=j+"nd period of "+absentTimeTable[i][0]+" didnt went to substitution class "+absentTimeTable[i][j];}
					if(j==3)
						{notSubstituted[a]=j+"rd period of "+absentTimeTable[i][0]+" didnt went to substitution class "+absentTimeTable[i][j];}
					if(j==5)
						{notSubstituted[a]=" break of"+absentTimeTable[i][0]+" didnt went to substitution class "+absentTimeTable[i][j];}
					if(j==4)
						{notSubstituted[a]=j+"th period of "+absentTimeTable[i][0]+" didnt went to substitution class "+absentTimeTable[i][j];}
					if(j==6||j==7||j==8||j==9)
						{notSubstituted[a++]=j-1+"th period of "+absentTimeTable[i][0]+" didnt went to substitution class "+absentTimeTable[i][j];}
					continue;
				}	
			}
		}
}catch(Exception e){System.out.println(e);}

//####################################################################################################################################################################################
		
display1(presentTimeTable,notSubstituted,presentArr.length);
	
	}
//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	//func3 supports substitution
	
		public static int func3(int qq,int j,String pp[][],int len)
	{
		if(!pp[qq][j].equalsIgnoreCase("@")&&qq<len-1)
		{
			qq++;
			func3(qq,j,pp,len);
		}
		if(pp[qq][j].equalsIgnoreCase("@"))
		{
			return(qq);
		}return 1431;

	}
//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	public static void display1(String presentTimeTable[][],String notSubstituted[],int lenp)
	{
		
		//frame 

		JFrame f= new JFrame(); 
		
		//background image 

		ImageIcon img= new ImageIcon("background!@#$.jpg");
		JLabel l0=new JLabel("",img,JLabel.CENTER);
		f.add(l0);
		l0.setBounds(0,0,1400,1000);

		//label 1

		JLabel ll1=new JLabel("TIME TABLE OF TEACHERS PRESENT WITH SUBSTITUTION :");
		l0.add(ll1);
		Font  f1  = new Font(Font.SERIF,  Font.BOLD, 30);
		ll1.setFont(f1);
		ll1.setBounds(0,0,1000,100);
		
		//
		
		for(int i=0;i<lenp;i++)
		{
			for(int j=0;j<10;j++)
			{
				if(presentTimeTable[i][j].equalsIgnoreCase("@"))
					{presentTimeTable[i][j]="";}
			}
		}
		//column

		String column[]={"0","1","2","3","4","break","5","6","7","8"};

		//jtable

		JTable jt=new JTable(presentTimeTable,column);    
		jt.setBounds(0,70,1300,600); 
		l0.add(jt);
		
		//button 1
		
		JButton b1=new JButton("next");
		l0.add(b1);
		b1.setBounds(500,670,100,30);
		
		//action listener for button 2 
		
		b1.addActionListener(new ActionListener()
		{  
			public void actionPerformed(ActionEvent e)
			{
				
				display2(notSubstituted); 
				  	
			}
		});
		
		//final commands

          	f.setSize(1400,1000);  
         	f.setLayout(null);  
         	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		f.setVisible(true);
		
	}
		
	public static void display2(String notSubstituted[])
	{
		
		//frame 

		JFrame f= new JFrame(); 
		
		//background image 

		ImageIcon img= new ImageIcon("background!@#$.jpg");
		JLabel l0=new JLabel("",img,JLabel.CENTER);
		f.add(l0);
		l0.setBounds(0,0,1400,1000);

		//label 1

		JLabel l=new JLabel("NOT SUBSTITUTED PERIODS :");
		Font  f1  = new Font(Font.SERIF,  Font.BOLD, 30);
		l.setFont(f1);
		l0.add(l);
		l.setBounds(0,0,1000,100);
		
		//in case all goes in substitution

		int a=0;
		String A1[]=new String[1];
		A1[0]="ALL PERIODS WENT TO SUBSTITUTION";
		//list
		DefaultListModel<String> l1 = new DefaultListModel<>();  
		for(int i=0;i<notSubstituted.length;i++)
		{
			if(!notSubstituted[i].equalsIgnoreCase("%"))
				{l1.addElement(notSubstituted[i]);a++;}
		}
		if(a==0)
			l1.addElement(A1[0]);
		JList<String> list = new JList<>(l1);  
         	list.setBounds(00,70,1400,600);  
          	l0.add(list);
		
		//button 1
		
		JButton b1=new JButton("done");
		l0.add(b1);
		b1.setBounds(500,670,100,30);
		
		//action listener for button 2 
		
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

		//final commands

          	f.setSize(1400,1000);  
         	f.setLayout(null);  
         	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		f.setVisible(true);
		
	}
	



}






