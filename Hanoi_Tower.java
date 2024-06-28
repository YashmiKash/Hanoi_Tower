package hanoi;

public class Hanoi_Tower {
	    public static void main(String[] args) {
	        int numDisks = 3; // number of disks
	        char fromPeg = 'A'; // from peg
	        char toPeg = 'C'; // to peg
	        char auxPeg = 'B'; // auxiliary peg

	        solveHanoi(numDisks, fromPeg, toPeg, auxPeg);
	    }

	    public static void solveHanoi(int numDisks, char fromPeg, char toPeg, char auxPeg) {
	        if (numDisks == 1) {
	            System.out.println("Move disk 1 from " + fromPeg + " to " + toPeg);
	            return;
	        }

	        // Move n - 1 disks from fromPeg to auxPeg, using toPeg as auxiliary
	        solveHanoi(numDisks - 1, fromPeg, auxPeg, toPeg);

	        // Move the nth disk from fromPeg to toPeg
	        System.out.println("Move disk " + numDisks + " from " + fromPeg + " to " + toPeg);

	        // Move the n - 1 disks that we left on auxPeg to toPeg
	        solveHanoi(numDisks - 1, auxPeg, toPeg, fromPeg);
	    }
	}


