import stanford.karel.*;


public class EspiralKarel extends KarelMejorada{
	
	public void run(){
		while (frontIsClear()){
			
			move();
			putBeeper();
			if (frontIsBlocked() && beepersPresent()){
				
				turnLeft();
				
					if (noBeepersPresent()){
						
					turnRight();
					
					
				}
			}
		}

}
}