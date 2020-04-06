package jsp_0406;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/S_1")
public class Stu_insert1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ArrayList<Student> list = new ArrayList<Student>();

	
    public Stu_insert1() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");

		String s_num = request.getParameter("s_num");
		String s_name = request.getParameter("s_name");
		int s_kor = Integer.parseInt(request.getParameter("s_kor")); 
		int s_eng = Integer.parseInt(request.getParameter("s_eng")); 
		int s_math = Integer.parseInt(request.getParameter("s_math"));
		
		
		list.add(new Student(s_num,s_name,s_kor,s_eng,s_math));
	}

}
