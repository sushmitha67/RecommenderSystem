/**
 * 
 */
package com.algorithm.naivebayes;

/**
 * @author asaha
 *
 */
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.Items.UserDetails;
import com.Items.path;
import java.util.Random;

public class NBmain {
private ArrayList<UserDetails> Details = null;
private ArrayList<UserDetails> InputDetails = null;
private Classifier<UserDetails, String> bayes = new BayesClassifier<UserDetails, String>();

public NBmain(ArrayList<UserDetails> det,ArrayList<UserDetails> InputDet) throws Exception {
	if(Details==null && InputDetails==null){
		this.Details = det;
		this.InputDetails = InputDet;
	}
	init();
}


private void init() throws Exception{
	
	// Create a new bayes classifier with string categories and string features.
	

	// Two examples to learn from.

	// Learn by classifying examples.
	// New categories can be added on the fly, when they are first used.
	// A classification consists of a category and a list of features
	// that resulted in the classification in that category.
	bayes.learn("matched", Details);
        path.al=Details;
//	bayes.learn("negative", FrequentItemsetND);


	// Here are two unknown sentences to classify.
//	String[] unknownText1 = "today is a sunny day".split("\\s");
//	String[] unknownText2 = "there will be rain".split("\\s");
//
	System.out.println( // will output "positive"
	    bayes.classify(InputDetails).getCategory());
//	System.out.println( // will output "negative"
//	    bayes.classify(InputDetails).getCategory());
//
//	// Get more detailed classification result.
	System.out.println(((BayesClassifier<UserDetails, String>) bayes).classifyDetailed(InputDetails));
        
        String dataset_path = path.p;
		dataset_path = dataset_path+File.separator+"Dataset1";
        
verify.compare(dataset_path+"/dataset.txt", dataset_path+"/input.txt");
	// Change the memory capacity. New learned classifications (using
	// the learn method) are stored in a queue with the size given
	// here and used to classify unknown sentences.
	bayes.setMemoryCapacity(500);
}


public static double calculateMean(ArrayList<Integer> data){
	double MEAN = 0;
	int size = data.size();
	Iterator< Integer> itr = data.iterator();
	while(itr.hasNext()){
		MEAN+=itr.next();
	}
	MEAN = MEAN/size;
//        Random r=new Random();
//        MEAN=r.nextDouble();
//        while(MEAN>1)
//        {
//        MEAN=r.nextDouble();
//        }
	return MEAN;
}

}
