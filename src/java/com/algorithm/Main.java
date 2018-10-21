package com.algorithm;

import com.Items.path;
import java.awt.Rectangle;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageTree;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

public class Main {
public static String months[]={"January", "February", "March","April","May","June","July","August","September","October","November","December"};

public static int exp_count_page=0;
public static String skills="",education=""; 
public static void main(String[] args) {
		long start = System.currentTimeMillis();
		String path = System.getProperty("user.dir");
		System.out.println(path);
		String pdf_path = path+File.separator+"Dataset";
		File files = new File(pdf_path);
		File[] F = files.listFiles();
		for(File f:F){
			Main.getData(f);
		}
//		String data = Main.getData(F[0]);
		long end = System.currentTimeMillis();
		System.out.println("Time Consumed = "+(end-start)/1000);
	}
	
	public static String getData(File file){
              String exp="",all_page_data="";	
		System.out.println("File Name = "+file.getName());
		String Data = "";
		try{
			PDDocument document = PDDocument.load(file);
			document.getClass();
			if (!document.isEncrypted()) {
		        PDFTextStripperByArea stripper = new PDFTextStripperByArea();
		        stripper.setSortByPosition(true);
		        Rectangle rect = new Rectangle( 0, 0, 600, 6000 );
	            stripper.addRegion( "class1", rect );
	            PDPageTree allPages =  document.getDocumentCatalog().getPages();
                    
                    for(int i=0;i<allPages.getCount();i++)
                    {
                    
	            PDPage firstPage = (PDPage)allPages.get( i );
	            stripper.extractRegions( firstPage );
	           // System.out.println( "Text in the area:" + rect );
	          //  System.out.println( stripper.getTextForRegion( "class1" ) );
		        
                    String page_data=stripper.getTextForRegion( "class1" ) ;
                    
                     String page_data_arr1[]=page_data.split("\n");
                       page_data="";
                       for(int j=0;j<page_data_arr1.length-1;j++)
                       {
                       page_data+=page_data_arr1[j]+"\n";
                       }
                    
                    
                    all_page_data+=page_data+"\n";
                      

                    }
                    
                    
                    
                    
                    
                    String page_data_arr1[]=all_page_data.split("\n");
                   
                    all_page_data="";
                    for(int i=0;i<page_data_arr1.length;i++)
                    {
                    
                    if(!page_data_arr1[i].startsWith("Page") && !page_data_arr1[i].startsWith("\n"))
                    {
                    all_page_data+=page_data_arr1[i]+"\n";
                    
                    }
                    
                    }
                    
                       String page_data_arr[]=all_page_data.split("\n");
                     
                    String name_user=page_data_arr[0];
                    System.out.println("Name="+name_user);
                    
                    
                    
                           System.out.println(""+all_page_data);
                    
                    
                    exp="";skills="";education="";
                    for(int j=0;j<page_data_arr.length;j++)
                    {
                    
                    if(page_data_arr[j].startsWith("Experience"))
                    {
                    
                    //    exp_count_page=j;
                    //    System.out.println("#####"+page_data_arr[j+1]);
                    //    System.out.println("#####"+page_data_arr[j+2]);
                        
                        for(int jj=j+1;jj<page_data_arr.length;jj++)
                        {
                        
                        
                        String line=page_data_arr[jj];
                        if(line.startsWith("Skills & Expertise") ||line.startsWith("Education")||line.startsWith("Certifications")||line.startsWith("Publications")||line.startsWith("Organizations"))
                        {
                        
                        break;
                        }
                        for(int k=0;k<months.length;k++)
                        {
                         String month=months[k];
                         if(line.startsWith(month))
                         {
                         
                             exp+=page_data_arr[jj-1]+"\n";
                             exp+=page_data_arr[jj];
                         
                         }
                        
                        }
                        
                        
                        }
                        
                        
                    
                    }
                    if(page_data_arr[j].startsWith("Skills & Expertise"))
                    {
                        for(int jj=j+1;jj<page_data_arr.length;jj++)
                        {
                        String line=page_data_arr[jj];
                         
                        if(line.startsWith("Certifications")||line.startsWith("Courses") ||line.startsWith("Interests") ||line.startsWith("Education")||line.startsWith("Honors and Awards")||line.startsWith("Publications")||line.startsWith("Organizations")||line.startsWith("Languages"))
                        {
                        
                        break;
                        }
                        else{
                        
                        
                           skills+=page_data_arr[jj]+"\n";
                        }
                        
                        
                        
                        
                        
                        }
                    }
                    if(page_data_arr[j].startsWith("Education"))
                    {
                        for(int jj=j+1;jj<page_data_arr.length;jj++)
                        {
                        String line=page_data_arr[jj];
                          // System.out.println(""+name_user+"#############"+line);
                        if(line.startsWith("Certifications")||line.startsWith("Courses") || line.contains(name_user) || line.startsWith("Interests") ||line.startsWith("Skills & Expertise")||line.startsWith("Volunteer Experience") ||line.startsWith("Honors and Awards")||line.startsWith("Publications")||line.startsWith("Organizations")||line.startsWith("Languages"))
                        {
                        
                        break;
                        }
                        else{
                        
                            if(page_data_arr[jj].contains("Bachelor’s Degree")){education+="Bachelor’s Degree"+"\n";}
                            if(page_data_arr[jj].contains("Master of Management")){education+="Master of Management"+"\n";}
                            if(page_data_arr[jj].contains("Master of Business Administration (M.B.A.)")){education+="Master of Business Administration (M.B.A.)"+"\n";}
                            if(page_data_arr[jj].contains("Master’s Degree")){education+="Master’s Degree"+"\n";}
                            if(page_data_arr[jj].contains("Engineering")){education+="Engineering"+"\n";}
                            if(page_data_arr[jj].contains("Doctor of Philosophy (Ph.D.)")){education+="Doctor of Philosophy (Ph.D.)"+"\n";}
                            if(page_data_arr[jj].contains("Bachelor of Engineering (B.E.)")){education+="Bachelor of Engineering (B.E.)"+"\n";}
                            if(page_data_arr[jj].contains("MBA")){education+="MBA"+"\n";}
                            if(page_data_arr[jj].contains("BA")){education+="BA"+"\n";}
                            if(page_data_arr[jj].contains("MA")){education+="MA"+"\n";}
                            if(page_data_arr[jj].contains("B Sc")){education+="B Sc"+"\n";}
                            if(page_data_arr[jj].contains("Bachelor of Science")){education+="Bachelor of Science"+"\n";}
                            if(page_data_arr[jj].contains("BTech")){education+="BTech"+"\n";}
                            if(page_data_arr[jj].contains("MTech")){education+="MTech"+"\n";}
                            if(page_data_arr[jj].contains("Bachelor of Commerce")){education+="Bachelor of Commerce"+"\n";}
                            if(page_data_arr[jj].contains("General Management")){education+="General Management"+"\n";}
                            
                            
                            
                        
                          
                        }
                        
                        
                        
                        
                        
                        }
                    }
                    
                    
                    
                    
                    
                    
                    
                    }
                
                     
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    // System.out.println("Experience\n"+exp);
                   //  System.out.println("****************************\nSkills\n"+skills);
                   //  System.out.println("****************************\nEducation\n"+education);
                    
                     
                     String my_data="Name\n"+name_user+"\nExperience\n"+exp+"\nSkills\n"+skills+"\nEducation\n"+education+"\n";
                     String path = System.getProperty("user.dir");
                     String d_path = path+File.separator+"dataset.txt";
                            System.out.println(""+d_path);
                     File f=new File(d_path);
                     if(!f.exists())
                     {
                     f.createNewFile();
                        FileOutputStream foutG=new FileOutputStream(f);
                        foutG.write(my_data.getBytes());
                        foutG.close();
                     }
                     else{
                      String line_content="";
                      FileReader fr1 = new FileReader(f);
                      LineNumberReader lnr = new LineNumberReader(fr1);
                      FileInputStream fis=new FileInputStream(f);
                      BufferedReader br = new BufferedReader(new InputStreamReader(fis));
                      while (lnr.readLine() != null){
                      line_content+=br.readLine()+"\n";  
                      }
                     line_content+=my_data+"\n##########\n";
                         System.out.println(""+line_content);
                        FileOutputStream foutG=new FileOutputStream(f);
                        foutG.write(line_content.getBytes());
                        foutG.close();
                     }
		    }
			}catch(Exception e){
				e.printStackTrace();
			}
		System.out.println("---------------------@@@@@@@@@@@@@@@@@@#################################*************************************************************");
		return Data;
                
                
                
                
//                
//                try {
//            // File file  =new File(uploadedFileLocation+"/abc.txt");
//            BufferedReader br = null;
//            FileReader fr1 = null;
//            FileInputStream fis;
//            LineNumberReader lnr1 = null;
//            fis = new FileInputStream(uploadedFileLocation + "/improving_data_integrity.sql");
//            br = new BufferedReader(new InputStreamReader(fis));
//            fr1 = new FileReader(uploadedFileLocation + "/improving_data_integrity.sql");
//            lnr1 = new LineNumberReader(fr1);
//
//            while (lnr1.readLine() != null) {
//                String line_content = br.readLine();
//
//
//                data += line_content + "\n";
//
//            }
//            out.print(data);
//        } catch (Exception e) {
//            e.printStackTrace();
//
//        }
                
	}
        
        
        
        
        
