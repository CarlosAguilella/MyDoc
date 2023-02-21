package org.example;

import com.aspose.words.*;
import com.aspose.words.Font;


import java.awt.*;

public class MyDoc {

    public void crearDocumento(String queEscribir, int fontSize, String nombreFichero){



        Document doc = null;
        try {
            doc = new Document();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        DocumentBuilder builder = new DocumentBuilder(doc);

        Font font = builder.getFont();
        font.setSize(fontSize);
        font.setBold(true);
        font.setColor(Color.BLUE);
        font.setName("Arial");
        font.setUnderline(Underline.DASH);

        builder.write(queEscribir);

        try {
            doc.save(nombreFichero + ".docx");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}