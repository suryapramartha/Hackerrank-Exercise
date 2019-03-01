import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		//		String sentence ="t i f f f ww";
//		EvenNumber ev = new EvenNumber();
//		System.out.println(ev.even(sentence));
		
		String query="https://jsonmock.hackerrank.com/api/movies/search/?Title=movie";
		
		MovieTitles mv = new MovieTitles();
		mv.getMovieTitles(query);
	}

}
