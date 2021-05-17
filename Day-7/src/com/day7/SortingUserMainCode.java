package com.day7;

import java.util.ArrayList;
import java.util.Collections;

public class SortingUserMainCode {

	public static ArrayList<Integer> sortMergedArrayList(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		list1.addAll(list2);
		Collections.sort(list1);
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(list1.get(2));
		result.add(list1.get(6));
		result.add(list1.get(8));
		return result;
	}
}
