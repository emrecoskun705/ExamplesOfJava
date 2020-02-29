package com.company;

public class Main {

    public static void main(String[] args) {
//	SomeClass one = new SomeClass("one");
//	SomeClass two = new SomeClass("two");
//	SomeClass three = new SomeClass("three");
//
//	System.out.println(one.getInstanceNumber());
//	System.out.println(two.getInstanceNumber());
//	System.out.println(three.getInstanceNumber());
//	System.out.println(one.getClassCounter());

//		int pw = 76543;
//		Password password = new Password(pw);
//		password.storePassword();
//		password.letMeIn(32423);
//		password.letMeIn(-123);
//		password.letMeIn(342);
//		password.letMeIn(54634);
//		password.letMeIn(76543);

		System.out.println("Main method called");
		SIBTest test = new SIBTest();
		test.someMethod();
		System.out.println("Owner is " + SIBTest.owner);
    }
}
