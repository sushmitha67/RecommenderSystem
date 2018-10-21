/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithm.naivebayes;

import com.Items.path;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author sumit
 */
public class verify {
    public static String months[]={"January", "February", "March","April","May","June","July","August","September","October","November","December"};
public static String info="";
    public static void compare(String fpath,String inputpath){
    String all_page_data="",inputdata="";
    info="";
       try{
                 
             // System.out.println(1+""+ff[i].getAbsolutePath());
              FileReader fr1 = new FileReader(fpath);
              LineNumberReader lnr1 = new LineNumberReader(fr1);
              File file =new File(fpath);
              FileInputStream fis=new FileInputStream(file);
              BufferedReader br = new BufferedReader(new InputStreamReader(fis));
              while (lnr1.readLine() != null){
               String line_content=br.readLine();  
               all_page_data+=line_content+"\n";
              }
              
              
              
               FileReader fr2 = new FileReader(inputpath);
              LineNumberReader lnr2 = new LineNumberReader(fr2);
              File file2 =new File(inputpath);
              FileInputStream fis2=new FileInputStream(file2);
              BufferedReader br2 = new BufferedReader(new InputStreamReader(fis2));
              while (lnr2.readLine() != null){
               String line_content=br2.readLine();  
               inputdata+=line_content+"\n";
              }
              
              
                String page_data_arr1[]=all_page_data.split("\n");
                String page_data_arr2[]=inputdata.split("\n");
                ArrayList al_exp=new ArrayList();
                ArrayList al_skills=new ArrayList();
                ArrayList al_edu=new ArrayList();
                int a=0,b=0,c=0;
                for(int i=0;i<page_data_arr1.length;i++)
                {
                String indata_line=page_data_arr1[i];
                if(indata_line.startsWith("Name"))
                {
                  
                   
                    System.out.println("Matching With "+page_data_arr1[i+1]+"\n****************");
                    al_exp=new ArrayList();
                    al_skills=new ArrayList();
                    al_edu=new ArrayList();
                }
                  //  System.out.println("**"+indata_line);
                
                if(indata_line.startsWith("Experience"))
                {
                //    System.out.println("Experience **************************"+i);
                for(int k=i;k<page_data_arr1.length;k++)
                {
                      String temp=page_data_arr1[k];
                      if(temp.startsWith("Skills"))
                      {
                      break;
                      }
                      al_exp.add(temp);
                }
                a=1;
                } 
                
                
                if(indata_line.startsWith("Skills"))
                {
                  //   System.out.println("Skills **************************"+i);
                for(int k=i;k<page_data_arr1.length;k++)
                {
                      String temp=page_data_arr1[k];
                      if(temp.startsWith("Education"))
                      {
                      break;
                      }
                      al_skills.add(temp);
                }
                b=1;
                }   
                
                 if(indata_line.startsWith("Education"))
                {
                   //  System.out.println("Experience **************************"+i);
                for(int k=i;k<page_data_arr1.length;k++)
                {
                      String temp=page_data_arr1[k];
                      if(temp.startsWith("Name"))
                      {
                      break;
                      }
                      al_edu.add(temp);
                }
                c=1;
                }
                 
                if(indata_line.startsWith("##########"))
                {
                   System.out.println("Checking Parameter "); 
                   int exp_c=0,skills_c=0,edu_c=0;
                for(int j=0;j<page_data_arr2.length;j++)
                {
                
                String in_line=page_data_arr2[j];
               
                
                 if(in_line.startsWith("Experience"))
                {
                for(int k=j;k<page_data_arr2.length;k++)
                {
                      String temp=page_data_arr2[k];
                      if(temp.startsWith("Skills"))
                      {
                      break;
                      }
                      
                      for(int p=0;p<al_exp.size();p++)
                      {
                      if(temp.contains(al_exp.get(p).toString()) && (!temp.equals("") && !al_exp.get(p).toString().equals("")))
                      {
                      
                       //   System.out.println("EXP Matching "+temp);
                      exp_c++;
                      }
                      }
                }
                } 
                
                
                if(in_line.startsWith("Skills"))
                {
                for(int k=j;k<page_data_arr2.length;k++)
                {
                      String temp=page_data_arr2[k];
                      if(temp.equals("Education"))
                      {
                      break;
                      }
                      for(int p=0;p<al_skills.size();p++)
                      {
                      if(temp.contains(al_skills.get(p).toString()) && (!temp.equals("") && !al_skills.get(p).toString().equals("") ) )
                      {
                      
                          //System.out.println("Skills Matching "+temp);
                      skills_c++;
                      }
                      }
                }
                }   
                
                 if(in_line.startsWith("Education"))
                {
                for(int k=j;k<page_data_arr2.length;k++)
                {
                      String temp=page_data_arr2[k];
                      if(temp.equals("Name"))
                      {
                      break;
                      }
                     for(int p=0;p<al_edu.size();p++)
                      {
                      if(temp.contains(al_edu.get(p).toString()) && (!temp.equals("") && !al_edu.get(p).toString().equals("")))
                      {
                      
                         // System.out.println("Education Matching "+temp);
                      edu_c++;
                      }
                      }
                }
                }
                
                
                
                
                
                }
                
                if(edu_c>0 && skills_c>0 && exp_c>0)
                {
                
                for(int ii=0;ii<exp_c;ii++)
                {
                
//                     for(int k=0;k<months.length;k++)
//                        {
//                         String month=months[k];
//                         if(!al_exp.get(ii).toString().startsWith(month))
//                         {
//                         
//                          System.out.println(""+al_exp.get(ii).toString());
//                          break;
//                         }
//                        
//                        }
                    if(ii==1)
                    {
                     String t=al_exp.get(ii).toString();
                     if(!t.startsWith("January")&&!t.startsWith("February")&&!t.startsWith("March")&&!t.startsWith("April")&&!t.startsWith("May")&&!t.startsWith("June")&&!t.startsWith("July")&&!t.startsWith("August")&&!t.startsWith("September")&&!t.startsWith("October")&&!t.startsWith("November")&&!t.startsWith("December"))
                     {
                     
                     System.out.println(t);
                     info+=t+"\n";
                     }
                    }
                    
                    
                    
                  
                
                }
                    
                }
                
                
                } 
                 
                 
                 
                if(a==1&&b==1&&c==1)
                {
                //  System.out.println("Skills length="+al_skills.size());
                 //   System.out.println("exp length="+al_exp.size());
                //    System.out.println("edu length="+al_edu.size());
                    a=0;b=0;c=0;
                }
                
                }
                
                
                
                    
                    String data=info;
                    String fdata="";
                    String aa[]=data.split("\n");
                    ArrayList al=new ArrayList();
                    for(int i=0;i<aa.length;i++)
                    {
                    al.add(aa[i]);
                    
                    }
                    
                     List li2 = new ArrayList(new HashSet(al)); 
                     Iterator it= li2.iterator();
		     while(it.hasNext())
		     {
		    	 fdata+=it.next()+"\n";
		     }
                    
           //     System.out.println("@@@@@@@@@@"+li2.size());
                
                
                path.info=fdata;
            //    
                   
                
                
                
                
                
                
                
                
                
                
                
                
              
              
              
       }catch(Exception e){
       e.printStackTrace();
       }
    
    }
    
}
