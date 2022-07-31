import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BusinessOperations  {
	static File path=new File("E:\\project files\\Phase 1\\Virtual key for repository\\Test files");
	static Scanner sc=new Scanner(System.in);
	public static void displaymenu() {
	String[] arr1= {"1.Add a file",
	        "2.Delete a file",
	        "3.Search a file",
	        "4.Return to the main menu"};
	Scanner sc=new Scanner(System.in);
		System.out.println("Please choose one option\n");
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		int o=sc.nextInt();
		BusinessOperations.operations(o);
		}
	public static void operations(int op) {
		while(true) {
				switch(op) {
				case 1:
					BusinessOperations.addfile();
					displaymenu();
					break;
				case 2:
					BusinessOperations.deletefile();
					displaymenu();
					break;
				case 3:
					BusinessOperations.searchfile();
					displaymenu();
					break;
				case 4:
					LockedMe.menu();
					break;
				default:
					System.out.println("Invalid option");
				}
			}
		}
	
	private static void addfile() {
		System.out.println("Enter the file name to add");
		String file=sc.next().toLowerCase();
		File myfile=new File(path+"//"+file);
			if(myfile.exists()) {
				System.out.println("File already exist");
			}
			try {
				if(myfile.createNewFile()) {
					System.out.println("File is created successfully");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
		

	private static void deletefile() {
		System.out.println("Enter the file name to delete");
		String file=sc.next().toLowerCase();
		File myfile=new File(path+"//"+file);
			if(myfile.delete()){
				System.out.println("File is deleted");
			}
			else {
				System.out.println("File not found");
			}
		
	}
	private static void searchfile() {
		System.out.println("Enter the file name to search");
		String file=sc.next().toLowerCase();
		File myfile=new File(path+"//"+file);
		if(myfile.exists()) {
			System.out.println("The file is present");
		}
		else
			System.out.println("The file is not present");
		
	}	
		
	}
	
	
	


