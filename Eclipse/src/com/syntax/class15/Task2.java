package com.syntax.class15;

public class Task2 {

	public static void main(String[] args) {
		
		
		/*
		 * Напишите программу, которая считывает имена двух людей и определяет, ожидают ли они мальчика или девочку? 
		 * На основе полученных данных предлагает имя для ребенка: 
		 * 
		 * Пример выходных данных: Мамино имя? (Мария), 
		 * Имя отца? (Дэниел), 
		 * Мальчик или девочка? (мальчик), 
		 * Предлагаемое имя ребенка: (DANRY) 
		 * 
		 */
		
		String dadsName="Daniel";
		String momsName="Mary";
	    String expectation="boy";
	    
	    if(expectation.equalsIgnoreCase("boy")) {
	    	String firstHalf=dadsName.substring(0,dadsName.length()/2);
	    	String secondHalf=momsName.substring(momsName.length()/2);
	    	System.out.println(firstHalf+secondHalf);
	    }else {
	    	String firstHalf=momsName.substring(0,momsName.length()/2);
	    	String secondHalf=dadsName.substring(dadsName.length()/2);
	    	System.out.println(firstHalf+secondHalf);
	    }
		
		
	}

}
