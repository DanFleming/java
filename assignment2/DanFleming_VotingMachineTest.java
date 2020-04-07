import java.util.Random;

public class VotingMachineTest {

	public static void main(String[] args) {

		//Imported random function to use for test environment
		Random r = new Random();


		//Loop to run three times
		for(int i = 0; i <= 2; i++) {

			//Calling VotingMachine method
			VotingMachine elect = new VotingMachine();

			//Chose a number of imagined voters to test
			int voters = r.nextInt(501) ;

			//Loop to repeat the random votes
			for(int x = 0; x <= voters; x ++) {

				//If the random function selects '0,' the method voteA is called
				if(r.nextInt(2) == 0) {

					elect.voteA();		
				}

				//If the random function selects the other option (1), method voteB is called
				else {
					elect.voteB();
				}

			}

			System.out.println("Results of election: ");
			System.out.println("Party A: " + elect.getA());
			System.out.println("Party B: " + elect.getB());

			//getA and getB methods are called and compared to determine the results
			if(elect.getA() > elect.getB()) {
				System.out.println("Party A wins!");
			}

			else if(elect.getA() < elect.getB()) {
				System.out.println("Party B wins!");

			}

			else {
				System.out.println("It's a draw!");

			}

		}

	}

}
