package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jo")//url mapping  default�� �����̸��� �Ȱ���. �ٸ�������Ʈ�� ���� ������ ������ ������.
public class Exam02 extends HttpServlet { //��ü ���
	private static final long serialVersionUID = 1L;
							//��ü ���� request, response
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//out�� ���� ����� �� �ְԵ�.  System.out.print�� �츮�� ������ ���� ���̰�, ������ ���� ���� ǥ���ؾ��ϴϱ�. ��½�Ʈ�� ȹ���ؼ� out.print�� ����ϴ� ����.
		//�ѱ� �Է½� �ѱ��� �����µ�, encoding�� ���������. �׸��� ������ ��½�Ʈ�� ���� ����� ���.
		response.setCharacterEncoding("EUC-KR");
		PrintWriter out = response.getWriter();
		
		//servlet������ �ñ������� �������� �������� �̵��ؼ� ����ȴٰ� ������ �˰������� ��.
		
		String ip = request.getRemoteHost();//��û: �� ���������� ������ ������� IP�ּҸ� �����ڴ�.
		
		if(ip.equals("221.156.60.80")) {
			out.print("<html>");
			out.print("<body>");
			out.print("<img src = 'bare.jpg'>");
			out.print("�ȳ��ϼ���! ����׸����Դϴ�.");
			out.print("</body>");
			out.print("</html>");
		}else if(ip.equals("211.227.114.39")) {
			out.print("<html>");
			out.print("<body>");
			out.print("<img src = 'bare.jpg'>");
			out.print("�ȳ��ϼ���! ����׸����Դϴ�.");
			out.print("</body>");
			out.print("</html>");
		}else {
			out.print("<html>");
			out.print("<body>");
			out.print("<img src = 'bare.jpg'>");
			out.print("�ȳ��ϼ���! ����׸����Դϴ�.");
			out.print("</body>");
			out.print("</html>");
		}
		
		
		
	}

}
