package File;

import java.io.File;

public class File1 {

	public static void main(String[] args) {
		File1 f=new File1();
		f.learn_file();
	}

	private void learn_file() {
		File ff=new File("//home//lakshmi/Desktop");
	String[] files_folders=	ff.list();
	for(int i=0;i<files_folders.length;i++) {
		String st=files_folders[i];
		if(st.equals("index1.html")) {
			System.out.println("Yes present");
		}
		else System.out.println("not present");
	}
	}

}
