package polymorphism;

public class Overiding {

	public static void main(String[] args) {

		SBI S = new SBI();
		ICICI C = new ICICI();
		Punjab P = new Punjab();

		System.out.println(S.RateofInterest() + C.RateofInterest());
		System.out.println(C.RateofInterest());
		System.out.println(P.RateofInterest());

	}

}

class Bank {

	public int RateofInterest() {
		return 0;
	}
}

class SBI extends Bank {

	public int RateofInterest() {
		return 8;
	}
}

class ICICI extends Bank {

	public int RateofInterest() {
		return 7;
	}

}

class Punjab extends Bank {

	public int RateofInterest() {
		return 10;
	}

}