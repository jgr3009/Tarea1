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
			turnRight();
			if (frontIsBlocked()&&facingNorth()){
				daLaVuelta();}
			move();
			while (frontIsClear()&&facingSouth()){
				move();
			}
			
			
			
		}
	}
	}