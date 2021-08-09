package week2_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamToMapConversion {

	public static void main(String[] args) {

		List<Student> s = new ArrayList<>();
		s.add(new Student(1, "Imtiyaz"));
		s.add(new Student(2, "Kaushik"));
		s.add(new Student(3, "Kesa"));
		s.add(new Student(4, "Vinay"));
		s.add(new Student(5, "Chandra"));
		s.add(new Student(6, "Zia"));
		
		
		// this is the case we can convert an list to map using groupingBy
		Map<Integer, List<String>> multimap=
				s.stream()
				.collect(Collectors.groupingBy(Student::getId,
						Collectors.mapping(Student::getName,
						Collectors.toList())));
		
		System.out.println("multimap " + multimap);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}