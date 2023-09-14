package endproject;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import endproject.exception.ProperOptionValue;
import endproject.utility.SubMenu;

public class FileMenu {
	public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        File currentDirectory = new File("/home/amrutaneelvodaf/Desktop/files");
        String[] fileNames = currentDirectory.list();
        String con;
        do {
        	System.out.println("Virtual Key : Created By Amruta Neel!");
            System.out.println("1:Display all files present in the current directory in ascending order.");
            System.out.println("2:Sub Option");
			System.out.println("3:Exit");
			System.out.println("Plz enter your choice");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:System.out.println("all files in ascending order");	
			Arrays.sort(fileNames);
            for (String fileName : fileNames) {
                System.out.println(fileName);
            }
				break;
			case 2:SubMenu.subMenuOptions();
				break;
			case 3:System.exit(0);
			}
   
            System.out.println("do you want to continue?(y/n)");
			con = scanner.next();
			
			try {
			if(!con.equals("y") && !con.equals("n")) {
				throw new ProperOptionValue("Plz enter Y or N");
			}
			}catch(Exception e) {
		      System.out.print(e);
			}
        } while (con.equalsIgnoreCase("y")); 
    }
}
