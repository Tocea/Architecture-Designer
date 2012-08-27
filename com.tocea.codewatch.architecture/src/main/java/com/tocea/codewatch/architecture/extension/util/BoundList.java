package com.tocea.codewatch.architecture.extension.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class BoundList<E> implements List<E> {

	private List<E> list;
	private int lower = -1;
	private int upper = -1;

	public BoundList() {
		list = new ArrayList<E>();
	}

	public BoundList(int lower, int upper) {
		this();
		this.lower = lower;
		this.upper = upper;
	}

	public BoundList(List<E> list) {
		this.list = list;
	}

	public BoundList(List<E> list, int lower, int upper) {
		this(list);
		this.lower = lower;
		this.upper = upper;
	}

	public boolean checkBounds() {
		return list.size()>=lower && (upper<0 || list.size()<=upper);
	}

	public boolean add(E element) {
		if(upper>-1 && list.size()>=upper)
			throw new OutOfBoundException(this, "Cannot add element : list already at upper bound ("+upper+")");
		return list.add(element);
	}

	public void add(int index, E element) {
		if(upper>-1 && list.size()>=upper)
			throw new OutOfBoundException(this, "Cannot add element : list already at upper bound ("+upper+")");
		list.add(index, element);
	}

	public boolean addAll(Collection<? extends E> collection) {
		if(upper>-1 && list.size()+collection.size()>upper)
			throw new OutOfBoundException(this, "Cannot add elements : list size would be over upper bound ("+upper+")");
		return list.addAll(collection);
	}

	public boolean addAll(int index, Collection<? extends E> collection) {
		if(upper>-1 && list.size()+collection.size()>upper)
			throw new OutOfBoundException(this, "Cannot add elements : list size would be over upper bound ("+upper+")");
		return list.addAll(index, collection);
	}

	public void clear() {
		list.clear();
	}

	public boolean contains(Object o) {
		return list.contains(o);
	}

	public boolean containsAll(Collection<?> c) {
		return list.containsAll(c);
	}

	public E get(int index) {
		return list.get(index);
	}

	public int indexOf(Object o) {
		return list.indexOf(o);
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public Iterator<E> iterator() {
		return list.iterator();
	}

	public int lastIndexOf(Object o) {
		return lastIndexOf(o);
	}

	public ListIterator<E> listIterator() {
		return list.listIterator();
	}

	public ListIterator<E> listIterator(int index) {
		return list.listIterator(index);
	}

	public boolean remove(Object o) {
		return list.remove(o);
	}

	public E remove(int index) {
		return list.remove(index);
	}

	public boolean removeAll(Collection<?> c) {
		return list.removeAll(c);
	}

	public boolean retainAll(Collection<?> c) {
		return list.retainAll(c);
	}

	public E set(int index, E element) {
		return list.set(index, element);
	}

	public int size() {
		return list.size();
	}

	public List<E> subList(int fromIndex, int toIndex) {
		return list.subList(fromIndex, toIndex);
	}

	public Object[] toArray() {
		return list.toArray();
	}

	public <T> T[] toArray(T[] a) {
		return list.toArray(a);
	}

	public static class OutOfBoundException extends RuntimeException {

		private static final long serialVersionUID = -4650647260882784107L;

		private BoundList<?> list;

		public OutOfBoundException(BoundList<?> list, String message) {
			super(message);
			this.list = list;
		}

		public BoundList<?> getList() {
			return list;
		}

	}

}
