import stanford.karel.*;

public class MudanzasKarel extends KarelMejorada{



	public void run(){

		while (frontIsClear()){
			
			while (beepersPresent()){
				pickBeeper();
			}
			move();
		}
		

	}
}