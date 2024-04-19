package applications;

    public class MemoryCell {
        private Object storedValue;

        public Object read() {
            return storedValue;
        }

        public void write(Object x) {
            storedValue = x;
        }


        public static void main(String[] args) {

            MemoryCell m = new MemoryCell();
            m.write("37");
            String value = (String) m.read();
            System.out.println("contents are " + value);
        }
    }