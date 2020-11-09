package com.nit.hk.helper;

import java.util.LinkedHashMap;
import java.util.stream.Stream;

public class CourseMap {
	private static LinkedHashMap<String, Integer> courseMap;
	static {
		courseMap = new LinkedHashMap<String, Integer>();
		courseMap.put("CRT", 1);
		courseMap.put("C & DS", 2);
		courseMap.put("CORE JAVA", 3);
		courseMap.put("ORACLE", 4);
		courseMap.put("HTML,JS", 5);
		courseMap.put("ADV JAVA", 6);
		courseMap.put("SPRING", 7);
		courseMap.put("HIBERNATE", 8);
		courseMap.put("SPRING BOOT", 9);
		courseMap.put("REAL TIME PROJECT", 10);
	}

	public static boolean contains(String course) {
		return courseMap.containsKey(course);
	}

	public static int getCourseID(String course) {
		return courseMap.get(course.toUpperCase());
	}

	public static Stream<String> getCourses() {
		return courseMap.keySet().stream();
	}
}
