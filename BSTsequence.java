import java.util.Arrays;

public class BSTsequence {
	public static int key = 363; //The integer you are attempting to find
	public static int minLimit = 1; //The minimum limit of the search tree
	public static int maxLimit = 1000; //The maximum limit of the search tree
	public static int[] sequence = new int[] {2, 252, 401, 398, 330, 344, 397, 363}; //Your sequence of numbers
  
    //Other test sequences (feel free to delete)
//	public static int[] sequence = new int[] {2, 399, 387, 219, 266, 382, 381, 278, 363};
//	public static int[] sequence = new int[] {925, 202, 911, 240, 912, 245, 363};
//	public static int[] sequence = new int[] {935, 278, 347, 621, 299, 392, 358, 363};
//	public static int[] sequence = new int[] {924, 220, 911, 244, 898, 258, 362, 363};
	
	public static void main(String[] args) {
		System.out.println("Sequence: "+Arrays.toString(sequence));
		canBeSequence(key, maxLimit, minLimit, sequence);
	}
	
	public static boolean canBeSequence(int key, int max, int min, int[] sequence) {
		//Iterate through the sequence of numbers
		for (int i = 0; i < sequence.length; i++) {
			System.out.println("Item #"+(i+1)+" "+sequence[i]+"\t| Limits ("+minLimit+":"+maxLimit+")");
			//If number in sequence is bigger than key
			if (sequence[i] > key) {
				//If number in sequence is bigger than max
				if (sequence[i] < maxLimit) {
					maxLimit = sequence[i];
				}
				else {
					System.out.println("Cannot be a sequence!");
					System.out.println("Next number ["+sequence[i]+"] is bigger than max limit "+maxLimit);
					return false;
				}
			}
			//If number in sequence is smaller than key
			else if (sequence[i] < key) {
				//If number in sequence is smaller than min.
				if (sequence[i] > minLimit) {
					minLimit = sequence[i];
				}
				else {
					System.out.println("Cannot be a sequence!");
					System.out.println("Next number ["+sequence[i]+"] is smaller than min limit "+minLimit);
					return false;
				}
			}
			//If number in sequence hits the key
			else if (sequence[i] == key) {
				System.out.println(key+" was found!");
				return true;
			}
		}
		System.out.println("The key ["+key+"] was not found in the sequence");
		return false;
	}
}
