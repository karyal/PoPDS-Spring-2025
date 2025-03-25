package pkg1;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.AreaBreak;
import com.itextpdf.layout.element.Paragraph;

public class CreatePDF {

	public static void main(String[] args) {
		try {
			//Creating PDF
			String fileName = "sample.pdf";
			PdfWriter writer = new PdfWriter(fileName);
			PdfDocument pdfDoc = new PdfDocument(writer);
			pdfDoc.addNewPage(); 
			Document document = new Document(pdfDoc); 
			AreaBreak areaBreak = new AreaBreak(); 
			document.add(areaBreak); 
			document.close();
			System.out.println("Create pdf document successfully");
			
			
			
			
			
			
			
			
			
			
			
			
			//Writing Contents
			/*
			String dest = "sample.pdf";
			PdfWriter writer = new PdfWriter(dest);
			PdfDocument pdfDoc = new PdfDocument(writer);
			pdfDoc.addNewPage(); 
			Document document = new Document(pdfDoc);	
			
			String str1 = "Hello World of iText.";    
			Paragraph paragraph1 = new Paragraph (str1);
			document.add(paragraph1);
			document.close();
			System.out.println("Add contents on pdf document successfully");
			*/
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
	}
}