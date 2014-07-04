package controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet("/ImageUploader")
public class ImageUploader extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final String UPLOAD_DIRECTORY = "src\\main\\webapp\\img\\";

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		if (ServletFileUpload.isMultipartContent(request)) {
			try {
				@SuppressWarnings("unchecked")
				List<FileItem> multiparts = new ServletFileUpload(
						new DiskFileItemFactory()).parseRequest(request);

				for (FileItem item : multiparts) {
					if (item.isFormField()) {
						String name = item.getFieldName();
						String value = item.getString();
						request.setAttribute(name, value);
					}
					if (!item.isFormField()) {
						String name = new File(item.getName()).getName();
						String caminhoImg = "img/" + name;
						request.setAttribute("caminhoImg", caminhoImg);
						item.write(new File(UPLOAD_DIRECTORY + name));
					}
				}
				request.getRequestDispatcher("CriaNoticias").forward(request,
						response);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

	}
}
