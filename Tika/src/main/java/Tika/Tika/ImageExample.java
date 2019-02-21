package Tika.Tika;


import java.io.File;  
import java.io.FileInputStream;  
import java.io.IOException;  
import org.apache.tika.exception.TikaException;  
import org.apache.tika.metadata.Metadata;  
import org.apache.tika.parser.ParseContext;  
import org.apache.tika.parser.jpeg.JpegParser;  
import org.apache.tika.sax.BodyContentHandler;  
import org.xml.sax.SAXException;  

public class ImageExample {  
   public static void main(final String[] args) throws IOException,SAXException, TikaException {  
      BodyContentHandler handler = new BodyContentHandler();  
      Metadata metadata = new Metadata();  
      FileInputStream inputstream = new FileInputStream(new File("img1.jpg"));  
      ParseContext pcontext = new ParseContext();  
      JpegParser  JpegParser = new JpegParser();  
      JpegParser.parse(inputstream, handler, metadata,pcontext);  
      System.out.println("Document Content :" + handler.toString());  
      System.out.println("Document Metadata :");  
      String[] metadataNames = metadata.names();  
      for(String name : metadataNames) {                  
         System.out.println(name + ": " + metadata.get(name));  
      }  
   }  
} 