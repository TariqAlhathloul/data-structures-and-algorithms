import java.util.NoSuchElementException;

public class ArrayList {

    public static class MyArrayList <AnyType> implements Iterable <AnyType> {

        private static final int DEFAULT_CAPACITY = 10;
        private int theSize;
        private AnyType[] theItems;

        public MyArrayList() { doClear(); }
        public void clear() { doClear(); }

        private void doClear() {
            theSize = 0;
            ensureCapacity( DEFAULT_CAPACITY );
        }
        public int size() { return theSize; }

        public boolean isEmpty() { return size() == 0; }

        public void trimToSize() { ensureCapacity ( size() ); }
        public AnyType get (int index) {
            if(index < 0 || index >= size()) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return theItems[index];
        }

        public AnyType set (int index, AnyType newValue) {
            if(index < 0 || index >= size())
                throw new ArrayIndexOutOfBoundsException();
            AnyType old = theItems[index];
            theItems[index] = newValue;
            return old;
        }

        public void ensureCapacity (int newCapacity) {
            if(newCapacity < theSize)
                return;

            AnyType[] old = theItems;
            theItems = ( AnyType[] ) new Object [ newCapacity ];
            for(int i = 0; i < size(); i++) {
                theItems[i] = old[i];
            }
        }

        public boolean add ( AnyType x ) {
            add( size(), x);
            return true;
        }

        public void add ( int index, AnyType x ) {
            if( theItems.length == size() ) {
                ensureCapacity(size() * 2 + 1);
            }
            for(int i = theSize; i > index; i--) {
                theItems[i] = theItems[i - 1];
            }
            theItems[ index ] = x;
            theSize++;
        }

        public AnyType remove ( int index ) {
            AnyType removedItem = theItems[ index ];
            for(int i = index; i < size() - 1; i++) {
                theItems[i] = theItems[i + 1];
            }

            theSize--;
            return removedItem;
        }

        public java.util.Iterator <AnyType> iterator() { return new ArrayListIterator();}

        private class ArrayListIterator implements java.util.Iterator <AnyType>
        {
            private int current = 0;

            public boolean hasNext() { return current < size();};

            public AnyType next() {
                if ( !hasNext() )
                    throw new NoSuchElementException();

                    return theItems[ current++ ];
            }

            public void remove() { MyArrayList.this.remove( --current ); }
        }
    }

    public static void main(String[] args) {
        MyArrayList arr = new MyArrayList();
        arr.remove(2);
        arr.size();
    }
}

