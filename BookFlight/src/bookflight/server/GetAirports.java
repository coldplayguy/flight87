package bookflight.server;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class GetAirports extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String airports = "";
		
		FileReader fr = new FileReader("airportcodes.txt");
		BufferedReader bfr = new BufferedReader(fr);
		
		String line = null;
		while ((line = bfr.readLine()) != null) {
			airports = airports + line.trim() + "\n";
		}
		
		PrintWriter out = response.getWriter();
		out.print(airports);
	}
}
