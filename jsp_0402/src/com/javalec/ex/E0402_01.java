package com.javalec.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/E01")
public class E0402_01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	//선처리
	@PostConstruct
	public void postConstruct() {
		System.out.println("-postConstruct() - init() 메소드보다 먼저 실행 ");
	}
	
	//후처리
	@PreDestroy 
	public void preDestroy() {
		System.out.println("-preDestroy() - destroy() 메소드보다  후 제일 마지막으로 실행");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Servlet 생성시 최초 한번 init() 메소드가 실행");
		System.out.println("최초 실행시 처리해야 할 구문이 있다면 여기에 입력");
	}

	@Override
	public void destroy() {
		System.out.println("Servlet 종료시 최초 한번 destroy()메소드 실행");
		System.out.println("종료시 Servlet에서 처리해야 할 구문이 있다면 여기게 입력");
	
	}
	
	//주소로 바로 접근하게 되면 doGet()실행, method="get" doGet()실행
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet() 실행");
		actionDo(request,response);
	}

	//method="post" doPost() 실행
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost() 실행");
		request.setCharacterEncoding("utf-8");
		actionDo(request,response);
		
	}
	
	protected void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("actionDo() 메소드 실행");
		
		response.setContentType("text/html; charset=utf-8 ");

		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String[] hobby = request.getParameterValues("hobby");
		String major = request.getParameter("major");
		String address = request.getParameter("address");
		
		for (int i = 0; i < hobby.length; i++) {
			if(hobby[i].equals("read")) {
				hobby[i] = "독서";
			}else if(hobby[i].equals("cook")) {
				hobby[i] = "요리";
			}else if(hobby[i].equals("run")) {
				hobby[i] = "조깅";
			}else {
				hobby[i] = "수영";
			}
		}
		
		
		if(major.equals("kor")) {
			major = "국문학과";
		}else if(major.equals("eng")) {
			major = "영어영문학과";
		}else if(major.equals("math")) {
			major = "수학과";
		}else {
			major = "디자인학과";
		}
		
		if(address.equals("seoul")) {
			address = "서울";
		}else if(address.equals("gyeonggi")) {
			address = "경기";
		}else{
			address = "부산";
		}
		
		PrintWriter printW = response.getWriter();
		
		printW.println("<html><head>   ");
		printW.println("<style>span{font-size:20px;color:red;}</style>");
		printW.println("</head><body>");
		printW.println("<h3>안녕하세요.</h3><h4>"+name+"님 반갑습니다.</h4>");
		printW.println("<p>아이디 : <span>"+id+"</span>   패스워드 : <span>"+pw+"</span></p>");
		printW.println("<p>취미 : ");
		for(int i=0; i<hobby.length; i++) {
			if(i==hobby.length-1) {
				printW.println(hobby[i]);
			}else {
				printW.println(hobby[i]+",");
			}
		}
		printW.println("</p>");
		printW.println("<p>전공 : "+major+"</p>");
		printW.println("<p>주소 : "+address+"</p>");
		printW.println("</body><html>");
		
		printW.close();
	}

}
