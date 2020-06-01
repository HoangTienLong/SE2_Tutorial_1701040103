package tutorial.tut7.todo;

import jdk.nashorn.internal.runtime.arrays.NumericElements;

/**
 * A class of bags whose entries are stored in a fixed-size array.
 */
public final class ArrayBag<T> implements BagInterface<T> {

    //STEP 1: DETERMINES THE DATA FIELDS   
    /**
     * TO-DO: Declares the necessary attributes 
     * bag: T[] 
     * numberOfEntries: int
     * DEFAULT_CAPACITY: int (30) 
     * MAX_CAPACITY: int (3000)
     */
    //STEP 2: IMPLEMENTS THE CONSTRUCTORS
    /**
     * TO-DO: Creates an empty bag with default capacity
     */
    private T[] bag;
    private int numberOfEntries;
    private final int DEFAULT_CAPACITY = 40;
    private final int MAX_CAPACITY = 1000;
    private boolean initialized = false;

    public ArrayBag() {
        this(DEFAULT_CAPACITY);
    }
    
    /**
     * TO-DO: Creates an empty bag having a given capacity.
     *
     * @param desiredCapacity The integer capacity desired.
     */
    public ArrayBag(int desiredCapacity) {
        if (desiredCapacity <= MAX_CAPACITY){
            T[] tmpBag = (T[]) new Comparable[desiredCapacity];
            bag = tmpBag;
            numberOfEntries = 0;
        } else {
            throw new IllegalStateException("Creating a bag" + " with this capacity is invalid!");
        }
    }

    //STEP 3: IMPLEMENTS THE FUNCTIONS
    /**
     * TO-DO: Adds a new entry to this bag.
     *
     * @param newEntry The object to be added as a new entry.
     * @return True if the addition is successful, or false if not.
     */
    public boolean add(T newEntry) {
        
        boolean check = true;
        if (isArrayFull()){
            check = false;
            throw new Exception("Adding new object is invalid due to full bag")
        } else {
            bag[numberOfEntries] = newEntry;
            numberOfEntries++;
        }
        return check;
    }

    /**
     * TO-DO: Retrieves all entries that are in this bag.
     *
     * @return A newly allocated array of all the entries in this bag.
     */
    public T[] toArray() {
    	T[] result = (T[]) new Object[numberOfEntries];
		for (int index = 0; index < numberOfEntries; index++) {
			result[index] = bag[index];
		} // end for
		return result;

    }

    /**
     * TO-DO: Sees whether this bag is empty.
     *
     * @return True if this bag is empty, or false if not.
     */
    public boolean isEmpty() {
        if (numberOfEntries == 0)
            return true;
        else
            return false;
    }

    /**
     * TO-DO: Gets the current number of entries in this bag.
     *
     * @return The integer number of entries currently in this bag.
     */
    public int getCurrentSize() {
        return numberOfEntries;
    }

    /**
     * TO-DO: Counts the number of times a given entry appears in this bag.
     *
     * @param anEntry The entry to be counted.
     * @return The number of times anEntry appears in this bag.
     */
    public int getFrequencyOf(T anEntry) {
        int counter = 0;
		for (int index = 0; index < numberOfEntries; index++) {
			if (anEntry.equals(bag[index])) {
				counter++;
			} 
		} 
		return counter;

    }

    /**
     * TO-DO: Tests whether this bag contains a given entry.
     *
     * @param anEntry The entry to locate.
     * @return True if this bag contains anEntry, or false otherwise.
     */
    public boolean contains(T anEntry) {
		return false;
    }

    /**
     * TO-DO: Removes all entries from this bag.
     */
    public void clear() {
        while (!isEmpty()) {
			remove();
		}
    }

    /**
     * TO-DO: Removes one unspecified entry from this bag, if possible.
     *
     * @return Either the removed entry, if the removal was successful, or null.
     */
    public T remove() {
        T result = removeEntry(numberOfEntries - 1);
		return result;

    }

    /**
     * TO-DO: Removes one occurrence of a given entry from this bag.
     *
     * @param anEntry The entry to be removed.
     * @return True if the removal was successful, or false if not.
     */
    public boolean remove(T anEntry) {
        int index = getIndexOf(anEntry);
		T result = removeEntry(index);
		return anEntry.equals(result);

    }

    // TO-DO: Returns true if the array bag is full, or false if not.
    private boolean isArrayFull() {
        return numberOfEntries >= bag.length;

    }

    // TO-DO: Locates a given entry within the array bag.
    // Returns the index of the entry, if located,
    // or -1 otherwise.
    // Precondition: checkInitialization has been called.
    private int getIndexOf(T anEntry) {
    	T result = null;
		if (!isEmpty() && (givenIndex >= 0)) {
			result = bag[givenIndex];
			bag[givenIndex] = bag[numberOfEntries - 1];
			bag[numberOfEntries - 1] = null;
			numberOfEntries--;
		} 
		return result;
    }

    // TO-DO: Removes and returns the entry at a given index within the array.
    // If no such entry exists, returns null.
    // Precondition: 0 <= givenIndex < numberOfEntries.
    // Precondition: checkInitialization has been called.
    private T removeEntry(int givenIndex) {
        int where = -1;
		boolean stillLooking = true;
		int index = 0;
		while (stillLooking && (index < numberOfEntries)) {
			if (anEntry.equals(bag[index])) {
				stillLooking = false;
				where = index;
			}
			index++;
		}
		return where;
    }

}
