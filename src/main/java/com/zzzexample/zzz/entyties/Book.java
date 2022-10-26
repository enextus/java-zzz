package com.zzzexample.zzz.entyties;

public class Book {
	final String fiStr = "Fuck you, bitch!";
	int idd = 1;

	{
		System.out.println("Блок в классе Book.");
	}

	public Book(int idd) {
		System.out.println("IDD " + idd);

		this.idd = idd;
		System.out.println("this.idd " + this.idd);
	}


	public String getFiStr() {
		return fiStr;
	}

	private Book findBookById(int id) {
		return new Book(id + idd);
	}

	{
		System.out.println("2. блок " + idd);
	}
}
