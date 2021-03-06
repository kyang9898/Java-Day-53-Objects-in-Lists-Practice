public class TvShow {

    private String nameOfShow;
    private int numberOfEpisodes;
    private String genreOfShow;

    public TvShow(String nameOfShow, int numberOfEpisodes, String genreOfShow) {
        this.nameOfShow = nameOfShow;
        this.numberOfEpisodes = numberOfEpisodes;
        this.genreOfShow = genreOfShow;
    }

    public String getNameOfShow() {
        return nameOfShow;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public String getGenreOfShow() {
        return genreOfShow;
    }

    @Override
    public String toString() {
        return "The name of the show is " + getNameOfShow() + " with " + getNumberOfEpisodes() + " number of episodes. The genre is " + getGenreOfShow() + ".";
    }
}