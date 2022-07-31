import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Displayfilenames {
	File path=new File("E:\\project files\\Phase 1\\Virtual key for repository\\Test files");
	public static void filelist() {
		File path=new File("E:\\project files\\Phase 1\\Virtual key for repository\\Test files");
		File f1=new File(path+"\\hh.txt");		
		File f2=new File(path+"\\aa.txt");	
		File f3=new File(path+"\\gg.txt");	
		File f4=new File(path+"\\ss.txt");	
		File f5=new File(path+"\\bb.txt");
		try {
			f1.createNewFile();
			f2.createNewFile();
			f3.createNewFile();
			f4.createNewFile();
			f5.createNewFile();
		} catch (IOException e) {
			System.out.println("Error in file creation");
		}
	File files[] = path.listFiles();
	List<File> filesList = Arrays.asList(files);
	Collections.sort(filesList);
	System.out.println("List of files in ascending order");
	for(File file : filesList) {
        System.out.println("File name: "+file.getName());
	
}
}
}


