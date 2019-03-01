import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenNumber {
	
	public String even(String sentence) {
		String[] data = sentence.split(" ");
		String result = "";
		
		Stream<String> st = Arrays.stream(data);
		List<String> res = st.map(y ->{
			if (y.length()%2 == 0) {
				if(result.length() < y.length()) {
					return y;
				}
			}
//			if(result.equalsIgnoreCase("")) {
//				result = "00";
//			}
			return y;
		}).collect(Collectors.toList());
		
		return res.get(0);
		
	}
}

//use map, foreach

