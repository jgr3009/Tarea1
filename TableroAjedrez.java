import stanford.karel.*;


public class TableroAjedrez extends KarelMejorada{

	public class CosechadoraKarel extends KarelMejorada{

		public void run(){

			//subir a Karel a la segunda fila

			//limpia todos los beepers de una fila

			//Cuando llegue al final de la fila sube a la de arriba
			

			while (frontIsClear()){
				move();}
				if (facingEast()||frontIsBlocked()){
					ponerBeeper();
					subeUnaFilaParaIzquierda();
					

				}
				if (facingWest()||frontIsBlocked()){
					ponerBeeper();
					subeUnaFilaParaDerecha();
					
				}
				
					}
			}
			
		
		private void ponerBeeper(){
			//Karel se mueve por toda la fila y recoge todos los beepers que haya
			while (frontIsClear()){
				move();
				pickBeeper();
				
			}
		}
		private void subeUnaFilaParaDerecha(){
			//Hace que Karel suba una fila hacia su derecha cuando llega a la pared
			
			turnRight();
			move();
			turnRight();
			/*if (rightIsBlocked()){
				turnLeft();
				while (frontIsClear()){
				move();
				
				}*/	
		}
			
		
		private void subeUnaFilaParaIzquierda(){
			//Hace que Karel suba una fila hacia su derecha cuando llega a la pared
			turnLeft();
			move();
			turnLeft();

		}
	
}}
