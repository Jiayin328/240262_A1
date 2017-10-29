//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment1
//Matrik: #240262
//Name: #Yap Jia Yin

package com.uum._a1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Asg1 {
    static int countJava = 0;
    static int countIssues = 0;
    static LinkedList list = new LinkedList();
    
    public static void listFiles(String path) {
        File folder = new File(path);
        File[] files = folder.listFiles();
        
        for (File file : files) {
            if (file.isFile() && (file.getName().endsWith(".java"))) { 
                countJava++;
                list.add(file.getAbsolutePath());
                //System.out.println(list);
            } else if (file.isDirectory()) {
                listFiles(file.getAbsolutePath());
            }
        }
    }
    
    public static void listIssues() throws FileNotFoundException, IOException {
        for (int i=0; i<list.size(); i++){
            String dir = list.get(i).toString();
            //System.out.println(dir);
            BufferedReader br = new BufferedReader(new FileReader(dir));
            String line;
            while ((line = br.readLine()) != null){
                if (line.contains("public static void main")){ //deduct this line from becoming one issue
                    //System.out.println(dir);
                    countIssues++;
                }
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        String dir = System.getProperty("user.dir"); 
        listFiles(dir);
        listIssues();
        countIssues = countIssues - 1; //deduct one from the method listIssues
        System.out.println("Number of Java Files = " + countJava + "\nNumber of Issues = " + countIssues);
    }
}