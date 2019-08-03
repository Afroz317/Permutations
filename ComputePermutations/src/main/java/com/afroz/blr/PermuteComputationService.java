package com.afroz.blr;

import org.json.JSONArray;
import org.springframework.stereotype.Service;

@Service
public class PermuteComputationService {

	JSONArray permutationsList = new JSONArray();

	public JSONArray addStrings(String name) {
		permutationLogic(name, 0, name.length() - 1);
		return permutationsList;
	}

	private void permutationLogic(String str, int l, int r) {
		if (l == r) {
			permutationsList.put(str);
		} else {
			for (int i = l; i <= r; i++) {
				str = swapCharsInCurrentString(str, l, i);
				permutationLogic(str, l + 1, r);
				str = swapCharsInCurrentString(str, l, i);
			}
		}

	}

	private String swapCharsInCurrentString(String a, int i, int j) {
		char temp = 0;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

}
