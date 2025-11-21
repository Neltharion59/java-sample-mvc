package Outlier;

import java.util.Random;

public class LoneClass {
	// Empty method - no diagram to draw
	public void A() {
	}
	// No method invocation - no diagram to draw
	public void B() {
		int i = 5;
	}
	// No method invocation - no diagram to draw
	public void C() {
		int i = 5;
		if (i < 7)
		{
			i = i + 2;
		}
	}
	// Only invocations of built-in methods - no diagram to draw
	public void D() {
		System.out.print("Hello World");
		Random r = new Random();
		r.nextBoolean();
	}
	// Invoke 1 Method - return void
	public void E() {
		FriendlyClass friend = new FriendlyClass();
		friend.Method01();
	}
	// Invoke 1 Method - return type
	public void F() {
		FriendlyClass friend = new FriendlyClass();
		friend.Method02();
	}
	// Invoke 2 Methods - fork
	public void G() {
		FriendlyClass friend = new FriendlyClass();
		friend.Method01();
		friend.Method02();
	}
	// Invoke 2 Methods - cascade
	public void H() {
		FriendlyClass friend = new FriendlyClass();
		friend.Method03();
	}
	// If - simple condition, two branches
	public void I() {
		FriendlyClass friend = new FriendlyClass();
		
		int x = 5;
		if (x > 8) {
			friend.Method01();
		}
		else {
			friend.Method03();
		}
	}
}
