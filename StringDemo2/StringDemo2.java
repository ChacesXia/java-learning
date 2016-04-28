// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   StringDemo2.java

import java.io.PrintStream;

public class StringDemo2
{

	public StringDemo2()
	{
	}

	public static void main(String args[])
	{
		String s = "hhh";
		System.out.println((new StringBuilder()).append(s).append("333").toString());
	}
}
