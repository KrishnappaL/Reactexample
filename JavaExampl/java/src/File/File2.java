package File;

import java.io.File;

public class File2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File2 f=new File2();
		f.learn_file();
	}
	private void learn_file() {
		File ff=new File("//home//lakshmi/Desktop");
	String[] files_folders=	ff.list();//list both file and folders
	for(int i=0;i<files_folders.length;i++) {
		//System.out.println(files_folders[i]);
	
	}
	
	}
}
