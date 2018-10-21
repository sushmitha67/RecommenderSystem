/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.Impl.Constants;
import com.Items.path;
import com.algorithm.Main;
import com.oreilly.servlet.MultipartRequest;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author sumit
 */
public class FileUpload extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
         HttpSession session=request.getSession();
       String dirName =path.p+File.separator;
       // String dirName = System.getProperty("user.dir");
		System.out.println(dirName); 
		String paramname=null,fname="",file="",uid="",fPath="";
                
                
   		
   		  File file2 = null;
                  
                  
		
                 
               
		RequestDispatcher view=null;
		try {
			 
			MultipartRequest multi = new MultipartRequest(request, dirName,	10 * 1024 * 1024); // 10MB
                       
			Enumeration params = multi.getParameterNames();
			while (params.hasMoreElements()) 
			{
				paramname = (String) params.nextElement();
				
				
                                
                                if(paramname.equalsIgnoreCase("fname"))
				{
					fname=multi.getParameter(paramname);
				}
                          }
                      
                        String extn="";
                        String phPath="",filePath="";
                        Enumeration files = multi.getFileNames();	
	while (files.hasMoreElements()) 
	{
		paramname = (String) files.nextElement();
	
	
		 if(paramname != null && paramname.equals("file"))
		{
			
			filePath = multi.getFilesystemName(paramname);
			fPath = dirName+filePath;
                        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>1>>"+filePath);

                        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>2>>"+fPath);

			file2 = new File(fPath);
                    
                     
		}
                 
                
              
               
                }

                    fname=filePath;
                    System.out.println(">>>>>>>>>"+fname);
                    
                    Main.get_input_Data(file2);
                   String dataset_path =path.p;
		  dataset_path = dataset_path+File.separator+"Dataset1";
		  new com.Impl.Main(dataset_path);
                  
                    Thread.sleep(3000);
                    
                    
                    
                  
                    
                    
                   session.setAttribute("data", path.info);
                    RequestDispatcher rd=null;
                    rd=request.getRequestDispatcher("display_data.jsp");
                    rd.forward(request, response);
                    
                    
                     }catch(Exception e){e.printStackTrace();}
                
                
               
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
