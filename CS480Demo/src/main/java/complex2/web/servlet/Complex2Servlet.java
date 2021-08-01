package complex2.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import complex2.dao.Complex2Dao;
import complex2.domain.Complex2;
import complex2.service.Complex2Exception;
import complex2.service.Complex2Service;

/**
 * Servlet implementation class UserServlet
 */

public class Complex2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Complex2Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Map<String, String> form = new HashMap<String,String>();

		Complex2Service complex2Service = new Complex2Service();
		
		try {
			request.setAttribute("HospitalVaccineInfoList", complex2Service.hospitalVaccineInfo());

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			request.setAttribute("msg", e.getMessage());
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			request.setAttribute("msg", e.getMessage());
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			request.setAttribute("msg", e.getMessage());
		} 
		
		
		try {
			List<Object> li = complex2Service.hospitalVaccineInfo();
			for(int i = 0; i < li.size();i++){
				System.out.println(li.get(i).toString());
			}
			
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		request.getRequestDispatcher("/Queryresult/HospitalVaccineInfolist.jsp").forward(request, response);

	
	}

}
