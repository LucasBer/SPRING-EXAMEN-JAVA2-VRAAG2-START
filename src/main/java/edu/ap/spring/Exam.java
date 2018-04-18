package edu.ap.spring;

import java.awt.Point;
import java.util.*;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class Exam {
	
	// Maak gebruik van lambdas en streams om een array met alle
	// priemgetallen terug te geven
	// 2 punten
	public int[] getPrimes(int[] numbers) {
		
		List<Integer> numbersList = new ArrayList<>();
		for (int i : numbers) {
			numbersList.add(i);
		}
		List<Integer> primesList = numbersList.stream()
		.filter(n -> isPrime(n))
		.collect(Collectors.toList());
		
		int[] array = primesList.stream().mapToInt(i->i).toArray();
		return array;
	}
	
	// Maak gebruik van lambdas en streams alle lowercase characters
	// te tellen in de gegeven string
	// 1 punt
	public int countLowercaseCharacters(String string) {
        char[] charArray = string.toCharArray();
        List<Character> charList = new ArrayList<>();
        for (char c : charArray) {
        	charList.add(c);
        }
        List<Character> lowercaseList = charList.stream()
        .filter(c  -> Character.isLowerCase(c))
        .collect(Collectors.toList());
        int count = lowercaseList.size();
        return count;
	}
	
	// Maak gebruik van lambdas en streams om de som van alle
	// x-coordinaten uit de lijst van points te berekenen
	// 1 punt
	public int sumOfX(List<Point> points) {
		List<Double> xValues = points.stream()
				.map(x -> x.getX())
				.collect(Collectors.toList());
		int sum = 0;
		for (double d : xValues)
			sum += d;
		return sum;
	}
	
	// Maak gebruik van lambdas en streams om een comma-separated
	// string te maken die alle x-coordinaten bevat die groter of gelijk 
	// zijn aan twee
	// 2 punten
	public String getXOverTwo(List<Point> points) {
		
	}
	
	
	//Eigen geschreven functie isPrime
	private static boolean isPrime(int n) 
	{
	    for(int i=2;i<n;i++) 
	    {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
}
