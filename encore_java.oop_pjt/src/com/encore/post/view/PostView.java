package com.encore.post.view;

import java.util.Scanner;
import com.encore.post.domain.PostRequestDTO;
import com.encore.post.service.PostService;

public class PostView {
	
	private PostService 	service;
	private PostRequestDTO 	params;
	public PostView() {
		
	}
	public PostView(PostService service , PostRequestDTO params) {
	this.service 	= service;
	this.params		= params ;
	}
	
	public void menu() {
		Scanner scan = new Scanner(System.in);
		while (true) {
		System.out.println(">>>>>>>>Hanha softare camp Beyond 5th");
		System.out.println("1 login");
		System.out.println("2 join");
		System.out.println("3 post write");
		System.out.println("4. post delete ");
		System.out.println("99 exit");
		System.out.print("input number : ");
		int number = scan.nextInt();
		if (number ==99) {
			System.exit(0);
			
		}if(number ==3) {
			requestSave();
		}if(number == 4) {
			requestDelete();
		}
	 }
	
	}
	
	public void requestSave() {
		System.out.println("debug>>> client post view");
		Scanner scan= new Scanner(System.in);
		System.out.println("아이디 : ");
		String id = scan.nextLine();
		System.out.println("제목 : ");
		String title = scan.nextLine();
		System.out.println("내용 : ");
		String content = scan.nextLine();
		System.out.println("조회수");
		int cnt = scan.nextInt();
		System.out.println("공개여부");
		boolean isflag = scan.nextBoolean();
		
		
		//PostService  service =new PostService();
		
		
	//PostRequestDTO request = new PostRequestDTO(id,title,content,null, cnt,isflag);
		params.setId(id); params.setContent(content);params.setPublic(isflag);params.setRegisterDate(null);
		params.setTitle(title);params.setViews(cnt);
		PostRequestDTO request = null;
		String msg = service.sarvePost(request);
		System.out.println("Result>>>" + msg);
		
		
	}
//	terminal 사용자의 아이디만 입력 받아서
//	해당아이디를 DTO에 넣고 
//	PostService class Postdelete(postRequesDTO params)
//	method 호출하여 "작성하신글이 삭제 되었습니다," 메세지를 반환 받아서 출력

	public void requestDelete() {
    	System.out.println("debug >>> delete");
		Scanner scan =new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = scan.nextLine();
	
		
//		PostRequestDTO request= new PostRequestDTO(id);
//		PostService  service =new PostService();
		params.setId(id);
		String msg = service.sarveDelete(params);
		System.out.println("Result>>>" + msg);
		
	}
	
	}
