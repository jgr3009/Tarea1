import stanford.karel.*;

public class SaltaAgujas extends KarelMejorada{

	public void run(){
		while (frontIsBlocked()){
			turnLeft();
			while (frontIsClear()){
				move();
				if (rightIsClear()){
					turnRight();
					move();
					turnRight();
				}
			}
			if (frontIsBlocked()&&facingNorth()){
				daLaVuelta();
			}
		}
		while (frontIsClear()){
			move();
			if (frontIsBlocked()&&facingNorth()){
				turnLeft();
			}
		}
		turnLeft();
	}
}

