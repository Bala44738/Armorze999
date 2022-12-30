package abstraction;

public abstract  class RBI {
	
	
//	int x;
//	int y;
//	static int z;
//	String name;
//	
//	int a = x+y;
//	
//	 public RBI(int x, int y, String name) {
//		super();
//		this.x = x;
//		this.y = y;
//		this.name = name;
//	}

	public void creatAcc() {
     	System.out.println("RBI:--creat Acc");
     }
	 
	 public void processLoan() {
		 System.out.println("RBI:--Your loan was Sucess");
	 }
	 
	 public abstract void createPpf();
	 public abstract void goldLoan();
	

}
