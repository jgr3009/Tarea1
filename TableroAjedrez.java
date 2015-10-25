import stanford.karel.*;


public class TableroAjedrez extends KarelMejorada{



	public void run(){

		while (frontIsClear()){
			move();
			putBeeper();
			move();
			if (frontIsBlocked()){
				turnLeft();
				move();
				turnLeft();
			}
		}
		
		
		
		
	}	
	}