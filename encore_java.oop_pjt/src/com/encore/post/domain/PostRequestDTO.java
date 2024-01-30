package com.encore.post.domain;

import java.time.LocalDateTime;

public class PostRequestDTO {
	private String id;
    private String title;
    private String content;
    private LocalDateTime registerDate;
    private int views;
    private boolean isFlag;

    public PostRequestDTO(String id) {
    	this.id =id;
    }

    public PostRequestDTO(String id, String title, String content, LocalDateTime registerDate, int views, boolean isFlag) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.registerDate = registerDate;
        this.views = views;
        this.isFlag = isFlag;
    }

    public PostRequestDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDateTime registerDate) {
        this.registerDate = registerDate;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public boolean isPublic() {
        return isFlag;
    }

    public void setPublic(boolean isFlag) {
        this.isFlag = isFlag;
    }
}

