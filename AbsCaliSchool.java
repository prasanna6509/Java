package com.javarealtime;

public class AbsCaliSchool 
{
	public static void caliprofessor()
	{
		System.out.println("califonia professor");
	}

	public static void main(String[] args) {
		AbsUcmSchool absUcmSchool= new AbsAtlantSchool();
		absUcmSchool.professor();
		absUcmSchool.exams();
		 AbsCaliSchool.caliprofessor();
		 AbsUcmSchool.Library();
		
	}	

}


