package com.teachmeskills.lesson_9.fabric;

import com.teachmeskills.lesson_9.document_parser.IParser;
import com.teachmeskills.lesson_9.document_parser.impl.DocxDobumentParser;
import com.teachmeskills.lesson_9.document_parser.impl.PdfDocumentParser;
import com.teachmeskills.lesson_9.document_parser.impl.TxtDocumentParser;

import javax.swing.text.html.parser.DocumentParser;
import java.util.Arrays;

public class ParserFabric {

    public static IParser createParser(String fileName){

        return switch (fileName.split("\\.")[1]) {
            case "pdf" -> new PdfDocumentParser();
            case "docx" -> new DocxDobumentParser();
            default -> new TxtDocumentParser();
        };

    }

}
