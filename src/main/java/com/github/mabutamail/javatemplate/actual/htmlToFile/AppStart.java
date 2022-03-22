package com.github.mabutamail.javatemplate.actual.htmlToFile;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;

@Slf4j
public class AppStart {

    public static void main() throws IOException {
        // IO
        File htmlSource = new File("input.html");
        File pdfDest = new File("output.pdf");
        // pdfHTML specific code
//        ConverterProperties converterProperties = new ConverterProperties();
//        HtmlConverter.convertToPdf(new FileInputStream(htmlSource),
//                new FileOutputStream(pdfDest), converterProperties);
    }
}