package TypesOfLL;

class NodeLL{
    int data;
    NodeLL next;
    NodeLL(int data){
        this.data=data;
        this.next=null;
    }
}
public class ReversedLL {
    NodeLL head=null;

    void addRLL(int data){
        NodeLL newNode=new NodeLL(data);
        if(head==null){
            head=newNode;
        }else{
            NodeLL curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }curr.next=newNode;
        }
    }

    void displayRLL(){
        NodeLL curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("END");
    }

    void reverseRLL(){
        NodeLL curr=head;
        NodeLL prev=null;
        NodeLL next=null;
//prev  curr next

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        NodeLL temp=head;
        while (temp!=null){
            System.out.print(temp.data+"<-");
            temp=temp.next;
        }
        System.out.println("START");
    }


    public static void main(String[] args) {
        ReversedLL rll = new ReversedLL();
        rll.addRLL(1);
        rll.addRLL(2);
        rll.addRLL(3);
        rll.addRLL(4);
        rll.addRLL(5);
        rll.addRLL(6);
        rll.displayRLL();
        rll.reverseRLL();
    }
}
