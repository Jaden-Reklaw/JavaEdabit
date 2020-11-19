//My Solution
import java.util.*;

public class Program {
	 public static int[] arrayOfMultiples(int num, int length) {
		int[] answer = new int[length];

    for(int i=0; i<answer.length; i++) {
        answer[i] = (i+1) * num;
    }

    return answer;
	}
}

//OtherSolution
import java.util.stream.IntStream;
public class Program {
	public static int[] arrayOfMultiples(int num, int length) {
        //Instream.rangeClosed creates a stream or something like a list
        //map allows you to iterate over that stream and change items inside
        //toArray changes the stream into an array
		return IntStream.rangeClosed(1, length)
			.map(i -> num * i)
			.toArray();
	}
}