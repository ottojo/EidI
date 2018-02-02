public class List {
    private Elem head;
    private int capacity;

    public void addAtNextPosition(int i) {
        if (head == null) {
            head = new Elem();
            head.val = i;
            head.next = head;
            return;
        }
        if (length() < capacity) {
            Elem newElement = new Elem();
            newElement.val = i;
            newElement.next = head.next;
            head.next = newElement;
            head = newElement;
        } else {
            head = head.next;
            head.val = i;
        }
    }

    private int length() {
        if (head == null)
            return 0;

        int i = 0;
        Elem b = head;
        do {
            b = b.next;
            i++;
        } while (b != head);
        return i;
    }
}
