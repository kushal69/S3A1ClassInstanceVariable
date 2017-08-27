package com;

public class ClassInstanceVariables {

	int instanceVariable = 10;	//	Instance Variable - Whose scope limits to the object

	static int classVariable = 20;	//	Class Variable - Whose scope limits to the Class of objects

	public static void main(String[] args) {

		ClassInstanceVariables classInstanceVariablesOne = new ClassInstanceVariables();	//	Object One
		ClassInstanceVariables classInstanceVariablesTwo = new ClassInstanceVariables();	//	Object Two

		System.out.println("Instance variable value Before changing from Object ONE -"
				+ classInstanceVariablesOne.instanceVariable);
		System.out.println("Class variable value Before changing from Object ONE -" 
				+ ClassInstanceVariables.classVariable);
		System.out.println();

		classInstanceVariablesOne.instanceVariable = 20;	//	Value set to Instance variable from the object one.
		ClassInstanceVariables.classVariable = 30;	//	Value set to Class variable in a static manner.

		System.out.println("Instance variable value After changing from Object ONE -"
				+ classInstanceVariablesOne.instanceVariable);	//	Prints the instance variable value From the object one - which will print 20
		System.out.println("Class variable value After changing from Object ONE -" 
				+ ClassInstanceVariables.classVariable);	// Prints the Class variable value accessed in a static way - which will print 30
		System.out.println();

		//	Prints the instance variable value From the object two - which will print 10 (As the scope is limited to object)
		System.out.println("Instance variable value After changing from Object Two -"
				+ classInstanceVariablesTwo.instanceVariable);
		//	Prints the Class variable value accessed in a static way - which will print 30 (As the scope is limited to Class)
		System.out.println("Class variable value After changing from Object Two -" 
				+ ClassInstanceVariables.classVariable);
		System.out.println();
	}
}