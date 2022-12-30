package abstraction;

public class TestRbiHdfc {

	public static void main(String[] args) {
          
		Hdfc h = new Hdfc();    // non-runtime               
		
		h.creatAcc();
		h.processLoan();
		h.createPpf();
		h.goldLoan();
		h.houseLoan();
		
		System.out.println("   ");
		
		RBI r = new Hdfc();   // Runtime(Upcasting)
		
		r.creatAcc();
		r.processLoan();
		r.createPpf();
		r.goldLoan();
	
		
	}

}
