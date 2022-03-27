package iterator;

public class BookShelfIterator implements Iterator{
    private BookShelf bookShelf;
    private int index;
    
    BookShelfIterator(Aggregate bookShelf) {
        this.bookShelf = (BookShelf)bookShelf;
        this.index = 0;
    }
    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }

}
