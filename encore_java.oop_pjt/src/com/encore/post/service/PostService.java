package com.encore.post.service;

import java.time.LocalDateTime;

import com.encore.post.domain.PostRequestDTO;

public class PostService  {


    public String savePost(String id, String title, String content, LocalDateTime registerDate, int view, boolean isPublic) {
        System.out.println("debug >>>> working method completed..");
        return "작성하신 글이 저장되었습니다.";
    }


    public String sarvePost(PostRequestDTO request) {
        System.out.println("debug >>>> working method completed..");
        return "작성하신 글이 저장되었습니다.";
    }
    
    
    public String sarveDelete(PostRequestDTO params) {
    	System.out.println("debug >>> delete");
    	return " 작성하신 글이 삭제되었습니다.";
    }
}

