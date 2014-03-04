package main;

import java.io.Serializable;

import frame.HangmanFrame;

public class HangmanGame extends Object implements Runnable, Serializable {
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		HangmanFrame frame = new HangmanFrame();
		frame.setVisible(true);
	}

	@Override
	public void run() {

	}
}