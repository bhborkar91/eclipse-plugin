package com.bhborkar.ide.library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;

/**
 * Hello world!
 *
 */
public class App 
{
	public String get() {
		List<Integer> asList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		CollectionUtils.filter(asList, x -> x > 2);
		return "From library : [" + asList + "]";
	}
}
