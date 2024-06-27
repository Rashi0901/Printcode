package june24.interfacee;

public class Main {
	
	public static void main(String[] args) {
	
		Document d = new Document ();
		
		System.out.println("Document Detail:-");
		
		d.print();
		d.printColor();
		
		System.out.println();
		
		
		Image i = new Image () ;
		
		System.out.println("Image Detail:-");
		
		i.print();
		i.printColor();
	}
	
	

}
