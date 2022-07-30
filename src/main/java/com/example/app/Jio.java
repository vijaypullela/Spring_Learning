package com.example.app;

public class Jio implements Sim {

	@Override
	public void call() {
		System.out.println("Calling using Jio sim");
	}

	@Override
	public void data() {
		System.out.println("Internet using Jio sim");
	}

}
