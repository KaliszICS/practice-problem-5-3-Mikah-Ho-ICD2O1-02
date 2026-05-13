/**
 * File: Lesson 5.3 - Arrays, split, swapping
 * Author: Mikah Ho
 * Date Created: May 1, 2026
 * Date Last Modified: May 13, 2026
 */

public class PracticeProblem {

	public static void main(String args[]) {

	}

	//q1
	public static String[] addString(String[] arr, String word, int index) {

		String[] newArr = new String[arr.length + 1];
		
		String val = "";

		for (int i = 0; i < arr.length; i++) {

			if (i == index) { //if index within length of the original array

				newArr[i] = word;
				val = arr[i]; //stores displaced value
			}
			else {

				if (val.length() > 0) { //after new index added

					newArr[i] = val;
					val = arr[i];
				} 
				else { //before
					
					newArr[i] = arr[i];
				}
			}
		}

		if (index == arr.length) { //if index is at the end of list

			newArr[newArr.length - 1] = word;
		}
		else {

			newArr[newArr.length - 1] = val;
		}

		return newArr;
	}

	//q2
	public static char[] removeChars(char[] arr, char c) {

		int numOfChar = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == c) {

				numOfChar++;
			}
		}

		char[] newArr = new char[arr.length - numOfChar];

		int index = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != c) {

				newArr[index] = arr[i];
				index++;
			}
		}

		return newArr;
	}
}
