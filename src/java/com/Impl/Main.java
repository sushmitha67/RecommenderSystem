package com.Impl;


import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.Items.UserDetails;
import com.algorithm.naivebayes.NBmain;



public class Main {
	private Scanner scan = null;
	private ArrayList<UserDetails> Details = new ArrayList<UserDetails>();
	private ArrayList<UserDetails> InputDetails = new ArrayList<UserDetails>();
	private UserDetails ud = null;
	private NBmain nb = null;
	
	public static void main(String[] args) throws Exception {
		String dataset_path = System.getProperty(Constants.system_dir);
		dataset_path = dataset_path+File.separator+"Dataset1";
		new Main(dataset_path);
	}
	
public Main(String path) throws Exception {
	scanData(path);
	inputData(path);
	NaiveMain();
}
	
	private void scanData(String path){
		try{
		File file = new File(path);
		File[] f = file.listFiles();
		for(File files:f){
			String name = files.getName();
			name = name.substring(0, name.indexOf("."));
			if(name.equalsIgnoreCase(Constants.dataName)){
				scan = new Scanner(files);
				while(scan.hasNextLine()){
					String data = scan.nextLine().trim();
					
					
					switch (data) {
					case Constants.Name:
						ud = new UserDetails();
							String UserName = scan.nextLine();
							ud.setName(UserName);
						break;
						
						case Constants.Experience:
							String exp = "";
							while(scan.hasNextLine() && !scan.hasNext(Constants.Skills)){
								 exp += scan.nextLine()+"\n";
							}
							if(exp.isEmpty()){
								ud.setExperience("No Data");
							}
							else{
							ud.setExperience(exp.substring(0, exp.lastIndexOf("\n")));
							}
							break;
							
						case Constants.Skills:
							String skills = "";
							while(scan.hasNextLine() && !scan.hasNext(Constants.Education)){
								skills += scan.nextLine()+"\n";
							}
							if(skills.isEmpty()){
								ud.setSkills("No Data");
							}
							else{
							ud.setSkills(skills.substring(0, skills.lastIndexOf("\n")));
							}
							break;
							
						case Constants.Education:
							String edu = "";
							while(scan.hasNextLine() && !scan.hasNext(Constants.Name)){
								edu += scan.nextLine()+"\n";
							}
							if(edu.isEmpty()){
								ud.setEducation("No Data");
							}
							else{
							ud.setEducation(edu.substring(0, edu.lastIndexOf("\n")));
							}
							Details.add(ud);
							ud = null;
							break;

					default:
						break;
					}
				}
			}
		
		}
		
//		Iterator<UserDetails>itr = Details.iterator();
//		while(itr.hasNext()){
//			System.out.println(itr.next().toString());
//			System.out.println("------------------------------------------------------");
//		}
		
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			if(scan!=null)
				scan.close();
		}
	}
	
	private void inputData(String path){
		try{
		File file = new File(path);
		File[] files = file.listFiles();
		for(File f:files){
			String name = f.getName();
			name = name.substring(0, name.indexOf("."));
			if(name.contains("input")){
				scan = new Scanner(f);
				while(scan.hasNextLine()){
					String data = scan.nextLine().trim();
					
					
					switch (data) {
					case Constants.Name:
						ud = new UserDetails();
							String UserName = scan.nextLine();
							ud.setName(UserName);
						break;
						
						case Constants.Experience:
							String exp = "";
							while(scan.hasNextLine() && !scan.hasNext(Constants.Skills)){
								 exp += scan.nextLine()+"\n";
							}
							if(exp.isEmpty()){
								ud.setExperience("No Data");
							}
							else{
							ud.setExperience(exp.substring(0, exp.lastIndexOf("\n")));
							}
							break;
							
						case Constants.Skills:
							String skills = "";
							while(scan.hasNextLine() && !scan.hasNext(Constants.Education)){
								skills += scan.nextLine()+"\n";
							}
							if(skills.isEmpty()){
								ud.setSkills("No Data");
							}
							else{
							ud.setSkills(skills.substring(0, skills.lastIndexOf("\n")));
							}
							break;
							
						case Constants.Education:
							String edu = "";
							while(scan.hasNextLine() && !scan.hasNext(Constants.Name)){
								edu += scan.nextLine()+"\n";
							}
							if(edu.isEmpty()){
								ud.setEducation("No Data");
							}
							else{
							ud.setEducation(edu.substring(0, edu.lastIndexOf("\n")));
							}
							break;

					default:
						break;
					}
				}
				InputDetails.add(ud);
				ud = null;
			}
		}
		
//		Iterator<UserDetails>itr = InputDetails.iterator();
//		while(itr.hasNext()){
//			System.out.println(itr.next().toString());
//			System.out.println("------------------------------------------------------");
//		}
	}catch(Exception e){
		e.printStackTrace();
	}
	finally{
		if(scan!=null)
			scan.close();
	}
	}
	
	private void NaiveMain(){
		try {
			nb = new NBmain(Details, InputDetails);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
