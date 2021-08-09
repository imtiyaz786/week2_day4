package week2_work;

import java.util.ArrayList;
import java.util.List;

public class StreamDistinctExample {
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
		s.add("imtiyaz");
		// distict will remove duplicates
		s.stream().distinct().forEach(e->System.out.println(e));
		
	
	
		

	}

}
