import java.util.ArrayList;
import java.util.Scanner;

public class TvShowMain {

    public static void main(String[] args) throws Exception {
        ArrayList<TvShow> list = new ArrayList<TvShow>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entering nothing for the name will stop the loop.");
        while (true) {
            System.out.println("Enter the name of the TV Show:");
            String nameOfShow = scanner.nextLine();
            if (nameOfShow.isEmpty()) {
                break;
            }
            System.out.println("How many episodes?");
            int numberOfEpisodes = Integer.valueOf(scanner.nextLine());
            System.out.println("What is the genre?");
            String genreOfShow = scanner.nextLine();
            list.add(new TvShow(nameOfShow, numberOfEpisodes, genreOfShow));
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}