package businesslayer;

public interface ISearchable {

    /**
     *
     *
     */
    public boolean search(String title);

    /**
     *
     *
     */
    public boolean search(String title, String itemType);
}