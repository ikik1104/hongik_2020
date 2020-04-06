package com.javalec.ex;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/F_ok")
public class Form_ok extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	//생성자
	public Form_ok() { 
		super();
    }

	//메소드
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//method="get"  doGet실행, 주소로 바로 접근해도 doGet실행
		System.out.println("doPost로 실행됨");
	}

	//메소드
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//method="post" doPost실행 
	}

	//get, post어느걸로 들어올지 모르니까 여기로 무조건 보내준다.
		private void actionDo(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
			// TODO Auto-generated method stub
			System.out.println("actionDo");
		} 
}
