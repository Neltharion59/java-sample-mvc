package Outlier;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoneClass {
	// BATCH 1
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
	// BATCH 2
	// Call own method - fork
	public void J() {
		A();
		B();
	}
	// Call own method - cascade
	public void K() {
		J();
	}
	// If - simple condition, one branch
	public void L() {
		FriendlyClass friend = new FriendlyClass();
		
		friend.Method01();
		
		boolean a = true;
		if (a) {
			friend.Method04();
		}

		friend.Method05();
	}
	// If - simple condition, two branches
	public void M() {
		FriendlyClass friend = new FriendlyClass();
		
		friend.Method01();
		
		boolean a = true;
		if (a) {
			friend.Method04();
		}
		else
		{
			friend.Method03();
		}

		friend.Method05();
	}
	// If - simple conditions, one branch, nested, empty until leaf
	public void N() {
		FriendlyClass friend = new FriendlyClass();
		
		friend.Method01();
		
		boolean a = true;
		boolean b = false;
		int x = 44;
		if (a) {
			if (b) {
				if (x < 55){
					friend.Method04();
				}
			}
		}

		friend.Method05();
	}
	// If - simple conditions, one branch, nested, filled with invocations
	public void O() {
		FriendlyClass friend = new FriendlyClass();
		
		friend.Method01();
		
		boolean a = true;
		boolean b = false;
		int x = 44;
		if (a) {
			friend.Method04();
			if (b) {
				friend.Method05();
				if (x < 55 + 14 && b || a){
					friend.Method06();
				}
				friend.Method07();
			}
			friend.Method08();
		}

		friend.Method09();
	}
	// If - simple conditions, two branches, nested, filled with invocations
	public void P() {
		FriendlyClass friend = new FriendlyClass();
		
		friend.Method01();
		
		boolean a = true;
		boolean b = false;
		int x = 44;
		if (a) {
			friend.Method04();
			if (b) {
				friend.Method05();
				if (x < 55 + 14 && b || a){
					friend.Method06();
				}
				else
				{
					friend.Method08();
				}
				friend.Method07();
			}
			else
			{
				friend.Method06();
			}
			friend.Method08();
		}
		else
		{
			friend.Method05();
			if (b) {

				friend.Method06();
			}
			else
			{
				friend.Method07();
			}
			friend.Method08();
		}

		friend.Method09();
	}
	// If - simple conditions, two conditioned branches
	public void Q() {
		FriendlyClass friend = new FriendlyClass();
		
		friend.Method01();
		
		boolean a = true;
		if (a) {
			friend.Method04();
		}
		else if (!a)
		{
			friend.Method03();
		}

		friend.Method05();
	}
	// If - simple conditions, multiple branches with no else
	public void R() {
		FriendlyClass friend = new FriendlyClass();
		
		int a = 4;
		
		friend.Method08();
		
		if (a == 1) { friend.Method01(); }
		else if (a == 2) { friend.Method02(); }
		else if (a == 3) { friend.Method03(); }
		else if (a == 4) { friend.Method04(); }
		
		friend.Method08();
	}
	// If - simple conditions, multiple branches with else
	public void S() {
		FriendlyClass friend = new FriendlyClass();
		
		int a = 4;
		
		friend.Method08();
		
		if (a == 1) { friend.Method01(); }
		else if (a == 2) { friend.Method02(); }
		else if (a == 3) { friend.Method03(); }
		else if (a == 4) { friend.Method04(); }
		else { friend.Method05(); }
		
		friend.Method08();
	}
	// If - simple conditions, chained opts
	public void T() {
		FriendlyClass friend = new FriendlyClass();
		
		int a = 4;
		
		friend.Method08();
		
		if (a == 1) { friend.Method01(); }
		if (a == 2) { friend.Method02(); }
		if (a == 3) { friend.Method03(); }
		if (a == 4) { friend.Method04(); }
		
		friend.Method08();
	}
	// Loop - for, simple
	public void U() {
		FriendlyClass friend = new FriendlyClass();
		
		friend.Method04();
		
		for(int i = 5; i < 10; i++)
		{
			friend.Method05();
		}
		
		friend.Method06();
	}
	// Loop - foreach, simple
	public void V() {
		FriendlyClass friend = new FriendlyClass();
		
		friend.Method04();
		
		List<String> l = new ArrayList<String>();
		for(String s: l)
		{
			friend.Method05();
		}
		
		friend.Method06();
	}
	// Loop - while, simple
	public void W() {
		FriendlyClass friend = new FriendlyClass();
		
		friend.Method04();
		
		int i = 5;
		while(i < 10 )
		{
			friend.Method05();
			i++;
		}
		
		friend.Method06();
	}
	// Loop - behind invocation
	public void X() {
		W();
		A();
	}
	// If, loop - irrelevant commands
	public void Y() {
		FriendlyClass friend = new FriendlyClass();
		
		friend.Method01();
		
		boolean a = true;
		if (a) {
			int i = 4;
		}
		
		while (a)
		{
			a = false;
		}

		friend.Method05();
	}
	// If - really empty
	public void Z() {
		FriendlyClass friend = new FriendlyClass();
		
		friend.Method01();
		
		boolean a = true;
		if (a) {
		}

		while (!a) {}
		
		friend.Method05();
	}
}