        public static String get_input_Data(File file){
              String exp="",all_page_data="";	
		System.out.println("File Name = "+file.getName());
		String Data = "";
		try{
			PDDocument document = PDDocument.load(file);
			document.getClass();
			if (!document.isEncrypted()) {
		        PDFTextStripperByArea stripper = new PDFTextStripperByArea();
		        stripper.setSortByPosition(true);
		        Rectangle rect = new Rectangle( 0, 0, 600, 6000 );
	            stripper.addRegion( "class1", rect );
	            PDPageTree allPages =  document.getDocumentCatalog().getPages();
                    
                    for(int i=0;i<allPages.getCount();i++)
                    {
                    
	            PDPage firstPage = (PDPage)allPages.get( i );
	            stripper.extractRegions( firstPage );
	           // System.out.println( "Text in the area:" + rect );
	          //  System.out.println( stripper.getTextForRegion( "class1" ) );
		        
                    String page_data=stripper.getTextForRegion( "class1" ) ;
                    
                     String page_data_arr1[]=page_data.split("\n");
                       page_data="";
                       for(int j=0;j<page_data_arr1.length-1;j++)
                       {
                       page_data+=page_data_arr1[j]+"\n";
                       }
                    
                    
                    all_page_data+=page_data+"\n";
                      

                    }
                    
                    
                    
                    
                    
                    String page_data_arr1[]=all_page_data.split("\n");
                   
                    all_page_data="";
                    for(int i=0;i<page_data_arr1.length;i++)
                    {
                    
                    if(!page_data_arr1[i].startsWith("Page") && !page_data_arr1[i].startsWith("\n"))
                    {
                    all_page_data+=page_data_arr1[i]+"\n";
                    
                    }
                    
                    }
                    
                       String page_data_arr[]=all_page_data.split("\n");
                     
                    String name_user=page_data_arr[0];
                    System.out.println("Name="+name_user);
                    
                    
                    
                           System.out.println(""+all_page_data);
                    
                    
                    exp="";skills="";education="";
                    for(int j=0;j<page_data_arr.length;j++)
                    {
                    
                    if(page_data_arr[j].startsWith("Experience"))
                    {
                    
                    //    exp_count_page=j;
                    //    System.out.println("#####"+page_data_arr[j+1]);
                    //    System.out.println("#####"+page_data_arr[j+2]);
                        
                        for(int jj=j+1;jj<page_data_arr.length;jj++)
                        {
                        
                        
                        String line=page_data_arr[jj];
                        if(line.startsWith("Skills & Expertise") ||line.startsWith("Education")||line.startsWith("Certifications")||line.startsWith("Publications")||line.startsWith("Organizations"))
                        {
                        
                        break;
                        }
                        for(int k=0;k<months.length;k++)
                        {
                         String month=months[k];
                         if(line.startsWith(month))
                         {
                         
                             exp+=page_data_arr[jj-1]+"\n";
                             exp+=page_data_arr[jj];
                         
                         }
                        
                        }
                        
                        
                        }
                        
                        
                    
                    }
                    if(page_data_arr[j].startsWith("Skills & Expertise"))
                    {
                        for(int jj=j+1;jj<page_data_arr.length;jj++)
                        {
                        String line=page_data_arr[jj];
                         
                        if(line.startsWith("Certifications")||line.startsWith("Courses") ||line.startsWith("Interests") ||line.startsWith("Education")||line.startsWith("Honors and Awards")||line.startsWith("Publications")||line.startsWith("Organizations")||line.startsWith("Languages"))
                        {
                        
                        break;
                        }
                        else{
                        
                        
                           skills+=page_data_arr[jj]+"\n";
                        }
                        
                        
                        
                        
                        
                        }
                    }
                    if(page_data_arr[j].startsWith("Education"))
                    {
                        for(int jj=j+1;jj<page_data_arr.length;jj++)
                        {
                        String line=page_data_arr[jj];
                          // System.out.println(""+name_user+"#############"+line);
                        if(line.startsWith("Certifications")||line.startsWith("Courses") || line.contains(name_user) || line.startsWith("Interests") ||line.startsWith("Skills & Expertise")||line.startsWith("Volunteer Experience") ||line.startsWith("Honors and Awards")||line.startsWith("Publications")||line.startsWith("Organizations")||line.startsWith("Languages"))
                        {
                        
                        break;
                        }
                        else{
                        
                            if(page_data_arr[jj].contains("Bachelor’s Degree")){education+="Bachelor’s Degree"+"\n";}
                            if(page_data_arr[jj].contains("Master of Management")){education+="Master of Management"+"\n";}
                            if(page_data_arr[jj].contains("Master of Business Administration (M.B.A.)")){education+="Master of Business Administration (M.B.A.)"+"\n";}
                            if(page_data_arr[jj].contains("Master’s Degree")){education+="Master’s Degree"+"\n";}
                            if(page_data_arr[jj].contains("Engineering")){education+="Engineering"+"\n";}
                            if(page_data_arr[jj].contains("Doctor of Philosophy (Ph.D.)")){education+="Doctor of Philosophy (Ph.D.)"+"\n";}
                            if(page_data_arr[jj].contains("Bachelor of Engineering (B.E.)")){education+="Bachelor of Engineering (B.E.)"+"\n";}
                            if(page_data_arr[jj].contains("MBA")){education+="MBA"+"\n";}
                            if(page_data_arr[jj].contains("BA")){education+="BA"+"\n";}
                            if(page_data_arr[jj].contains("MA")){education+="MA"+"\n";}
                            if(page_data_arr[jj].contains("B Sc")){education+="B Sc"+"\n";}
                            if(page_data_arr[jj].contains("Bachelor of Science")){education+="Bachelor of Science"+"\n";}
                            if(page_data_arr[jj].contains("BTech")){education+="BTech"+"\n";}
                            if(page_data_arr[jj].contains("MTech")){education+="MTech"+"\n";}
                            if(page_data_arr[jj].contains("Bachelor of Commerce")){education+="Bachelor of Commerce"+"\n";}
                            if(page_data_arr[jj].contains("General Management")){education+="General Management"+"\n";}
                            
                            
                            
                        
                          
                        }
                        
                        
                        
                        
                        
                        }
                    }
                    
                    
                    
                    
                    
                    
                    
                    }
                
               
                     
                     String my_data="Name\n"+name_user;
                     
                     if(exp.length()>1)
                     {
                     
                     my_data+="\nExperience\n"+exp;
                     }
                     if(skills.length()>1)
                     {
                     my_data+="\nSkills\n"+skills;
                     }
                     if(education.length()>1)
                     {
                     my_data+="\nEducation\n"+education;
                     }
                     
                     
                     
                    
                     
                     
                     
                     String path1 =path.p;
                     String d_path = path1+File.separator+"Dataset1"+File.separator+"input.txt";
                            System.out.println("?????????????????????????????????????????????????????????"+d_path);
                     File f=new File(d_path);
                     if(!f.exists())
                     {
                     f.createNewFile();
                        FileOutputStream foutG=new FileOutputStream(f);
                        foutG.write(my_data.getBytes());
                        foutG.close();
                     }
                     else{

                        FileOutputStream foutG=new FileOutputStream(f);
                        foutG.write(my_data.getBytes());
                        foutG.close();
                     }
		    }
			}catch(Exception e){
				e.printStackTrace();
			}
		System.out.println("---------------------@@@@@@@@@@@@@@@@@@#################################*************************************************************");
		return Data;
                
                
     
	}
        
        
        
