package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SampleServlet
 */
@WebServlet("/SampleServlet")
public class SampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SampleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//運勢をランダムで決定
		String[] luckyArray = {"超すっきり", "すっきり", "最悪"};		
		//0以上3未満の整数を乱数で生成
		int index = (int) (Math.random() * 3);
		String luck = luckyArray[index];
				
	 //実行日を取得
	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyy/MM/dd");
	String today = sdf.format(date);
				
	//HTMLを出力
	response.setContentType("text/html; charset = UTF-8");
	PrintWriter out = response.getWriter();
	out.println("<html>");
    out.println("<head>");
	out.println("<title>すっきり占い</title>");
	out.println("</head>");
	out.println("<body>");
	out.println("<p>" + today + "の運勢は" + luck + "です</p>");
	out.println("</body>");
	out.println("</html>");
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
