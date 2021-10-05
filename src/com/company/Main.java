package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        // create folder
//         File file = new File("C:\\Users\\hipho\\Desktop\\sandy\\learing\\java");
//        boolean present = file.exists();
//        System.out.println("Folder present :" + present);
//        if(present == false){
//            //file.mkdir();
//            //creating sub folder
//            file.mkdirs();
//            present= file.exists();
//            System.out.println("Folder present :" + present);
//          }
        // create a file
//        File file = new File("C:\\Users\\hipho\\Desktop\\sandy\\santhosh.pdf");
//        boolean present = file.exists();
//        System.out.println("File present "+present);
//        if(present == false) {
//
//            try {
//               boolean created = file.createNewFile();
//                System.out.println("file created" +created);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        // delete a file
//        File file = new File("C:\\Users\\hipho\\Desktop\\sandy\\santhosh.pdf");
//        file.delete();
//        boolean present = file.exists();
//        System.out.println("File present "+present);

        //Rename file
//        File file = new File("C:\\Users\\hipho\\Desktop\\sandy\\santhoshkumar.txt");
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        boolean present = file.exists();
//       System.out.println("File present "+present);
//       File newName = new File("C:\\Users\\hipho\\Desktop\\sandy\\hiphopsandy.txt");
//       boolean renameSuccess=file.renameTo(newName);
//        System.out.println(" renameSuccess" + renameSuccess);
//
//        //get file name
//        System.out.println("File name" + ":" + newName.getName());

        //list of all file & folders name in specific  directory
//        File file = new File("C:\\Users\\hipho\\Desktop");
//        String [] listOfFilesFolders = file.list();
////        for(int i=0;i<listOfFilesFolders.length;i++)
////            System.out.println(listOfFilesFolders[i]);
//        //for each
//        for( String s: listOfFilesFolders)
//        System.out.println(s);

//        //list all file folder with path
//        File file = new File("C:\\Users\\hipho\\Desktop");
//        File [] listOfFiles = file.listFiles();
//        for( File f: listOfFiles)
//            System.out.println(f);
        //list folder only
//        File file = new File("C:\\Users\\hipho\\Desktop");
//        File [] listOfFolders = file.listFiles();
//        for( File f: listOfFolders)
//        if(f.isDirectory())
//            System.out.println(f);

        //list only text files
//        File file = new File("C:\\Users\\hipho\\Desktop");
//        File [] FileArray = file.listFiles();
//        for(File f : FileArray)
//        {
//            if(f.isFile()){
//               String fileName =f.getName();
//               int lastDot = fileName.lastIndexOf(".");
//               String extension = fileName.substring(lastDot+1);
//               if(extension.equals("txt"))
//                   System.out.println(fileName);
//            }
//        }
            //create a file , then  file reader and writer
//        File file = new File("C:\\Users\\hipho\\Desktop\\sandy\\learing\\java\\santhosh.txt");
//
//        try {
//            file.createNewFile();
//            FileWriter writer= new FileWriter(file);
//            writer.write("hello santhosh");
//            writer.flush();
//            writer.close();
//            FileReader filereader = new FileReader(file);
//            int output = filereader.read();
//            while(output != -1) {
//                System.out.print((char) output);
//                output =filereader.read();
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        // file buffer reader and buffer writer


    }

    }

