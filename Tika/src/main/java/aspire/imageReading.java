package aspire;

import java.io.File;

import com.asprise.ocr.Ocr;

public class imageReading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ocr.setUp(); // one time setup
		Ocr ocr = new Ocr(); // create a new OCR engine
		ocr.startEngine("eng", Ocr.SPEED_FASTEST); // English
		String s = ocr.recognize(new File[] {new File("img1.jpg")}, Ocr.RECOGNIZE_TYPE_ALL, Ocr.OUTPUT_FORMAT_PLAINTEXT);
		System.out.println("Result: " + s);
		// ocr more images here ...
		ocr.stopEngine();
	}

}
