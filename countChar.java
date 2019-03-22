import java.util.Scanner;
public class countChar
{
	public static void main(String args[] ){
        Scanner myscanner = new Scanner(System.in);
        String sentence = myscanner.nextLine();
        ArrayList<Character> seen = new ArrayList<Character>();
        System.out.println(countunique(sentence,seen));
    }

    public static int countunique(String sentence, ArrayList<Character> seen){
        if (sentence.length() == 0) {
            return 0;
            }
            int quantity = 0;
        if(sentence.length()>0)
        {
            char c=sentence.charAt(0);
            if (!seen.contains(c)) { // note the '!'
                seen.add(c);
                quantity++;
            }

        }

        return quantity + countunique(sentence.substring(1), seen);



  //fill in the recursive method

    }
}