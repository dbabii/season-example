import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class SeasonExample {
	public enum Season {
		WINTER, SPRING, SUMMER, AUTUMN
	}

	public static void main(String[] args) throws IOException {
		Season season = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please choose of the month");
		String month = br.readLine();

		switch (month.toLowerCase()) {
			case "december":
			case "january":
			case "february":
				season = Season.WINTER;
				break;
			case "march":
			case "april":
			case "may":
				season = Season.SPRING;
				break;
			case "june":
			case "jule":
			case "august":
				season = Season.SUMMER;
				break;
			case "september":
			case "october":
			case "november":
				season = Season.AUTUMN;
				break;
			default:
				System.out.println("This is not a month");
		}
		if (season != null) {
			System.out.println(season);
		}
	}

}

