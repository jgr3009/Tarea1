import stanford.karel.*;


public class TableroAjedrez extends KarelMejorada{



	public void run(){

		while (frontIsClear()){
			move();
			putBeeper();
			if (frontIsBlocked()){
				turnLeft();
				move();
				turnLeft();
				move();
			}
			move();
			
		}
		
		
		
		
	}	
	}