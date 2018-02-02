public class List {

    private Element head;

    public void addLast(int value) {
        if (head == null) {
            head = new Element(value);
        } else {
            Element last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new Element(value, null, last);
        }
    }

    public int get(int position) {
        Element current = head;
        for (int i = 0; i < position; i++) {
            if (current != null && current.next != null) {
                current = current.next;
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
        return current.data;
    }

    public void remove(int value) {
        for (Element e = head; e != null; e = e.next) {
            if (e.data == value) {
                e.prev.next = e.next;
                e.next.prev = e.prev;
            }
        }
    }

    public void addBefore(int value, int newValue) {
        for (Element e = head; e != null; e = e.next) {
            if (e.data == value) {
                e.prev.next = new Element(newValue, e, e.prev);
                e.prev = e.prev.next;
                return;
            }
        }
        Element e = new Element(newValue, head, null);
        head.prev = e;
        head = e;
    }

    public List x2() {
        List l2 = new List();
        for (Element e = head; e != null; e = e.next) {
            l2.addLast(e.data * 2);
        }
        return l2;
    }

    private class Element {
        private int data;
        private Element next, prev;

        public Element(int data) {
            this.data = data;
            this.next = this.prev = null;
        }

        public Element(int data, Element next, Element prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

}


