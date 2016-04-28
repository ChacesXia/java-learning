// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   StringTest.java

import java.io.PrintStream;

class StringTest
{

	StringTest()
	{
	}

	public static void main(String args[])
	{
		String s = new String("aaaaa");
		String s1 = new String("aaaab");
		if (s.equals(s1))
			System.out.print("s1=s2");
	}
}
