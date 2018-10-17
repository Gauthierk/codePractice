import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//Creator: Kearstin Gauthier 
//Date: October 15th, 2018

//Problem: Find how many passphrases have no duplicates in a given set.

public class AdventOfCode_day4_2017 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inputFile = new Scanner(new File("C:\\Users\\kearstin\\eclipse-workspace\\AdventOfCode_day4_2017\\passphrases.txt"));
		int validCount = 0;
		while(inputFile.hasNext()) {
			validCount += duplicateChecker(inputFile.nextLine());
		}
		inputFile.close();
		System.out.println("The final count of valid passphrases is: " + validCount);
	}
	
	public static int duplicateChecker(String inputLine) {
		Set<String> lineSet = new HashSet<String>();
		String[] var = inputLine.trim().split("\\s+"); //there is probably a more eloquent way of seperating, but this what I used on the day 2 challenge -- so I reused the logic
		//Sets do not allow for duplicates, therefore if the .add() method fails, then the entry was duplicated add should not go to the final count
		for(String i : var) {
			if(lineSet.add(i) == false) {
				return 0;
			}
		}
		return 1;
	}

}
