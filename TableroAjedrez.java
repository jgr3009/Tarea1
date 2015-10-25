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
			move();
			turnRight();
			if (frontIsBlocked()&&facingNorth()){
				daLaVuelta();}
			move();
			while (frontIsClear()&&facingSouth()){
				move();
			}
			
		}
			}/*
			if (frontIsBlocked()&&facingWest()){
				turnRight();
				if (frontIsBlocked()&&facingNorth()){
					daLaVuelta();}
				move();
				while (frontIsClear()&&facingSouth()){
					move();
				}
				turnRight();
					}
				move();
				turnRight();
				move();
				putBeeper();
					
				}
			move();
			*/
			
			
			
	
		private void retornaAlInicio(){
			if (frontIsBlocked()){
				daLaVuelta();
				while (frontIsClear()){
					move();
					if (frontIsBlocked()){
						turnLeft();
					}
				}
			}
		}
}