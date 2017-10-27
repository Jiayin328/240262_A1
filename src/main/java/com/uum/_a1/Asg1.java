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
    static int x = 0;
    
    public static void listFiles(String path) {
        File folder = new File(path);
        File[] files = folder.listFiles();
        
        for (File file : files) {
            if (file.isFile() && (file.getName().endsWith(".java"))) { 
                countJava++;
                list.add(x, file.getAbsolutePath());
                //System.out.println(list);
            } else if (file.isDirectory()) {
                listFiles(file.getAbsolutePath());
            }
        }
    }
    
    public static void listIssues(String path) throws FileNotFoundException, IOException {
        for (int i=0; i<list.size(); i++){
            String dir = list.get(i).toString();
            //System.out.println(dir);
            BufferedReader br = new BufferedReader(new FileReader(dir));
            String line;
            while ((line = br.readLine()) != null){
                if (line.contains("public static void main")){
                    countIssues++;
                }
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        String dir = "E:\\Online Learning\\Sem 5\\STIW3054 Real-Time Programming"; // put your directory here
        listFiles(dir);
        String path = dir + "\\";
        listIssues(path);
        System.out.println("Number of Java Files = " + countJava + "\nNumber of Issues = " + countIssues);
    }
}