package model;

public class news {
    private int id;
    private String title;
    private String date;
    private String description;
    private String details;
    private String category;
    private String Image;

    public news(int id, String title, String date, String description, String details, String category, String image) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.description = description;
        this.details = details;
        this.category = category;
        Image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
}
