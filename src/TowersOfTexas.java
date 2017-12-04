
public class TowersOfTexas {
	
public static final int SIZE = 3;
	
	public static void main(String[] args) {
		towerTop();
		towerMiddle();
		towerBase();

	}
	
	public static void towerTop () {
		printHashLine();
		printVerticalLine();
		System.out.println();
	}
	
	private static void printHashLine () {
		for (int hSpaces = 1; hSpaces <= 4 * SIZE + 2; hSpaces++)
			System.out.print(" "); 
		for (int hash = 1; hash <= 2 *SIZE -1 ; hash++)
			System.out.print("#");
		}
	
	private static void printVerticalLine() {
		for (int i = 2; i <= 2 * SIZE - 1 ; i++) {
			System.out.println();
			for (int vSpaces = 1; vSpaces <= 4 * SIZE + 2; vSpaces++)
				System.out.print(" ");
			for (int vertical = 1; vertical <= 2 *SIZE - 1; vertical++) {
					System.out.print("|");					
				}
		}
			System.out.println();
			printHashLine();
	}
	
	
	
	public static void towerMiddle() {
		printTidalLine();
		printWindowLine();
		repeatTidalWindows();
		
		
		
	}
	private static void printTidalLine () {
		for (int tSpaces = 1; tSpaces <= 4 * SIZE ; tSpaces++)
			System.out.print(" ");
			for (int tidal = 1; tidal <= (2 * SIZE) + 3; tidal++) {
				System.out.print("~");
			}
			System.out.println();
	}
	
	private static void printWindowLine() {
		for (int wSpaces = 1; wSpaces <= 4 * SIZE ; wSpaces++)
			System.out.print(" ");
				System.out.print("|");
				for (int window = 1; window <= SIZE; window++ ) {
					System.out.print("-o");
				}		
		System.out.print("-|\n");
	}
	
	private static void repeatTidalWindows () {

		for (int i = 0; i <= 7 * (SIZE -2) ; i++) {
			printTidalLine();
			printWindowLine();
		}
		 printTidalLine();
	} 
	
	public static void towerBase () {
		printBase1();
		printBase2();
		printBase3();
		repeatBase3();	
	}
	
	private static void printBase1 () {
		for (int bSpaces = 1; bSpaces <= 2 * (SIZE -1) ; bSpaces++)
			System.out.print(" ");
		System.out.print("/");		
			for (int quoteOpen = 0; quoteOpen <= 3 * SIZE + 1; quoteOpen++) {
				System.out.print('"') ;
				for (int apostrophe = 0; apostrophe <= 0; apostrophe++ ) {
					System.out.print("'");	
			}
		}
		System.out.print('"');
		System.out.println((char) 92);
	}
	
	private static void printBase2 () {
		System.out.print("/");
		for (int quoteOpen = 0; quoteOpen <= 5 * SIZE - 1; quoteOpen++) {
			System.out.print('"');
			for (int apostrophe = 0; apostrophe <= 0; apostrophe++) {
				System.out.print("'");
			}
		}
		System.out.print('"');
		System.out.println((char) 92);
	}
	
	private static void printBase3 () {
		System.out.print("/");
		for (int finalQuotes = 0; finalQuotes <= 5 * SIZE - 1; finalQuotes++) {
			System.out.print('"');
			for (int baseWindow = 0; baseWindow <= 0; baseWindow++) {
				System.out.print("O");
				}		
		}	
		System.out.print('"');
		System.out.println((char) 92);
	}
	
	private static void repeatBase3() {
		for (int i = 1; i<= SIZE - 1; i++) {
			printBase3();
		}
	}
}
