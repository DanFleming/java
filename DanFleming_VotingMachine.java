
public class VotingMachine {

	int a;
	int b;

	//method to clear machine state
	public VotingMachine() {
		a = 0;
		b = 0;
	}

	//method to vote party A
	public void voteA(){

		a++;

	}

	//method to vote party B
	public void voteB(){

		b++;

	}

	//get number of votes party A
	public int getA() {
		return a;
	}

	//get number of votes party B
	public int getB() {
		return b;
	}
}
