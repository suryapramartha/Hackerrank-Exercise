import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class Main 
{
	public static void main(String[] args) throws IOException, JSONException 
	{
		String movie = "movie"; //Replace this string to change data result from API
		
		MovieTitles mv = new MovieTitles();
		JSONObject obj = new JSONObject(mv.getMovieTitles(movie));
        JSONArray arr = obj.getJSONArray("data");
        String[] result = new String[arr.length()];
        
        System.out.println("====================Data Before Sorting=================");
        for (int i = 0; i < arr.length(); i++) 
        {
            String title = arr.getJSONObject(i).getString("Title");
            result[i] = title;
            
            System.out.println( result[i] );
        }
       
        Arrays.sort(result); //ascending
        //Arrays.sort(result, Collections.reverseOrder()); //descending
        
        System.out.println("====================Data After Sorting=================");
        for (int i = 0 ; i< result.length; i++) 
        {
        	System.out.println( result[i] );
        }
	}
}
