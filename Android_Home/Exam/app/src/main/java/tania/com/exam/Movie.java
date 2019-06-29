package tania.com.exam;

public class Movie {
    private String movieName;
    private String directorName;

    public Movie(String movieName, String directorName) {
        this.movieName = movieName;
        this.directorName = directorName;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getDirectorName() {
        return directorName;
    }
}
