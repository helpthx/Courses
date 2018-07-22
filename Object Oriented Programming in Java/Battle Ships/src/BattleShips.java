import java.util.Scanner;
import static java.lang.Math.random;

public class BattleShips {
	public static final Scanner input = new Scanner(System.in);
	public static String[][] playerMap  = new String[10][10];
	public static String[][] computerMap = new String[10][10];
	public static int UserPoinst = 0;
	public static int PCPoinst = 0;
	public BattleShips() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**** Welcome to Battler  Ships game ****");
		System.out.println("Right now, the sea is empty.");
		
		 for (int i = 0; i < 10; i++){
		        for (int j = 0; j < 10; j++){
		            playerMap[i][j] = "   |";
		            computerMap[i][j] = "   |";
		        
		        	}
			}
		 Printmap(playerMap); // Call fuction do print the player map 
		 ChooseShipsUser(playerMap); //Creating User Map
		 ChooseShipsPC(computerMap); //Creating pc map
		 System.out.print("How many Rounds ?");
		 int j = input.nextInt();
		 for(int i = 0 ;i < j; i++) {
		 System.out.println("-------------------------------------------");	 
		 System.out.println("           Round "+  (i+1) + " de 5            "); 
		 System.out.println("-------------------------------------------");
		 GameUser(computerMap);
		 GamePC(playerMap);
		 }
		 EndGame(playerMap,computerMap);
		 
		 
	}
	
	public static void Printmap(String[][] map) {
			System.out.println("-------------------------------------------\n | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |");
	    for (int i = 0; i < map.length; i++){
	        System.out.println("-------------------------------------------");
	        System.out.print(i+"|");
	        for (int j = 0; j < map[0].length; j++){
	            System.out.print(map[i][j]);
	        }
	        System.out.println(i);
	    }
	    System.out.println("-------------------------------------------\n | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |\n-------------------------------------------");
				
		 }
	
	public static void ChooseShipsUser(String[][] map) {
	for(int i = 0; i < 5;) {	
		System.out.print("Enter row coordinate for your ship " + (i + 1) + ": " );
		int x = input.nextInt();
		System.out.print("Enter col coordinate for your ship " + (i + 1) + ": " );
		int y = input.nextInt();
    
    	if(map[x][y] == "   |") {
    		map[x][y] = " @ |";
    		i++;
    		}
    	else 	{
    		System.out.println("You can't put your ship here...");
    		
    		}
    
	}
    Printmap(map);
    
	}

	public static void ChooseShipsPC(String[][] map) {
		System.out.println("Computer is deploying ships");
		for(int i = 0; i < 5;) {	
			int x = (int)(random()*10);
			int y = (int)(random()*10);
	    
	    	if(map[x][y] == "   |") {
	    		map[x][y] = " @ |";
	    		System.out.println((i+1)+". ship DEPLOYED");
	    		i++;
	    		
	    		}
	    	else 	{
	    		System.out.println("Error deploys pcs ship");
	    		
	    		}
	    	
		}
		Printmap(map);
	}
	
	public static void GameUser(String[][] map) {
		
		System.out.println("-------------------------------------------");
		System.out.println("			Player turn                    ");
		for(int i = 1; i <= 1;) {
		System.out.print("Enter row coordinate for atack: " );
		int x = input.nextInt();
		System.out.print("Enter col coordinate for atack: " );
		int y = input.nextInt();
		if(map[x][y] == "   |") { //Missing Call
			map[x][y] = " X |";
			System.out.println("Sorry, you missed" );
			i++;
		}
		else if(map[x][y] == " @ |") { //Snuk ship call
			map[x][y] = " ! |";
			System.out.println("Boom! You sunk the ship!" );
			UserPoinst++;
			i++;
			
		}
		else {
			System.out.println("You cant atack here..." );
		}
		
		}
	  System.out.println("-------------------------------------------");
		//Printmap(map);
		
	}
		
	public static void GamePC(String[][] map) {
		System.out.println("-------------------------------------------");
		System.out.println("			Pc turn                    ");
		int x = (int)(random()*10);
		int y = (int)(random()*10);
		System.out.println("Pc Enter row coordinate for atack: " + x);
		System.out.println("Pc Enter col coordinate for atack: "+ y);
		for(int i = 1; i <= 1;) {
		if(map[x][y] == "   |") { //Missing Call
			map[x][y] = " X |";
			System.out.println("Computer missed");
			i++;
		}
		else if(map[x][y] == " @ |") { //Snuk ship call
			map[x][y] = " ! |";
			System.out.println("The Computer sunk one of your ships!" );
			PCPoinst++;
			i++;
			
		}
		else {
			System.out.println("You cant attack here..." );
		}
		}
		
		//Printmap(map);
		System.out.println("-------------------------------------------");
	}

	public static void EndGame(String[][] map, String[][] map1) {
		 System.out.println("-------------------------------------------");	 
		 System.out.println("                Game over !                "); 
		 System.out.println("-------------------------------------------");
		 
		 if(UserPoinst > PCPoinst) {
			 System.out.println("You sunk: " + UserPoinst);	
			 Printmap(map1);
			 System.out.println("Computer Sunk:" + PCPoinst);
			 Printmap(map);
			 System.out.println("You win !!!");
			 System.out.println("-------------------------------------------");
		 }
		 else if(PCPoinst > UserPoinst) {
			 System.out.println("You Sunk: " + UserPoinst);	
			 Printmap(map1);
			 System.out.println("Computer Sunk:" + PCPoinst);
			 Printmap(map);
			 System.out.println("The Computer win !!!");
			 System.out.println("-------------------------------------------");
			 
		 }
		 else {
			 System.out.println("You Sunk: " + UserPoinst);	
			 Printmap(map1);
			 System.out.println("Computer Sunk:" + PCPoinst); 
			 Printmap(map);
			 System.out.println("Even game !!!");
			 System.out.println("-------------------------------------------");
			 
		 } 
						 
	}
}



