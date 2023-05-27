package com.string;

public class DeleteAlternateCharacter {

	static String delAltChar(String s) {
		String temp = "";
		for (int i = 1; i < s.length(); i = i + 2) {
			temp = temp.concat(s.substring(i, i + 1));
		}

		return temp;
	}

	public static void main(String[] args) {

		DeleteAlternateCharacter.delAltChar("Aadesh");
	}
}
