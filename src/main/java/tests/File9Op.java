package tests;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

public class File9Op {
    public static void main(String[] args) throws IOException {

        //Reading data from PDF
        String path = ".\\Data\\regular-expressions-cheat-sheet.pdf";
        File file = new File(path);
        //Load The PDf
        PDDocument pdDocument = Loader.loadPDF(file);
        //Text Stripper
        PDFTextStripper pdfTextStripper = new PDFTextStripper();
        final String text = pdfTextStripper.getText(pdDocument);
        System.out.println(text);

        //Create NEw PDF
        PDDocument document = new PDDocument();

        PDPage page = new PDPage();

        document.addPage(page);

        PDPageContentStream contentStream = new PDPageContentStream(document, page);

        contentStream.setFont(new PDType1Font(Standard14Fonts.FontName.COURIER_BOLD), 14);
        contentStream.beginText();
        contentStream.newLineAtOffset(50, 700);
        contentStream.showText("HElo Baby");
        contentStream.endText();
        contentStream.close();

        document.save(".\\Data\\Raj.pdf");
        document.close();

    }
}
