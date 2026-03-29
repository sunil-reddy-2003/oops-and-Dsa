package queue.Queue;

public class CustomQueue{
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    int end=0;
    public CustomQueue(){
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size){
        this.data=new int[size];
    }
    public boolean add(int item) throws QueueException {
        if(isFull()){
            throw new QueueException("queue is full");
        }
        data[end++]=item;
        return true;
    }

    private boolean isFull() {
        return end== data.length;
    }
    private boolean isEmpty() {
        return end== 0;
    }
    public int remove() throws QueueException{
        if(isEmpty()){
            throw new QueueException("can't remove from an empty queue");
        }
        int removed=data[0];
        for(int i=1; i<end; i++){
            data[i-1]=data[i];
        }
        end--;
        return removed;
    }
    public int size(){
        System.out.print("Size: ");
        return end;
    }
}
