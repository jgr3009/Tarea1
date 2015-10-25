import com.sun.prism.impl.BaseMesh.FaceMembers;

import stanford.karel.*;


public class TableroAjedrez extends KarelMejorada{



	public void run(){

		while (frontIsClear()){
			move();
			putBeeper();
			if (frontIsBlocked()&&facingEast()){
				turnLeft();
				move();
				turnLeft();
				move();
				putBeeper();
			}
			if (frontIsBlocked()&&facingWest()){
				turnRight();
				if (frontIsBlocked()&&facingNorth()){
					daLaVuelta();
					while (frontIsClear()&&facingSouth()){
						move();
					}
				}
				
				move();
				turnRight();
				move();
				putBeeper();
			}
			move();
		}
	}
	
}