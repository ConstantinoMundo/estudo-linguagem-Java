package entities;

public class Video extends Lesson{

    private String url;
    private int seconds;

    public Video(){
        super();
    }

    public Video(String title, String url, int seconds) {
        super(title);
        this.url = url;
        this.seconds = seconds;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }


    @Override
    public int duration() {

        int sum = 0;
        return sum += seconds;
    }
}
