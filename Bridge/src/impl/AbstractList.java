package impl;

public interface AbstractList<T> {

	public void addElement(T obj);
	public T deleteElement(int i);
	public int insertElement(T obj, int i);
	public T getElement(int i);
	public int getElementSize();
}
