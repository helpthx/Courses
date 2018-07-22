import java.util.Scanner;
import static java.lang.Math.random;

public class teste { public static void main(String[] args) { System.out.println("** Welcome to Battle Ships Game **\nRight now, the sea is empty.");

    String[][] playerMap = new String[10][10];
    String[][] computerMap = new String[10][10];
    for (int i = 0; i < 10; i++){
        for (int j = 0; j < 10; j++){
            playerMap[i][j] = "   |";
            computerMap[i][j] = "   |";
        }
    }

    printMap(playerMap);
    playerDeploy(playerMap);
    printMap(playerMap);
    computerDeploy(playerMap, computerMap);
    gamePlay(playerMap, computerMap);
}

public static void printMap(String[][] map){
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

public static void playerDeploy(String[][] playerMap){
    int i = 1;
    while (i < 6){
            Scanner coordinatesInput = new Scanner(System.in);
            System.out.print("Enter coordinates X.Y for your "+i+". ship: ");
            String coordinates = coordinatesInput.next();
            while (!coordinates.matches("\\d{1}[.]{1}\\d{1}")){
                    System.out.print("Please enter valid coordinates: ");
                    coordinates = coordinatesInput.next();
            }
            String[] coordinatesArr = coordinates.split("[.]");
            String xCor = coordinatesArr[1];
            String yCor = coordinatesArr[0];
            int x = Integer.parseInt(xCor);
            int y = Integer.parseInt(yCor);
            if (!playerMap[x][y].equals("   |")){
                System.out.println("You can't place two or more ships on the same location.");
            } else {
                playerMap[x][y] = " @ |";
                i++;
            }
    }
}

public static void computerDeploy(String[][] playerMap, String[][] computerMap){
    System.out.println("Computer is deploying ships");
    int i = 1;
    while (i < 6){
        int x = (int)(random()*10);
        int y = (int)(random()*10);
        if (playerMap[x][y].equals("   |")&&computerMap[x][y].equals("   |")){
            computerMap[x][y] = " @ |";
            System.out.println(i+". ship DEPLOYED");
            i++;
        }
    }
    System.out.println("-------------------------------------------");
}

public static void playerMove(String[][] playerMap, String[][] computerMap){
    int i = 0;
    while (i < 1) {
        Scanner coordinatesInput = new Scanner(System.in);
        System.out.print("YOUR TURN!\nEnter coordinates X.Y: ");
        String coordinates = coordinatesInput.next();
        while (!coordinates.matches("\\d{1}[.]{1}\\d{1}")) {
            System.out.print("Please enter valid coordinates: ");
            coordinates = coordinatesInput.next();
        }
        String[] coordinatesArr = coordinates.split("[.]");
        String xCor = coordinatesArr[1];
        String yCor = coordinatesArr[0];
        int x = Integer.parseInt(xCor);
        int y = Integer.parseInt(yCor);
        if (playerMap[x][y].equals(" @ |")) {
            playerMap[x][y] = " x |";
            computerMap[x][y] = " ! |";
            System.out.println("Oh no, you sunk your own ship :(");
        } else if (computerMap[x][y].equals(" @ |")){
            playerMap[x][y] = " ! |";
            computerMap[x][y] = " x |";
            System.out.println("Boom! You sunk the ship!");
        } else if (!(playerMap[x][y].equals(" x |")||playerMap[x][y].equals(" ! |")||playerMap[x][y].equals(" - |"))&&(computerMap[x][y].equals("   |")||computerMap[x][y].equals(" - |"))){
            playerMap[x][y] = " - |";
            System.out.println("\nSorry, you missed...");
        } else {
            System.out.println("Please enter a different move.\n-------------------------------------------");
            i--;
        }
        i++;
    }
    System.out.println("-------------------------------------------");
}
public static void computerMove(String[][] playerMap, String[][] computerMap){
    System.out.println("COMPUTER'S TURN");
    int i = 0;
    while (i < 1) {
        int x = (int)(random()*10);
        int y = (int)(random()*10);
        if (playerMap[x][y].equals(" @ |")) {
            playerMap[x][y] = " x |";
            computerMap[x][y] = " ! |";
            System.out.println("The Computer sunk one of your ships!");
        } else if (computerMap[x][y].equals(" @ |")){
            playerMap[x][y] = " ! |";
            computerMap[x][y] = " x |";
            System.out.println("The Computer sunk one of its own ships.");
        } else if (!(computerMap[x][y].equals(" x |")||computerMap[x][y].equals(" ! |")||computerMap[x][y].equals(" - |"))&&(playerMap[x][y].equals("   |")||playerMap[x][y].equals(" - |"))){
            computerMap[x][y] = " - |";
            System.out.println("Computer missed.");
        } else {
            i--;
        }
        i++;
    }
    printMap(playerMap);
}

public static int[] gameStat(String[][] playerMap, String[][] computerMap){
    int[] stat = {0,0};
    for (int i = 0; i < playerMap.length; i++){
        for (int j = 0; j < playerMap[0].length; j++){
            if (playerMap[i][j].equals(" @ |")){
                stat[0]++;
            }
            if (computerMap[i][j].equals(" @ |")){
                stat[1]++;
            }
        }
    }
    System.out.println("Your ships: "+stat[0]+" | "+"Computer ships: "+stat[1]+"\n-------------------------------------------");
    return stat;
}

public static void gamePlay(String[][] playerMap, String[][] computerMap){
    playerMove(playerMap, computerMap);
    computerMove(playerMap, computerMap);
    int[] stat = gameStat(playerMap, computerMap);
    if (stat[0]==0) {
        System.out.println("Computer wins!");
    } else if (stat[1]==0){
        System.out.println("Player wins!");
    } else {
        gamePlay(playerMap, computerMap);
    }
}
}