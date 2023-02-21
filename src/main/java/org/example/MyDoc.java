public class MyDoc {

    void cosas(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Que quieres escribir en el doc?");
        String queEscribir = scanner.nextLine;

        Document doc = new Document();
        DocumentBuilder builder = new DocumentBuilder(doc);

        Font font = builder.getFont();
        font.setSize(16.0);
        font.setBold(true);
        font.setColor(Color.BLUE);
        font.setName("Arial");
        font.setUnderline(Underline.DASH);

        builder.write(queEscribir);

        doc.save("WorkingWithFonts.FontFormatting.docx");
    }

}
