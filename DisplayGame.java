/**********
 A Java program to demonstrate
 DisplayGame class for game display in Sheepdog trials

 It shows the position of sheep and dogs in a 3*3 grid
 Showing grid, sheep, dog
 Showing different strings with different colours and sizes for different situation
 Wait before changing the screen

 Written by: Yuelin Hou
 Verision 2.0
 Date: 10 December 2020
**********/
import sheffield.*;
public class DisplayGame{
	
	//create a 300*300 graphics window
	private EasyGraphics graphicsWindow = new EasyGraphics(300,300);
	/**
	*display the game in a 300*300 graphics window
	*dR is row of dog which defined by player
	*dC is col of dog which defined by player
	*sR is row of sheep which is a random number
	*sC is col of sheep which is a random number
	*sN is the number of sheep
	*/
	public DisplayGame(int dR, int dC, int sR, int sC, int sN){
		dogRow = dR;
		dogCol = dC;
		sheepRow = sR;
		sheepCol = sC;
		sheepNumber = sN;
	}

	//draw a 3*3 grid with numbers on coordinate 
	public void displayGrid(){
		graphicsWindow.moveTo(20,20);
        graphicsWindow.setColor(0,0,0); // black
        //graphicsWindow.drawString("3",10,70,18);
       // graphicsWindow.drawString("2",10,150,18);
       // graphicsWindow.drawString("1",10,230,18);
        //graphicsWindow.drawString("1",70,280,18);
        //graphicsWindow.drawString("2",150,280,18);
        //graphicsWindow.drawString("3",230,280,18);
		for(int j = 0; j <3 ;j++){
			graphicsWindow.drawString(""+(3-j),10,70+80*j,18);
			graphicsWindow.drawString(""+(j+1),70+80*j,280,18);
			for(int i = 0; i <3 ;i++){
				graphicsWindow.drawRectangle(30+80*j,30+80*i,80,80);
			}
		}
     }
     
     /**
     *show the dog in the grid as D with a Tan filled circle
     *dR is Row of dog which defined by player
     *dC is Col of dog which defined by player
     */
	public void displayDog(int dR, int dC){
		if(dogRow == 1&& dogCol ==1){
			graphicsWindow.setColor(205,133,63);//Tan3
			graphicsWindow.fillEllipse(32,195,18,18);
			graphicsWindow.setColor(0,0,0);
			graphicsWindow.drawString("D",35,195,18);
		}else if(dogRow == 1&& dogCol == 2){
			graphicsWindow.setColor(205,133,63);
			graphicsWindow.fillEllipse(112,195,18,18);
			graphicsWindow.setColor(0,0,0);
			graphicsWindow.drawString("D",115,195,18);
		}else if(dogRow == 1&& dogCol == 3){
			graphicsWindow.setColor(205,133,63);
			graphicsWindow.fillEllipse(192,195,18,18);
			graphicsWindow.setColor(0,0,0);
			graphicsWindow.drawString("D",195,195,18);
		}else if(dogRow == 2&& dogCol == 1){
			graphicsWindow.setColor(205,133,63);
			graphicsWindow.fillEllipse(32,115,18,18);
			graphicsWindow.setColor(0,0,0);
			graphicsWindow.drawString("D",35,115,18);
		}else if(dogRow == 2&& dogCol == 2){
			graphicsWindow.setColor(205,133,63);
			graphicsWindow.fillEllipse(112,115,18,18);
			graphicsWindow.setColor(0,0,0);
			graphicsWindow.drawString("D",115,115,18);
		}else if(dogRow == 2&& dogCol == 3){
			graphicsWindow.setColor(205,133,63);
			graphicsWindow.fillEllipse(192,115,18,18);
			graphicsWindow.setColor(0,0,0);
			graphicsWindow.drawString("D",195,115,18);
		}else if(dogRow == 3&& dogCol == 1){
			graphicsWindow.setColor(205,133,63);
			graphicsWindow.fillEllipse(32,35,18,18);
			graphicsWindow.setColor(0,0,0);
			graphicsWindow.drawString("D",35,35,18);
		}else if(dogRow == 3&& dogCol == 2){
			graphicsWindow.setColor(205,133,63);
			graphicsWindow.fillEllipse(112,35,18,18);
			graphicsWindow.setColor(0,0,0);
			graphicsWindow.drawString("D",115,35,18);
		}else if(dogRow == 3&& dogCol == 3){
			graphicsWindow.setColor(205,133,63);
			graphicsWindow.fillEllipse(192,35,18,18);
			graphicsWindow.setColor(0,0,0);
			graphicsWindow.drawString("D",195,35,18);
		}else{
		}
	}
	
