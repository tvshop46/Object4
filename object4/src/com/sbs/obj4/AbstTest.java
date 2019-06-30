package com.sbs.obj4;

public class AbstTest {

	public static void main(String[] args) {

//AbstCls abst = new AbstCls(); //¿À·ù¶ä. Ãß»óÈ­´Â °´Ã¼È­ ¾ÈµÊ.
		
		AbstCls cls = getObj(1);
		printResult(cls, 10, 20);

		/*
		Calc c = new Calc();
		Calc2 c2 = new Calc2();

		AbstCls ac1 = c;
		AbstCls ac2 = c2;

		System.out.println(c.sum(10, 20));
		System.out.println(c2.sum(10, 20));

		System.out.println(c.multi(10, 20));
		System.out.println(c2.multi(10, 20));
		*/

	}

	public static AbstCls getObj(int a) {
		if (a == 1) {
			return new Calc();
		} else {
			return new Calc3();
		}
	}

	public static void printResult(AbstCls cls, int a, int b) {
		System.out.println(cls.multi(a, b));
	}

}
