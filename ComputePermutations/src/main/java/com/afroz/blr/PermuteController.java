package com.afroz.blr;

import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PermuteController {
	@RequestMapping(method = RequestMethod.GET, value = "/permute/{stringName}")
	@ResponseBody
	public String getpermutations1(@PathVariable String stringName) {
		PermuteComputationService permuteComputationService = new PermuteComputationService();
		JSONArray listOfAllPermutationns = permuteComputationService.addStrings(stringName);
		HashMap<String, JSONArray> hashMap = new HashMap<String, JSONArray>();
		hashMap.put(ConstantValues.OUTPUT, listOfAllPermutationns);
		JSONObject outputJSONObject = new JSONObject(hashMap);
		return outputJSONObject.toString();
	}
}
