// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   StringDemo3.java

import java.io.PrintStream;

public class StringDemo3
{

	public StringDemo3()
	{
	}

	public static String upcase(String s)
	{
		return s.toUpperCase();
	}

	public static void main(String args[])
	{
		String s = "I love Java";

		s = "I love DDHHHH45";
		StringBuilder stringbuilder = new StringBuilder();
		stringbuilder.append("i");
		System.out.println(upcase(s));
		System.out.println(stringbuilder.capacity());
		System.out.println(upcase(stringbuilder.toString()));
	}
}
