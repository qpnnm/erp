package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonInputTest {
	public static void main(String[] args) {
		List<Map<String, String>> personList = new ArrayList<>();
		List<String> keyList = new ArrayList<>();

		File f = new File("c:\\person.txt");
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f), "UTF-8"));
			String personStr = "";
			String str;
			while ((str = br.readLine()) != null) {
				if (keyList.size() == 0) {
					String[] keys = str.split(",");
					for (String key : keys) {
						keyList.add(key);
					}
				} else {
					Map<String, String> person = new HashMap<>();
					String[] values = str.split(",");
					for (int i = 0; i < keyList.size(); i++) {
						person.put(keyList.get(i), values[i]);
					}
					personList.add(person);
				}
			}
			System.out.println(personList);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
