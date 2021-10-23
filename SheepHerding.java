/**********
 A Java program to demonstrate
 SheepHerding class which contains main method for Sheepdog trials game
 enter the co-ordinates of dog in command window
 it will show in the graphics window
 BlanchedAlmond filled circle with S is sheep
 Tan filled circle with D is dog
 there are four sheep and one dog in a 3*3 grid
 
 Written by: Yuelin Hou
 Verision 3.3
 Date: 10 December 2020
**********/

import sheffield.*;
import java.util.Random;

public class SheepHerding {
	public static void main (String args[]){
		System.out.print("This is a Sheep-Dog trials game in a 3*3 grid."+'\n');
		DisplayGame display = new DisplayGame(0,0,0,0,0);
    	//randomly distributed across the grid
    	Random random = new Random();
    	//create a matrix for sheep to store the data of col and row of sheep
    	int[] sheepRowMatrix = new int[4];
    	int[] sheepColMatrix = new int[4];
    	//show each sheep in the graphics window
    	for(int i=0;i<4;i++){
    		int sheepRow = random.nextInt(3)+1;
    		int sheepCol = random.nextInt(3)+1;
    		sheepRowMatrix[i] = sheepRow;
    		sheepColMatrix[i] = sheepCol;
    		display.displayGrid();
    		display.setSheepRow(sheepRowMatrix[i]);
        	display.setSheepCol(sheepColMatrix[i]);
        	display.setSheepNumber(i);
        	display.displaySheep(sheepRowMatrix[i],sheepColMatrix[i],i);
    	}
    	//keep on entre dog co-ordinates until four sheep are in the same square
    	while(!(sheepRowMatrix[0] == sheepRowMatrix[1] && sheepRowMatrix[1] == sheepRowMatrix[2] && sheepRowMatrix[2] == sheepRowMatrix[3] && sheepColMatrix[0] == sheepColMatrix[1] && sheepColMatrix[1] == sheepColMatrix[2] && sheepColMatrix[2] == sheepColMatrix[3])){
    	//ask the player to enter the position of the dog and show in the window
    	EasyReader keyboard = new EasyReader();
    	//create a matrix for dog to store the data of col and row of dog
    	int[] dogRowMatrix = new int[1];
    	int[] dogColMatrix = new int[1];  
    	System.out.print("Please enter new dog row (0 to quit)(less than 4): ");
    	int dogRow = keyboard.readInt();
    	dogRowMatrix[0] = dogRow;
    	//dogRow and dogCol should be more than 0 and less than 4
    	//0 or enter a number more than 3 for end the game
    	if(dogRow == 0){
    		System.out.print("The game is OVER");
    		display.clear();//clear the graphics window
    		display.gameOverRed();//show the string "GAME OVER" in red color
    		display.userQuit();//reason for game over
    		break;//end the game
    	}else if(dogRow >3){
    		System.out.print("The game is <4");
    		display.clear();
    		display.gameNotice();//show the string "Please entre a number less that 4" in red color
    		display.gameOverRed();//show the string "GAME OVER" in red color
    		break;//end the game
    	}else{
    		System.out.println();
    	    System.out.print("Please enter new dog column (0 to quit)(less than 4): ");
    	    int dogCol = keyboard.readInt();
    	    System.out.println('\n');
    	    dogColMatrix[0] = dogCol;
    	    if(dogCol == 0){
    	    	System.out.print("The game is OVER");
    	        System.out.println(" ");
    	        display.clear();
    	        display.gameOverRed();
    	        display.userQuit();
    	        break;
    	    }else if(dogCol >3){
    	    	System.out.print("The game is <4");
    		    display.clear();
    		    display.gameNotice();
    		    display.gameOverRed();
    		    break;
    	    }else{
    	    	display.clear();
    	    	display.setDogRow(dogRow);
    	    	display.setDogCol(dogCol);
    	    	display.displayDog(dogRow,dogCol);
    	    }
    	}
    	
    	//move all the sheep randomly
    	//show the dog in the graphics window
    	//refresh the position of the sheep in the graphics window
    	for(int j = 0; j<4; j++){
    		int sheepRow = sheepRowMatrix[j];
    		int sheepCol = sheepColMatrix[j];
    		int dogCol = dogColMatrix[0];
    		//Use class Sheep and sheepmove method
    		Sheep sheepMove = new Sheep(dogRow, dogCol, sheepRow, sheepCol);
    		sheepMove.setDogRow(dogRow);
    		sheepMove.setDogCol(dogCol);
    		sheepMove.setSheepRow(sheepRow);
    		sheepMove.setSheepCol(sheepCol);
    		
    		sheepMove.move(dogRow, dogCol, sheepRow, sheepCol);
    		
    		dogRow = sheepMove.getDogRow();
    		dogCol=sheepMove.getDogCol();
    		sheepRow=sheepMove.getSheepRow();
    		sheepCol=sheepMove.getSheepCol();
    		
    	    sheepRowMatrix[j] = sheepRow;
    	    sheepColMatrix[j] = sheepCol;
    	    
    	    display.displayGrid();
    		display.setSheepRow(sheepRowMatrix[j]);
        	display.setSheepCol(sheepColMatrix[j]);
        	display.setSheepNumber(j);
        	display.displaySheep(sheepRowMatrix[j],sheepColMatrix[j],j);
    	}
    	//when all sheep are in the same square
    	//stop for 2 senconds on the last grid
    	//Clear the graphics window
    	//Then it will show the string "GAME OVER" in red colour
    	//and the string "All sheep in one square!:)" in red color
    	if(sheepRowMatrix[0] == sheepRowMatrix[1] && sheepRowMatrix[1] == sheepRowMatrix[2] && sheepRowMatrix[2] == sheepRowMatrix[3] && sheepColMatrix[0] == sheepColMatrix[1] && sheepColMatrix[1] == sheepColMatrix[2] && sheepColMatrix[2] == sheepColMatrix[3]){
    		display.waitSeconds();
    		display.clear();
    	    display.gameOverRed();
    	    display.gameSuccess();
    	}
    	else{}

    	}
	}
}
