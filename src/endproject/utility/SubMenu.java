package endproject.utility;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SubMenu {
	
	public static void subMenuOptions() throws Exception{
		
		 File currentDirectory = new File("/home/amrutaneelvodaf/Desktop/files");

	  
		System.out.println("Welcome to Sub Options");
		
        while (true) {
        	System.out.println("2: Sub Menu Options");
            System.out.println("   a: Create a new file");
            System.out.println("   b: Delete a file");
            System.out.println("   c: Check if a file exists");
            System.out.println("   d: Exit sub menu");
            Scanner scanner = new Scanner(System.in);
            char choice = scanner.next().charAt(0);
            System.out.print("Enter your choice: ");
            
           
			switch (choice) {
            case 'a':
                System.out.print("Enter the file name you want to create: ");
                String newFileName = scanner.next();
                
                File newFile = new File(currentDirectory, newFileName);
           if (newFile.exists()) {
                 System.out.println("File already exists.");
             } 
                
                       if (newFile.createNewFile()) {
                          System.out.println("File created successfully.");
                        } else {
                        System.out.println("Failed to create the file.");
                      }
              
         
                break;
            case 'b':
                System.out.print("Enter the file name you want to delete: ");
                String fileToDelete = scanner.next();
                File fileToDeleteObject = new File(currentDirectory, fileToDelete);

                if (fileToDeleteObject.exists()) {
                    if (fileToDeleteObject.delete()) {
                        System.out.println("File deleted successfully.");
                    } 
                } else {
                    System.out.println("File not present.");
                }
                break;
            case 'c':
                System.out.print("Enter the file name you want to check: ");
                String fileToCheck = scanner.next();
                File fileToCheckObject = new File(currentDirectory, fileToCheck);

                if (fileToCheckObject.exists()) {
                    System.out.println("File present.");
                } else {
                    System.out.println("File not present.");
                }
                break;
            case 'd':
                // Exit sub menu
                break;
            
            default:
                System.out.println("Invalid choice.");
                
        }
        }
    
	}

	private static void addFile(String addFileName) {
		// TODO Auto-generated method stub
		
	}

		
	}


