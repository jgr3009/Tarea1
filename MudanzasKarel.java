import stanford.karel.*;

public class MudanzasKarel extends KarelMejorada{



	public void run(){

		while (frontIsClear()){
			move();
			while (beepersPresent()){
				pickBeeper();
			}

		}
		turnLeft();
		if (frontIsClear()){
			move();
			if (rightIsClear()){
				turnRight();

			}
			if (frontIsBlocked()){
				turnLeft();

			}
			
			
			
		}
		for (int i=	0;i	<6;i++)	{
			putBeeper();
			
		}	


	}

}