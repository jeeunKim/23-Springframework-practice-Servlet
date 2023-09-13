package hello.servlet.web.servletmvc;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import hello.servlet.domain.member.MemberRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "mvcMemberFormServlet", urlPatterns = "/servlet-mvc/members/new-form")
public class MvcMemberFormServlet extends HttpServlet {
	
	private MemberRepository memberRepository = MemberRepository.getInstance();
	
	 @Override
	 protected void service(HttpServletRequest request, HttpServletResponse
			 response)
	 throws ServletException, IOException {
		 String viewPath = "/WEB-INF/views/new-form.jsp";
		 RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
		 dispatcher.forward(request, response);
	 }
}



