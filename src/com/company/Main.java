package com.company;

public class Main {

    public static void main(String[] args) {
	int[] score1 = { 50, 50, 20, 80, 53};
	int[] score2 = { 20, 50, 50, 53, 80};
	int[] score3 = { 20, 50, 50, 80};

	StudentRecord student1 = new StudentRecord(score1);
	System.out.println(student1.finalAverage());

	StudentRecord student2 = new StudentRecord(score2);
	System.out.println(student2.finalAverage());

	StudentRecord student3 = new StudentRecord(score3);
	System.out.println(student3.finalAverage());
}}
