
import stanford.karel.*;

public class Fibonacci extends KarelMejorada{
	
	public void run(){
		   
		while (frontIsClear()){
			 move();
			 if (beepersPresent()){
				 pickBeeper();
				 turnLeft();
				 move();
				 putBeeper();
				 daLaVuelta();
				 move();
				 turnLeft();
				 move();
				 if (beepersPresent()){
					 move();
					 putBeeper();
					 daLaVuelta();
					 move();
					 move();
					 if (noBeepersPresent()){
						 turnRight();
						 move();
						 pickBeeper();
						 daLaVuelta();
						 move();
						 putBeeper();
						 turnLeft();
					 }
				 }
			 }
		 }
	
	}
}
