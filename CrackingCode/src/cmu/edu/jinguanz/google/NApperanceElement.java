package cmu.edu.jinguanz.google;

public class NApperanceElement {
	public void find(int[] a)
    {
            int first = Integer.MIN_VALUE; // the number with the top votes
            int firstVote = 0; // the top votes
            int second = Integer.MIN_VALUE; // the number with the second top votes
            int secondVote = 0; // the second top votes
            for(int i: a) {
                    if(firstVote > 0 && i == first) {
                            firstVote++;
                    } else if(secondVote > 0 && i == second) {
                            secondVote++;
                            if(secondVote > firstVote) {
                                    int t = first; //swap firstVote and secondVote
                                    first = second;
                                    second = t;
                                    t = firstVote;
                                    firstVote = secondVote;
                                    secondVote = t;
                            }
                    } else if(firstVote == 0) {
                            first = i;
                            firstVote++;
                    } else if(secondVote == 0) {
                            second = i;
                            secondVote++;
                    }  else {
                            firstVote--;
                            secondVote--;
                    }
            }
            // confirm if the number with top 2 votes occurs more than 3/n times
            int firstCount = 0;
            int secondCount = 0;
            //System.out.println(first + "," + second);
            for(int i: a) {
                    if(firstVote > 0 && i == first) firstCount++;
                    if(secondVote > 0 && i == second) secondCount++;
            }
            if(firstCount > a.length / 3) System.out.println(first);
            if(secondCount > a.length / 3) System.out.println(second);              
    }
	
	public static void main(String args[]){
		int[] a={1,1,2,2,1,2,1,2,9};
		new NApperanceElement().find(a);
	}

}
