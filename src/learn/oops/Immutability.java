/**
 * 
 */
package learn.oops;

/**
 * @author Sharad
 *
 */

class Sample {
	int e;
	
	static Sample copyObj(Sample source) {
		Sample dest = new Sample();
		// copy all instance variables
		dest.e = source.e;
		return dest;
	}
}

final class MyImmutable {
	final private int a, b;
	final private Sample s;
	
	MyImmutable(int a, int b, Sample s) {
		this.a = a;
		this.b = b;
		this.s = Sample.copyObj(s);
	}
	
	public int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}
	public Sample getSample() {
		return Sample.copyObj(s);
	}
	
}

public class Immutability {
	
	public static void main(String[] args) {
		Sample s = new Sample();
		s.e = 15;
		MyImmutable mi = new MyImmutable(1, 2, s);
		s.e = 20;
		System.out.println(mi.getSample().e);
	}

}
