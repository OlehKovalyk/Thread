package com.oleh.app;

import com.oleh.thread.PingPongThread;

public class App {

	public static void main(String[] args) {
		(new Thread(new PingPongThread("ping"))).start();
		(new Thread(new PingPongThread("________pong"))).start();
	}
}
