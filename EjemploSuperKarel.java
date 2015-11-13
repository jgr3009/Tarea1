
import stanford.karel.*;

public class EjemploSuperKarel extends SuperKarel{

	public void run(){
		while (true){
		while (frontIsClear()){
			if (random()){
				paintCorner(BLUE);
			}
			else {
				paintCorner(GREEN);
			}
			move();
		}
		turnLeft();
	}
}
}