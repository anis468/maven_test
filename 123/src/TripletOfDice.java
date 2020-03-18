
public class TripletOfDice {
  int nb_face;
  
  TripletOfDice(int a) this.nb_face=a;
  
 void rollAllDice(){}
  
 void rollOneDie(int dieNumber){
	  if(dieNumber>3) {
		  IllegalArgumentException exc = new IllegalArgumentException("valeur inferieur à 3 obligatoire");
		  throw exc;
	  }
  }
 /** 
  *@return will 1 to 6
  * 
  * 
  * */
 int getFirstDie() {
	 
 }
 
 /** 
  * 
  * 
  * 
  * */
 int getSecondDie() {
	 
 }
 
 /** 
  * 
  * 
  * 
  * */
int getThirdDie() {
	 
 }
  
}
