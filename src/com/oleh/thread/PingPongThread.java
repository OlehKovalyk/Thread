package com.oleh.thread;

import java.util.Random;

public class PingPongThread implements Runnable {

	private String word;
	private static String turn;
	private Random random;

	public PingPongThread(String s) {
		word = s;
		random = new Random();
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 300; i++) {
				Thread.sleep(this.getRundomNumber());
				this.playTurn(i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private synchronized void playTurn(int i){
	    if (!word.equals(turn)){
	        turn=word;
	        System.out.println(word + i);
	    }
	}
	
	private int getRundomNumber() {
		return random.nextInt(100);
	}
}
