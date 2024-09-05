package dataaccesslayer;

import businesslayer.*;
import java.io.*;
import java.util.*;

public class FileIO {

    private final String FILENAME = "items.csv";

    public List<Item> readFile() {
        List<Item> itemList = new ArrayList<Item>();

        try {
            BufferedReader inFileStream = new BufferedReader(new FileReader(FILENAME));
            String line = inFileStream.readLine();

            while (line != null) {
                StringTokenizer parser = new StringTokenizer(line, ";");

                String itemNumber = parser.nextToken();
                String title = parser.nextToken();
                String priority = parser.nextToken();
                String itemType = parser.nextToken();
                String author_genre = parser.nextToken();
                String publisher_producer = parser.nextToken();
                String customerType = parser.nextToken();
                String startBorrow = parser.nextToken();
                String endBorrow = parser.nextToken();

                if(itemType.equals("book"))
                    itemList.add(new Book(itemNumber, title, priority, itemType, author_genre, publisher_producer,
                       customerType, startBorrow, endBorrow));
                else
                    itemList.add(new Magazine(itemNumber, title, priority, itemType, author_genre, publisher_producer,
                            customerType, startBorrow, endBorrow));

                line = inFileStream.readLine();
            }
            inFileStream.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");

        } catch (IOException e) {
            System.out.println("Error reading from file ");
        }

        return itemList;
    }
}