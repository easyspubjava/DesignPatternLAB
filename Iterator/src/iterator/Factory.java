package iterator;

public abstract class Factory {
    public final Iterator create(Aggregate list, int type) {
    	Iterator p = createProduct(list, type);
        return p;
    }
    protected abstract Iterator createProduct(Aggregate list, 
    										int type);
}
