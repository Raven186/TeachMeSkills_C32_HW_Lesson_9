package com.teachmeskills.lesson_9.document_parser.impl;

import com.teachmeskills.lesson_9.document_parser.IParser;

public class DocxDobumentParser implements IParser {
    @Override
    public void parseFile(String fileName) {
        System.out.println("Получить данные из docx документ");
    }
}
