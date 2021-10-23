/**********
 A Java program to demonstrate
 Sheep class for how sheep move in Sheepdog trials

 There are three random situations:
 1.moves away from the dog
 2.moves beside the dog
 3.move to the same square as the dog

 Written by: Yuelin Hou
 Verision 2.0
 Date: 10 December 2020
**********/
import sheffield.*;
import java.util.Random;
public class Sheep{
	/**
	*dR is row of dog which defined by player
	*dC is col of dog which defined by player
	*sR is row of sheep which is a random number
	*sC is col of sheep which is a random number
	*/
	public Sheep(int dR, int dC, int sR, int sC){
		dogRow = dR;
		dogCol = dC;
		sheepRow = sR;
		sheepCol = sC;
	}
	
	/**
	*sheep move
	*/
	public void move(int dR, int dC, int sR, int sC){
		Random random = new Random();
		int commandNum = random.nextInt(6)+1;//decide how to move the sheep
		int randomNear2 = random.nextInt(2);//there is two squares beside the dog
		int randomNear3 = random.nextInt(3);//there is three squares beside the dog
		int randomNear4 = random.nextInt(4);//there is four squares beside the dog
		int randomOperator = random.nextInt(2);//decide the sheep move up or down, move left or right
		
		//moves away from the dog
		if(commandNum >= 1 && commandNum <= 3){
			if(dogCol == 3 && (dogCol - sheepCol == 1|| dogCol == sheepCol)){
				sheepCol = sheepCol - 1;
				sheepRow = sheepRow;
			}else if(dogCol == 2 && dogCol == sheepCol && randomOperator == 0){
				sheepCol = sheepCol - 1;
				sheepRow = sheepRow;
			}else if(dogCol == 2 && dogCol == sheepCol && randomOperator == 1){
				sheepCol = sheepCol + 1;
				sheepRow = sheepRow;
			}else if(dogCol == 1 && (sheepCol - dogCol == 1|| dogCol == sheepCol)){
				sheepCol = sheepCol + 1;
				sheepRow = sheepRow;
			}else if(dogRow == 3 && (dogRow - sheepRow == 1 || dogRow == sheepRow)){
				sheepRow = sheepRow -1;
				sheepCol = sheepCol;
			}else if(dogRow == 2 && dogRow == sheepRow && randomOperator == 0){
				sheepRow = sheepRow - 1;
				sheepCol = sheepCol;
			}else if(dogRow == 2 && dogRow == sheepRow && randomOperator == 1){
				sheepRow = sheepRow + 1;
				sheepCol = sheepCol;
			}else if(dogRow == 1 && (sheepRow - dogRow ==1 || dogRow == sheepRow )){
				sheepRow = sheepRow + 1;
				sheepCol = sheepCol;
			}else{
			}//moves beside the dog
			}else if(commandNum >3 && commandNum <=5){
				if(dogCol == 3 && dogRow == 1 && randomNear2 == 0 ){
					sheepCol = 3;
					sheepRow = 2;
				}else if(dogCol == 3 && dogRow == 1 && randomNear2 == 1){
					sheepCol = 2;
					sheepRow = 1;
				}else if(dogCol == 2 && dogRow == 1 && randomNear3 == 0){
					sheepCol = 1;
					sheepRow = 1;
				}else if(dogCol == 2 && dogRow == 1 && randomNear3 == 1){
					sheepCol = 2;
					sheepRow = 2;
				}else if(dogCol == 2 && dogRow == 1 && randomNear3 == 2){
					sheepCol = 3;
					sheepRow = 1;
				}else if(dogCol == 1 && dogRow == 1 && randomNear2 == 0){
					sheepCol = 2;
					sheepRow = 1;
				}else if(dogCol == 1 && dogRow == 1 && randomNear2 == 1){
					sheepCol = 1;
					sheepRow = 2;
				}else if(dogCol == 3 && dogRow == 2 && randomNear3 == 0){
					sheepCol = 3;
					sheepRow = 1;
				}else if(dogCol == 3 && dogRow == 2 && randomNear3 == 1){
					sheepCol = 2;
					sheepRow = 2;
				}else if(dogCol == 3 && dogRow == 2 && randomNear3 == 2){
					sheepCol = 3;
					sheepRow = 3;
				}
				else if(dogCol == 2 && dogRow == 2 && randomNear4 == 0){
					sheepCol = 2;
					sheepRow = 1;
				}else if(dogCol == 2 && dogRow == 2 && randomNear4 == 1){
					sheepCol = 2;
					sheepRow = 3;
				}else if(dogCol == 2 && dogRow == 2 && randomNear4 == 2){
					sheepCol = 1;
					sheepRow = 2;
				}else if(dogCol == 2 && dogRow == 2 && randomNear4 == 3){
					sheepCol = 3;
					sheepRow = 2;
				}else if(dogCol == 1 && dogRow == 2 && randomNear3 == 0){
					sheepCol = 1;
					sheepRow = 1;
				}else if(dogCol == 1 && dogRow == 2 && randomNear3 == 1){
					sheepCol = 2;
					sheepRow = 2;
				}else if(dogCol == 1 && dogRow == 2 && randomNear3 == 2){
					sheepCol = 1;
					sheepRow = 3;
				}else if(dogCol == 3 && dogRow == 3 && randomNear2 == 0){
					sheepCol = 2;
					sheepRow = 3;
				}else if(dogCol == 3 && dogRow == 3 && randomNear2 == 1){
					sheepCol = 3;
					sheepRow = 2;
				}else if(dogCol == 2 && dogRow == 3 && randomNear3 == 0){
					sheepCol = 1;
					sheepRow = 3;
				}else if(dogCol == 2 && dogRow == 3 && randomNear3 == 1){
					sheepCol = 2;
					sheepRow = 2;
				}else if(dogCol == 2 && dogRow == 3 && randomNear3 == 2){
					sheepCol = 3;
					sheepRow = 3;
				}else if(dogCol == 1 && dogRow == 3 && randomNear2 == 0){
					sheepCol = 1;
					sheepRow = 2;
				}else if(dogCol == 1 && dogRow == 3 && randomNear2 == 1){
					sheepCol = 2;
					sheepRow = 3;
				}else{
				}//move to the same square as the dog
			}else if(commandNum == 6){
				sheepCol = dogCol;
				sheepRow = dogRow;
			}else{
			}
	}
	
	public int getDogRow(){
		return dogRow;
	}
	
	public int getDogCol(){
		return dogCol;
	}
	
	public int getSheepRow(){
		return sheepRow;
	}
	
	public int getSheepCol(){
		return sheepCol;
	}
	
	public void setDogRow(int dR){
		dogRow = dR;
	}
	
	public void setDogCol(int dC){
		dogCol = dC;
	}
	
	public void setSheepRow(int sR){
		sheepRow = sR;
	}
	public void setSheepCol(int sC){
		sheepCol = sC;
	}

	private int dogRow;
	private int dogCol;
	private int sheepRow;
	private int sheepCol;
	
}