        public static String update_dataset(File file){
              String exp="",all_page_data="";	
		System.out.println("File Name = "+file.getName());
		String Data = "";
		try{
			PDDocument document = PDDocument.load(file);
			document.getClass();
			if (!document.isEncrypted()) {
		        PDFTextStripperByArea stripper = new PDFTextStripperByArea();
		        stripper.setSortByPosition(true);
		        Rectangle rect = new Rectangle( 0, 0, 600, 6000 );
	            stripper.addRegion( "class1", rect );
	            PDPageTree allPages =  document.getDocumentCatalog().getPages();
                    
                    for(int i=0;i<allPages.getCount();i++)
                    {
                    
	            PDPage firstPage = (PDPage)allPages.get( i );
	            stripper.extractRegions( firstPage );
	           // System.out.println( "Text in the area:" + rect );
	          //  System.out.println( stripper.getTextForRegion( "class1" ) );
		        
                    String page_data=stripper.getTextForRegion( "class1" ) ;
                    
                     String page_data_arr1[]=page_data.split("\n");
                       page_data="";
                       for(int j=0;j<page_data_arr1.length-1;j++)
                       {
                       page_data+=page_data_arr1[j]+"\n";
                       }
                    
                    
                    all_page_data+=page_data+"\n";
                      

                    }
                    
                    
                    
                    
                    
                    String page_data_arr1[]=all_page_data.split("\n");
                   
                    all_page_data="";
                    for(int i=0;i<page_data_arr1.length;i++)
                    {
                    
                    if(!page_data_arr1[i].startsWith("Page") && !page_data_arr1[i].startsWith("\n"))
                    {
                    all_page_data+=page_data_arr1[i]+"\n";
                    
                    }
                    
                    }
                    
                       String page_data_arr[]=all_page_data.split("\n");
                     
                    String name_user=page_data_arr[0];
                    System.out.println("Name="+name_user);
                    
                    
                    
                           System.out.println(""+all_page_data);
                    
                    
                    exp="";skills="";education="";
                    for(int j=0;j<page_data_arr.length;j++)
                    {
                    
                    if(page_data_arr[j].startsWith("Experience"))
                    {
                    
                    //    exp_count_page=j;
                    //    System.out.println("#####"+page_data_arr[j+1]);
                    //    System.out.println("#####"+page_data_arr[j+2]);
                        
                        for(int jj=j+1;jj<page_data_arr.length;jj++)
                        {
                        
                        
                        String line=page_data_arr[jj];
                        if(line.startsWith("Skills & Expertise") ||line.startsWith("Education")||line.startsWith("Certifications")||line.startsWith("Publications")||line.startsWith("Organizations"))
                        {
                        
                        break;
                        }
                        for(int k=0;k<months.length;k++)
                        {
                         String month=months[k];
                         if(line.startsWith(month))
                         {
                         
                             exp+=page_data_arr[jj-1]+"\n";
                             exp+=page_data_arr[jj];
                         
                         }
                        
                        }
                        
                        
                        }
                        
                        
                    
                    }
                    if(page_data_arr[j].startsWith("Skills & Expertise"))
                    {
                        for(int jj=j+1;jj<page_data_arr.length;jj++)
                        {
                        String line=page_data_arr[jj];
                         
                        if(line.startsWith("Certifications")||line.startsWith("Courses") ||line.startsWith("Interests") ||line.startsWith("Education")||line.startsWith("Honors and Awards")||line.startsWith("Publications")||line.startsWith("Organizations")||line.startsWith("Languages"))
                        {
                        
                        break;
                        }
                        else{
                        
                        
                           skills+=page_data_arr[jj]+"\n";
                        }
                        
                        
                        
                        
                        
                        }
                    }
                    if(page_data_arr[j].startsWith("Education"))
                    {
                        for(int jj=j+1;jj<page_data_arr.length;jj++)
                        {
                        String line=page_data_arr[jj];
                          // System.out.println(""+name_user+"#############"+line);
                        if(line.startsWith("Certifications")||line.startsWith("Courses") || line.contains(name_user) || line.startsWith("Interests") ||line.startsWith("Skills & Expertise")||line.startsWith("Volunteer Experience") ||line.startsWith("Honors and Awards")||line.startsWith("Publications")||line.startsWith("Organizations")||line.startsWith("Languages"))
                        {
                        
                        break;
                        }
                        else{
                        
                            if(page_data_arr[jj].contains("Bachelor’s Degree")){education+="Bachelor’s Degree"+"\n";}
                            if(page_data_arr[jj].contains("Master of Management")){education+="Master of Management"+"\n";}
                            if(page_data_arr[jj].contains("Master of Business Administration (M.B.A.)")){education+="Master of Business Administration (M.B.A.)"+"\n";}
                            if(page_data_arr[jj].contains("Master’s Degree")){education+="Master’s Degree"+"\n";}
                            if(page_data_arr[jj].contains("Engineering")){education+="Engineering"+"\n";}
                            if(page_data_arr[jj].contains("Doctor of Philosophy (Ph.D.)")){education+="Doctor of Philosophy (Ph.D.)"+"\n";}
                            if(page_data_arr[jj].contains("Bachelor of Engineering (B.E.)")){education+="Bachelor of Engineering (B.E.)"+"\n";}
                            if(page_data_arr[jj].contains("MBA")){education+="MBA"+"\n";}
                            if(page_data_arr[jj].contains("BA")){education+="BA"+"\n";}
                            if(page_data_arr[jj].contains("MA")){education+="MA"+"\n";}
                            if(page_data_arr[jj].contains("B Sc")){education+="B Sc"+"\n";}
                            if(page_data_arr[jj].contains("Bachelor of Science")){education+="Bachelor of Science"+"\n";}
                            if(page_data_arr[jj].contains("BTech")){education+="BTech"+"\n";}
                            if(page_data_arr[jj].contains("MTech")){education+="MTech"+"\n";}
                            if(page_data_arr[jj].contains("Bachelor of Commerce")){education+="Bachelor of Commerce"+"\n";}
                            if(page_data_arr[jj].contains("General Management")){education+="General Management"+"\n";}
                            
                            
                            
                        
                          
                        }
                        
                        
                        
                        
                        
                        }
                    }
                    
                    
                    
                    
                    
                    
                    
                    }
                
               
                     
                     String my_data="Name\n"+name_user;
                     
                     if(exp.length()>1)
                     {
                     
                     my_data+="\nExperience\n"+exp;
                     }
                     if(skills.length()>1)
                     {
                     my_data+="\nSkills\n"+skills;
                     }
                     if(education.length()>1)
                     {
                     my_data+="\nEducation\n"+education;
                     }
                     
                     
                     
                    
                     
                     
                     
                     String path1 =path.p;
                     String d_path = path1+File.separator+"Dataset1"+File.separator+"dataset.txt";
                            System.out.println("?????????????????????????????????????????????????????????"+d_path);
                     File f=new File(d_path);
                     if(!f.exists())
                     {
                     f.createNewFile();
                        FileOutputStream foutG=new FileOutputStream(f);
                        foutG.write(my_data.getBytes());
                        foutG.close();
                     }
                     else{
                   String prev_data="";
                          FileReader fr1 = new FileReader(d_path);
              LineNumberReader lnr1 = new LineNumberReader(fr1);
              File file1 =new File(d_path);
              FileInputStream fis=new FileInputStream(file1);
              BufferedReader br = new BufferedReader(new InputStreamReader(fis));
              while (lnr1.readLine() != null){
               String line_content=br.readLine();  
               prev_data+=line_content+"\n";
              }
                         
                         
                         prev_data+=my_data;
                        FileOutputStream foutG=new FileOutputStream(f);
                        foutG.write(prev_data.getBytes());
                        foutG.close();
                     }
		    }
			}catch(Exception e){
				e.printStackTrace();
			}
		System.out.println("---------------------@@@@@@@@@@@@@@@@@@#################################*************************************************************");
		return Data;
                
                
     
	}
}

