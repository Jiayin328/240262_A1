//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment1
//Matrik: #240262
//Name: #Yap Jia Yin

package com.uum._a1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Asg1 {
    static int countJava = 0;
    static int countIssues = 0;
    static LinkedList list = new LinkedList();
    static int x = 0;
    static Object a = new Object();
    
    private static void listFiles(String path) {
        File folder = new File(path);
        File[] files = folder.listFiles();
        
        for (File file : files) {
            if (file.isFile() && (file.getName().endsWith(".java"))) { 
                countJava++;
                list.add(x, file.getName());
                //System.out.println(list.size());
            } else if (file.isDirectory()) {
                listFiles(file.getAbsolutePath());
            }
            
        }
    }
    
    private static void listIssues() {
        for (int i=0; i<list.size(); i++){
            a = list.get(i);
            try (final BufferedReader br = new BufferedReader(new FileReader((String) a))) {
                String readLine;
                while ((readLine = br.readLine()) != null) {
                    if (readLine.contains("public static void main")) {
                        countIssues++;
                    }
                }
            }catch (IOException e) {

            }
        }
    }
    
    public static void main(String[] args) {
        String dir = "E:\\Online Learning\\Sem 5\\STIW3054 Real-Time Programming"; // put your directory here
        listFiles(dir);
        listIssues();
        System.out.println("\nNumber of Java Files = " + countJava + "\nNumber of Issues = " + countIssues);
    }
}
