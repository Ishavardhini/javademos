import java.util.*;
public class LockedMe {
	public static void menu() {
		System.out.println("Please choose one option\n");
		String[] arr= {"1.List the current files",
	                   "2.Business level Operation",
	                   "3.Close the application"};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		for(int i=1;i<=arr.length;i++) {
			if(i==option) {
				switch(option){
				case 1:
					Displayfilenames.filelist();
				    menu();
					break;
				case 2:
					BusinessOperations.displaymenu();
					break;
				case 3:
					closeapp();
					System.exit(0);
					break;
				}
					
			}
		}

	}
		
	public static void main(String[] args) {
		System.out.println("\t******************************\n");
		System.out.println("\t      LOCKERS PVT. LTD.\n");
		System.out.println("\t******************************\n");
		System.out.println("\t   WELCOME TO LOCKEDME.COM\n");
		System.out.println("\t******************************\n");
		System.out.println("\t   DEVELOPER: ISHAVARDHINI\n");
		System.out.println("\t******************************\n");
		menu();

	}
	private static void closeapp() {
		System.out.println("Closing the application");
		
	}

}
