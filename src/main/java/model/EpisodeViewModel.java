package model;

public class EpisodeViewModel {
    private Integer id;
    private String title;
    private String description;
    private Integer duration;
    private Integer views;
    private Integer likes;
    private String banner;
    private String link;
    private Integer podcast_id;

    public EpisodeViewModel(Episode episode) {
        this.id = episode.getId();
        this.title = episode.getTitle();
        this.description = episode.getDescription();
        this.duration = episode.getDuration();
        this.views = episode.getViews();
        this.likes = episode.getLikes();
        this.banner = episode.getBanner();
        this.link = episode.getLink();
    }


    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public Integer getPodcastId() {
        return podcast_id;
    }

    public void setPodcastId(Integer podcast_id) {
        this.podcast_id = podcast_id;
    }
}
