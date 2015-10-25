import stanford.karel.*;

public class MudanzasKarel extends KarelMejorada{



	public void run(){

		while (frontIsClear()){
			move();
			if (beepersPresent()){
				pickBeeper();
			}
		}
		

	}
}