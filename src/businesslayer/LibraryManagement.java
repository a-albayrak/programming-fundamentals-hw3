package businesslayer;

import dataaccesslayer.FileIO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LibraryManagement{

    FileIO fileIO = new FileIO();
    List<Item> itemList = fileIO.readFile();

    public LibraryManagement(){
        for (Item item : itemList){
            item.setTotalPrice(totalPrice(item));
        }
    }

    public void borrowAll(){
        for (Item item : itemList)
            item.borrow();
    }

    public void searchFor(String title){
        for (Item item : itemList) {
            if (item.search(title)) {
                System.out.print("Exist. ");
                item.borrow();
                return;
            }
        }
        System.out.println("Does not exist.");
    }

    public void searchFor(String title, String itemType){
        for (Item item : itemList) {
            if (item.search(title, itemType)) {
                System.out.print("Exist. ");
                item.borrow();
                return;
            }
        }
        System.out.println("Does not exist.");
    }

    private int numberOfDaysBorrowed(Item item){
        Date startBorrowDate = null;
        Date endBorrowDate = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            startBorrowDate = dateFormat.parse(item.getStartBorrow());
            endBorrowDate = dateFormat.parse(item.getEndBorrow());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        long timeDiff = endBorrowDate.getTime() - startBorrowDate.getTime();
        item.setBorrowingDays(((int) TimeUnit.MILLISECONDS.toDays(timeDiff)));

        return ((int) TimeUnit.MILLISECONDS.toDays(timeDiff));
    }

    private int getPriorityMultiplier(Item item) {
        int priorityMultiplier = 0;

        switch(item.getPriority()){
            case "invaluable":
                priorityMultiplier = 3;
                break;
            case "highly significant":
                priorityMultiplier = 2;
                break;
            case "noteworthy":
                priorityMultiplier = 1;
        }
        return priorityMultiplier;
    }

    private double borrowingCharge(Item item) {
        if(item.getItemType().equals("book"))
            return numberOfDaysBorrowed(item) * 5 * getPriorityMultiplier(item);
        else
            return numberOfDaysBorrowed(item) * 10 * getPriorityMultiplier(item);
    }

    private double lateCharge(Item item) {
        if (item.getItemType().equals("book") && (numberOfDaysBorrowed(item) >10)) {
            item.setDaysExceed(true);
            return 5;
        }
        else if (item.getItemType().equals("magazine") && numberOfDaysBorrowed(item) >7){
            item.setDaysExceed(true);
            return 2;
        }
        else
            return 0;
    }

    private double discount(Item item) {
        return item.getMember().discountPercentage() * borrowingCharge(item);
    }

    private double totalPrice(Item item) {
        return borrowingCharge(item) + lateCharge(item) - discount(item);
    }
}