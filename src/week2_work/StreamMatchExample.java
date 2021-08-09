package week2_work;

import java.util.ArrayList;
import java.util.List;

public class StreamMatchExample {
	
	public static void main(String[] args) {

		List<String> s=new ArrayList<>();
		s.add("imtiyaz");
		s.add("imtiyaz");
		s.add("kesa");
		s.add("vinay");
		s.add("kaushik");
		s.add("gdfjndfkj");
		s.add("nfdjdnfs");
		s.add("zyasjjs");
		s.add("abcde");
		s.add("imtiyaz");		// this is anymatch
		boolean matchedResult=s.stream().anyMatch((s1)->s1.startsWith("g"));
		System.out.println(matchedResult);

	}

}
