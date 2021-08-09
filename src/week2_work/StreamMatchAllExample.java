package week2_work;

import java.util.ArrayList;
import java.util.List;

public class StreamMatchAllExample {
	
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
		s.add("imtiyaz");		// allMatch will return true only and only if all the elments associated with the predicate is true and strict
	boolean Matched1=s.stream().allMatch((s2)->s2.endsWith("z"));
	System.out.println(Matched1);

	}


}
