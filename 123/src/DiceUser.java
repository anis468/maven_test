
public class DiceUser {
	static TripletOfDice rollOnce() {
		TripletOfDice tod= new TripletOfDice(6);
		tod.rollAllDice(1);
		return tod;
	} 

	public static void main(String argv[]) {
		TripletOfDice t= rollOnce();
		System.out.println("le de numero 1 est un "+t.getFirst());
		System.out.println("le de numero 2 est un "+t.getSecond());
		System.out.println("le de numero 3 est un "+t.getThird());
	
		
	}
}
