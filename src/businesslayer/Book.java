package businesslayer;

public class Book extends Item{
    public Book(String itemNumber, String title, String priority, String itemType, String author_genre,
                String publisher_producer, String customerType, String startBorrow, String endBorrow) {
        super(itemNumber, title, priority, itemType, author_genre, publisher_producer,
                customerType, startBorrow, endBorrow);
    }

    @Override
    public boolean search(String title) {
        if(super.getTitle().equals(title)) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean search(String title, String itemType) {
        if (super.getTitle().equals(title) && itemType.equals("book")) {
            return true;
        }
        else {
            return false;
        }
    }
}