package com.epam.Lambda.LambdaStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class App 
{
    public static void main( String[] args )
    {
        List<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(14);
        list.add(1);
        list.add(2);
        list.add(10);
        System.out.println(list);
        Double averageDouble = getAverage(list);
        System.out.println("The Average is: " + averageDouble);
    }
    public static Double getAverage(List<Integer> list) {
    	return list.stream()
    	.mapToInt(i -> i)
    	.average()
    	.getAsDouble();	
    }
}
