package org.wecancodeit.reviews;

public class Review {

    private Long id;
    private String title;
    private String date;
    private String description;
    private String imageUrl;
    private String category;
    private String content;

    public Long getId() {
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getDate(){
        return date;
    }
    public String getDescription(){
        return description;
    }
    public String getImageUrl(){
        return imageUrl;
    }
    public String getCategory(){
        return category;
    }
    public String getContent(){
        return content;
    }

    public Review(long id, String title, String date,
                  String description, String imageUrl, String category, String content) {

        this.id = id;
        this.title = title;
        this.date = date;
        this.description = description;
        this.imageUrl = imageUrl;
        this.category = category;
        this.content = content;

    }

}
