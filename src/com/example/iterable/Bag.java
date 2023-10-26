package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;

public class Bag<T> implements Container<T>{

    ArrayList<T> bag = new ArrayList<>();
    @Override
    public boolean isEmpty() {
        return bag.isEmpty();
    }

    @Override
    public int size() {
        return bag.size();
    }

    @Override
    public void add(T item) {
        boolean add = bag.add(item);
    }

    @Override
    public Iterator<T> iterator() {
        return bag.iterator();
    }

    @Override
    public void forEach(){
        bag.forEach(System.out::println);

    }
    @Override
    public Spliterator<T> spliterator(){

        return bag.spliterator();
    }
}
