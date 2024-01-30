import org.w3c.dom.stylesheets.MediaList;

import com.encore.post.domain.PostRequestDTO;
import com.encore.post.service.PostService;
import com.encore.post.view.PostView;

public class PostMain {
	public static void main(String[] ages) {
		
		
//	      postService postService = new PostService();
//	        System.out.println("debug >>>> main caller -> service savePost working method");
//
//	        //case01
//	        //String result = postService.savePost("dongwook", "공지사항", "휴강입니다.", LocalDateTime.now(), 100, true);
//	        //System.out.println(result);
//
//	        //case02
//
//	        PostRequestDto request = new PostRequestDto("dongwook", "공지사항", "휴강입니다.", LocalDateTime.now(), 100, true);
//	        String msg = postService.savePost(request);
//	        System.out.println("Result >>>" + msg);
		
//		PostView view = new PostView();
//		view.menu();

	
			//case 03 
//			불필요하게 발생되는 객체생성을 호율적으로 관리하기 위해서 얕은복사 개념을 사용할 수 있다

	PostService 	service = new PostService();
	PostRequestDTO  params  = new PostRequestDTO() ;
	
	PostView view =	new PostView (service,params);
	view.menu();
	
	
	}
	}


