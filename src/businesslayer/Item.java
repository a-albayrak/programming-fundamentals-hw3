package businesslayer;

public abstract class Item implements IBorrowable, ISearchable{

    private String itemNumber;
    private String title;
    private String priority;
    private String itemType;
    private String author_genre;
    private String publisher_producer;
    private String customerType;
    private String startBorrow;
    private String endBorrow;
    private boolean daysExceed;
    private double totalPrice;
    private int borrowingDays;
    private Member member;

    public Item(String itemNumber, String title, String priority, String itemType, String author_genre,
                String publisher_producer, String customerType, String startBorrow, String endBorrow) {
        this.itemNumber = itemNumber;
        this.title = title;
        this.priority = priority;
        this.itemType = itemType;
        this.author_genre = author_genre;
        this.publisher_producer = publisher_producer;
        this.customerType = customerType;
        this.startBorrow = startBorrow;
        this.endBorrow = endBorrow;
        this.member = determineMemberType();
    }

    public abstract boolean search(String title);

    public abstract boolean search(String title, String itemType);

    @Override
    public void borrow(){
        String daysExceedString = "Not exceeds.";
        if(daysExceed)
            daysExceedString = "Exceed";

        System.out.println("Item number: " + itemNumber + " Title: " + title + " Item Type: "
                + itemType + " Borrowing Days: " + borrowingDays + " Days exceed: " + daysExceedString
                + " Total Price: $" + totalPrice);
    }

    private Member determineMemberType(){
        if(customerType.equals("general"))
            return new General();
        else if (customerType.equals("studentWScholar"))
            return new StudentWScholar();
        else
            return new StudentWOScholar();
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public String getTitle() {
        return title;
    }

    public String getPriority() {
        return priority;
    }

    public String getItemType() {
        return itemType;
    }

    public String getCustomerType() {
        return customerType;
    }

    public String getStartBorrow() {
        return startBorrow;
    }

    public String getEndBorrow() {
        return endBorrow;
    }

    public Member getMember() {
        return member;
    }

    public void setDaysExceed(boolean daysExceed) {
        this.daysExceed = daysExceed;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setBorrowingDays(int borrowingDays) {
        this.borrowingDays = borrowingDays;
    }
}