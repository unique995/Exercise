import java.util.Random;

public class myHash {
    private static class Node{
        int key;
        int value;
        Node next;
    }

    private static final double LOAD_FACTOR_THRESHOLD = 0.75;
    private Node[] array;
    private int size;
    public myHash(){
        array = new Node[16];
        size = 0;
    }
    private int getIndex(int key){
        return key%array.length;
    }
    public int get(int key){
        int index = getIndex(key);
        Node cur = array[index];
        while (cur != null){
            if (cur.key == key){
                return cur.value;
            }
            cur = cur.next;
        }
        return -1;
    }

    public int put(int key,int value) {
        if (1.0 * size / array.length >= LOAD_FACTOR_THRESHOLD){
            adjustCapacity();
        }
        int index = getIndex(key);
        Node cur = array[index];
        while (cur != null){
            if (cur.key == key){
                int v = cur.value;
                cur.value = value;
                return v;
            }
            cur = cur.next;
        }
        Node newNode = new Node();
        newNode.key = key;
        newNode.value = value;
        size++;

        newNode.next = array[index];
        array[index] = newNode;
        return -1;
    }
    private void move(Node[] array,int key,int value){
        int index = key % array.length;
        Node newNode = new Node();
        newNode.key = key;
        newNode.value = value;
        newNode.next = array[index];
        array[index] = newNode;
    }
    private void adjustCapacity(){
        Node []array = new Node[this.array.length*2];
        for (int i = 0;i < this.array.length;i++){
            Node cur = this.array[i];
            while (cur != null){
                move(array,cur.key,cur.value);
                cur = cur.next;
            }
        }
        this.array = array;
    }

    public static void main(String[] args) {
        myHash hash = new myHash();
        Random random = new Random(20190827);
        for (int i = 0;i < 100;i++){
            int key = random.nextInt(200);
            hash.put(key,key);
        }
    }
}
