package com.company;

import java.io.File;
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
        File file = new File("C:\\Users\\hipho\\Desktop\\sandy\\santhoshkumar.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        boolean present = file.exists();
       System.out.println("File present "+present);
       File newName = new File("C:\\Users\\hipho\\Desktop\\sandy\\hiphopsandy.txt");
       boolean renameSuccess=file.renameTo(newName);
        System.out.println(" renameSuccess" + renameSuccess);

        //get file name
        System.out.println("File name" + ":" + newName.getName());


    }

    }