     /**
     *show sheep in the grid as S with a BlanchedAlmond filled circle
	 *sR is row of sheep which is a random number
	 *sC is col of sheep which is a random number
     *sN is the number of sheep
     */
	public void displaySheep(int sR, int sC, int sN){
		if(sheepRow == 1&& sheepCol ==1){
			graphicsWindow.setColor(255,235,230);//BlanchedAlmond
			graphicsWindow.fillEllipse(32+20*sheepNumber,235,18,18);
			graphicsWindow.setColor(0,0,0);
			graphicsWindow.drawString("S",35+20*sheepNumber,235,18);
		}else if(sheepRow == 1&& sheepCol ==2){
			graphicsWindow.setColor(255,235,230);
			graphicsWindow.fillEllipse(112+20*sheepNumber,235,18,18);
			graphicsWindow.setColor(0,0,0);
			graphicsWindow.drawString("S",115+20*sheepNumber,235,18);
		}else if(sheepRow == 1&& sheepCol ==3){
			graphicsWindow.setColor(255,235,230);
			graphicsWindow.fillEllipse(192+20*sheepNumber,235,18,18);
			graphicsWindow.setColor(0,0,0);
			graphicsWindow.drawString("S",195+20*sheepNumber,235,18);
		}else if(sheepRow == 2&& sheepCol ==1){
			graphicsWindow.setColor(255,235,230);
			graphicsWindow.fillEllipse(32+20*sheepNumber,155,18,18);
			graphicsWindow.setColor(0,0,0);
			graphicsWindow.drawString("S",35+20*sheepNumber,155,18);
		}else if(sheepRow == 2&& sheepCol ==2){
			graphicsWindow.setColor(255,235,230);
			graphicsWindow.fillEllipse(112+20*sheepNumber,155,18,18);
			graphicsWindow.setColor(0,0,0);
			graphicsWindow.drawString("S",115+20*sheepNumber,155,18);
		}else if(sheepRow == 2&& sheepCol ==3){
			graphicsWindow.setColor(255,235,230);
			graphicsWindow.fillEllipse(192+20*sheepNumber,155,18,18);
			graphicsWindow.setColor(0,0,0);
			graphicsWindow.drawString("S",195+20*sheepNumber,155,18);
		}else if(sheepRow == 3&& sheepCol ==1){
			graphicsWindow.setColor(255,235,230);
			graphicsWindow.fillEllipse(32+20*sheepNumber,75,18,18);
			graphicsWindow.setColor(0,0,0);
			graphicsWindow.drawString("S",35+20*sheepNumber,75,18);
		}else if(sheepRow == 3&& sheepCol ==2){
			graphicsWindow.setColor(255,235,230);
			graphicsWindow.fillEllipse(112+20*sheepNumber,75,18,18);
			graphicsWindow.setColor(0,0,0);
			graphicsWindow.drawString("S",115+20*sheepNumber,75,18);
		}else if(sheepRow == 3&& sheepCol ==3){
			graphicsWindow.setColor(255,235,230);
			graphicsWindow.fillEllipse(192+20*sheepNumber,75,18,18);
			graphicsWindow.setColor(0,0,0);
			graphicsWindow.drawString("S",195+20*sheepNumber,75,18);
		}else{
		}
	}
	
     /**
     *clear the window
     */	
	public void clear() {
		graphicsWindow.clear();
	}
	
     /**
     *show the string "GAME OVER" in red color
     * when player type in 0 or a number larger than three or all sheep in the same square
     */	
	public void gameOverRed(){
		graphicsWindow.setColor(229,91,91);//red
		graphicsWindow.drawString("GAME OVER",45,130,36);
	}
     /**
     *show the string "User quit" in green color
     *when player type in zero
     */		
	public void userQuit(){
		graphicsWindow.setColor(0,201,87);//green
		graphicsWindow.drawString("User quit",60,100,18);
	}
	
     /**
     *show the string "Please entre a number less that 4" in green color
     *when player type in a number larger than three
     */	
	public void gameNotice(){
		graphicsWindow.setColor(0,201,87);
		graphicsWindow.drawString("Please entre a number less than 4",10,100,18);
	}
	
     /**
     *show the string "All sheep in one square!:)" in green color
     *when sheep are in the same square
     */	
	public void gameSuccess(){
		graphicsWindow.setColor(0,201,87);
		graphicsWindow.drawString("All sheep in one square!:)",60,100,18);		
	}
	
     /**
     *delay for 2 seconds
     */		
	public void waitSeconds(){
		graphicsWindow.waitSeconds(2);
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
	public int getSheepNumber(){
		return sheepNumber;
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
	public void setSheepNumber(int sN){
		sheepNumber = sN;
	}
	private int dogRow;
	private int dogCol;
	private int sheepRow;
	private int sheepCol;
	private int sheepNumber;

	
	
}