/**
 *
 * @author Pamela
 */

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable; 
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;


public class GenerarPDF {
    
    public void GenerarPdf (List<Estudiante> listaEstudiante) throws FileNotFoundException, UnsupportedEncodingException{
        
        Document documento = new Document();

        try {

         PdfWriter calificaciones = PdfWriter.getInstance(documento, new FileOutputStream("Calificaciones.pdf"));
         documento.open();

         PdfPTable tabla = new PdfPTable(3); 
         tabla.setWidthPercentage(105); 
         tabla.setSpacingBefore(11f); 
         tabla.setSpacingAfter(11f); 

         float[] columna = {2f,2f,2f}; 
         tabla.setWidths(columna);
         PdfPCell columna1 = new PdfPCell(new Paragraph("Matricula")); 
         PdfPCell columna2 = new PdfPCell(new Paragraph("Nombre")); 
         PdfPCell columna3 = new PdfPCell(new Paragraph("Calificación")); 
         tabla.addCell(columna1);
         tabla.addCell(columna2);
         tabla.addCell(columna3);
         documento.add(tabla); 
         
         for(int i = 0; i<listaEstudiante.size(); i++){
                //Escribir las matriculas, nombre y calificaciones 
            }

         documento.close();
         calificaciones.close();

         }catch (DocumentException e) {
            e.printStackTrace();
         }catch (FileNotFoundException e){
            e.printStackTrace(); 
         } 
    }
    
}