package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMapTest {
	public static void main(String[] args) {
		List<Map<String, String>> personList = new ArrayList<>();
		Map<String, String> person = new HashMap<>();
		person.put("name", "최인혁");
		person.put("지역", "서울");
		person.put("전번", "444-1234");
		personList.add(person);
		person = new HashMap<>();
		person.put("name", "나비");
		person.put("지역", "경기");
		person.put("전번", "123-1234");
		personList.add(person);
		person = new HashMap<>();
		person.put("name", "춘삼이");
		person.put("지역", "대구");
		person.put("전번", "555-1234");
		personList.add(person);

		List<Map<String, String>> phoneList = new ArrayList<>();
		Map<String, String> phone = new HashMap<>();
		phone.put("지역", "서울");
		phone.put("국번", "02");
		phoneList.add(phone);
		phone = new HashMap<>();
		phone.put("지역", "경기");
		phone.put("국번", "031");
		phoneList.add(phone);
		phone = new HashMap<>();
		phone.put("지역", "인천");
		phone.put("국번", "032");
		phoneList.add(phone);
		phone = new HashMap<>();
		phone.put("지역", "대구");
		phone.put("국번", "053");
		phoneList.add(phone);
		phone = new HashMap<>();
		phone.put("지역", "부산");
		phone.put("국번", "051");
		phoneList.add(phone);

		for (Map<String, String> p : personList) {
//			System.out.println(p);
			for (Map<String, String> ph : phoneList) {
//				System.out.println(ph);
				if (p.get("지역").equals(ph.get("지역"))) {
					System.out.println(
							"지역:" + p.get("지역") + "  " + p.get("name") + ":" + ph.get("국번") + "-" + p.get("전번"));
				}
			}

		}
	}
}
