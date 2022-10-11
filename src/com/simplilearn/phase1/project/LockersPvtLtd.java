package com.simplilearn.phase1.project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LockersPvtLtd {
	//Declaring the variables and the path in the class so that all the methods can access.
	 public static String filePath ="C:\\Users\\Narendra\\eclipse-workspace\\Phase1project"; 
     public static Scanner sc = new Scanner(System.in);
  

 	public void introScreen() {
 		System.out.println();
 		System.out.println("*************************************************");
 		System.out.println("*      DEVELOPED BY ASHWINI PATIL     *");
 		System.out.println("*************************************************");
 		System.out.println("*               LOCKEDME.COM                  *");
 		System.out.println("*************************************************");
 		System.out.println("*   Directory: " + filePath +"    *");
 		System.out.println("*************************************************");
 		System.out.println("\n\n");
 		
 		
 	}
 	
 // To display application name and developers details and calling the features of the application
 public static void main(String[] args) throws IOException {

	   
	 LockersPvtLtd  menu = new LockersPvtLtd();
 	  menu.introScreen();
 	
 	  menu.mainMenu();
 	// Call mainMenu		
	 
      while (true) {
    	  

       mainMenu();

         }

       }
     
private static void mainMenu() throws IOException {
	    
	
    		System.out.println("=====================================");
    		System.out.println("|            MAIN MENU              |");
    		System.out.println("=====================================");
    		System.out.println("| Select any one of the following:  |");
    	    System.out.println("|   1 - List All Files              |");
    	    System.out.println("|   2 - More Options                |");
    	    System.out.println("|   3 - Exit                        |");
    	    System.out.println("=====================================");
    	    System.out.println("Enter your choice : ");

    	        int i = sc.nextInt();
    	       
    	      //To Retrieve all files in ascending order		
                
    	        switch (i) {

    	         case 1:

    	              File f= new File(filePath); 
    	              File[] files =f.listFiles(); 
    	              for (File ff :files) {

    	                System.out.println(ff.getName());

    	              }

    	                 mainMenu();

    	                   break;
    	                // call subMenu           

    	         case 2:

    	            subMenu();
                 
    	          //exit mainMenu
    	         case 3:
    	        	    	           System.exit(1);

    	           break;

    	        default:

    	           System.out.println("\nInvalid Input \nValid Input Integers\n");
    	           mainMenu();

    	         break;
    	}
               
    	}

private static void subMenu() throws IOException {
	System.out.println("=====================================");
	System.out.println("|            SUB MENU               |");
	System.out.println("=====================================");
	System.out.println("| Select any one of the following:  |");
    System.out.println("|   1 - Add a file                  |");
    System.out.println("|   2 - Delete a file               |");
    System.out.println("|   3 - Search a file               |");
    System.out.println("|   4 - Go Back                     |");
    System.out.println("=====================================");
    System.out.println("Enter your choice : ");

         int j= sc.nextInt();

        switch (j) {
     // To add  a user specified file from the application
          case 1:

           System.out.println("\n==> Adding a File..."); 
           System.out.println("Please enter a file name: ");

           String filename = sc.next();

            File f1 = new File(filePath, filename);

            f1.createNewFile();
            
            if (f1.exists()) {

               System.out.println("file created in the path" + filePath + filename);
                } 
            else {

               System.out.println("file not created");

                }

              System.out.println("\n**********\n");

             subMenu();

              break;
           // To delete  a user specified file from the application

          case 2:

            System.out.println("\n==> Deleting a File...");
            System.out.println("Please enter a file name to Delete : ");

             File f = new File(filePath);

             File[] files = f.listFiles();

             String filenamel = sc.next();

//File

            boolean b2 = false;

            for (File file: files) { 
              if (file.getName().equals(filenamel)) 
               { 
             	 b2= file.delete();

               }
            }

            if (b2 == true) {

             System.out.println("file has been deleted");

              } 
            else {

             System.out.println("file is not found/ cannot be deleted ");
               }
             System.out.println("\n*************\n");

              subMenu();

          break;
       // To search  a user specified file from the application
          
        case 3:

           System.out.println("\n==> Searching a File...");

           System.out.println("Please enter a file name to Search: ");

           String filename3 = sc.next();

//File

         File f3= new File(filePath);
         File[] files1 = f3.listFiles();

         int flag = 0;

         for (File ff: files1) {

         if (ff.getName().equals(filename3)) {

         flag = 1;

         break;

         }
         else {

          flag = 0;

            }

         }

       if (flag == 1) {

        System.out.println("the file is found");

        }
       else {

         System.out.println("file is not found");
       }
         System.out.println("\n*********************\n");

         subMenu();

         break;

     case 4:

       mainMenu();

        break;

       default:

        System.out.println("Invalid Input \nValid Input )");

        subMenu(); 
        break;
       }
     }


}


