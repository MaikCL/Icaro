package cl.mzapatae.icaro.ModelData;

/*
 * Created by mzapata on 30-04-2015.
 */
public class NewsObject {
    public String title;
    public String description;
    public String link;
    public String date;

    public NewsObject(String title, String description, String link, String date) {
        this.title = title;
        this.description = description;
        this.link = link;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
