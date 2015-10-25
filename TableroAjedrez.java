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
				if (frontIsBlocked()){
					daLaVuelta();
					/*while (frontIsClear()){
						move();
						//if (frontIsBlocked()){
							//turnLeft();
						//}
					*/}
				move();
				if (facingSouth()||frontIsBlocked()){
					move();
				}
				turnRight();
				move();
				putBeeper();
					
				}
			move();
			
			
			}
		if (facingSouth()&&frontIsBlocked()){
			turnLeft();
		}
		}	
	
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