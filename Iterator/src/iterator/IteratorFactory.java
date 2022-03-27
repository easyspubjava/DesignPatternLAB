package iterator;

public class IteratorFactory extends Factory {

	private static IteratorFactory ifactory = new IteratorFactory();
	private IteratorFactory(){}
	
	public static IteratorFactory getInstance(){
		
		if(ifactory == null)
			ifactory = new IteratorFactory();
		return ifactory;
	}
	
	@Override
	protected Iterator createProduct(Aggregate bookShelf, int type) {
		if(type == Constant.FORWARD)
			return new BookShelfIterator(bookShelf);
		else if(type == Constant.REVERSE)
			return new ReverseIterator(bookShelf);
		else 
			return null;
	}

}
