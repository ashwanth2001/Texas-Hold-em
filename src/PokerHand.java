import java.util.ArrayList;

/**********************************
 * Texas Hold-em! Your task is to determine if the cards in the list makes up a
 * straight (five cards of sequential rank) or not. The cards will always have
 * values ranging from 2-14, where 14 is the ace.
 * 
 * Be aware that the ace (14) also should count as value 1!
 * 
 * The number of cards will vary, but will never be more than 7 (the board (5) +
 * player hand (2))
 * 
 * Examples:
 * 
 * straight: 9-10-11-12-13
 * 
 * straight: 14-2-3-4-5
 * 
 * straight: 2-7-8-5-10-9-11
 * 
 * not straight: 7-8-12-13-14
 *
 ***********************/
public final class PokerHand {
	public static boolean IsStraight(ArrayList<Integer> cards) {
		int[] cards2 = new int[14];
		for(int i = 0; i<cards.size(); i++) {
			cards2[cards.get(i)-2]++;
		}
		
		int num = 0;
		boolean b = false;
		boolean rerun = true;
		for(int i = 0; i<14; i++) {
			if(i>12&&rerun) {
				i=0;
				rerun = false;
				System.out.println("rerun");
			}
			if(cards2[i]>0) {
				System.out.println(i+2);
				num++;
			}
			else {
				num = 0;
			}
			if(num>=5) {
				b = true;
				break;
			}
		}
		return b;
	}
}