import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class BookExerciser extends Book {
    public static void main(String[] args) {
        String location = "C:\\Users\\Konrad\\Documents\\Brownie\\Java\\Store\\src\\books.txt";
        List<Book> books = readBooksFromFile(location);

        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }
    public static ArrayList readBooksFromFile(String name){
            ArrayList books = new ArrayList();
            FileInputStream inFile = null;
            InputStreamReader inReader = null;
            LineNumberReader lineReader = null;
            try {
                inFile = new FileInputStream(name);
                inReader = new InputStreamReader(inFile);
                lineReader = new LineNumberReader(inReader);

                String title = lineReader.readLine();
                while (title != null) {
                    String author = lineReader.readLine();
                    String sPrice = lineReader.readLine();
                    double price = Double.parseDouble(sPrice);

                    Book book = new Book(title, price, 5, author, null, "NON-FICTION");
                    books.add(book);

                    title = lineReader.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (lineReader != null) {
                        lineReader.close();
                    }
                    if (inFile != null) {
                        inFile.close();
                    }
                    if (inReader != null) {
                        inReader.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return books;
        }
}
