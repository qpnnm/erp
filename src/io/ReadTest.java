package io;

import java.io.File;
import java.io.FileReader;

public class ReadTest {
	public static void main(String[] args) {

	File f = new File("c:\\read.txt");
		int ch = 0;
		try {
			FileReader fr = new FileReader(f);
			ch = fr.read();
			String str = "";
			while (ch != -1) {
				str += (char) ch;
				ch = fr.read();
			}
			System.out.println(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
