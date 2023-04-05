public class Main {
    Dom head;
    private int size;
    Main(){
        this.size=0;
    }
    class Dom {
        String data;
        Dom next;

         Dom(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public  void  addFirst(String data){
        Dom newNode=new Dom(data);
        if (head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }
    public void addLast(String data){
        Dom newNode=new Dom(data);
        if (head==null){
            head=newNode;
            return;
        }
        Dom CurrNode=head;
        while (CurrNode.next!=null){
            CurrNode=CurrNode.next;
        }
        CurrNode.next=newNode;

    }
    public void deleteFirst(){
        if (head==null){
            System.out.println("list is bilkul khali");
            return;
        }
        size--;
        head=head.next;

    }
    public void deletelast(){
        if (head==null){
            System.out.println("list is khali");
            return;
        }
        size--;

        if (head.next==null){
            head=null;
            return;
        }
        Dom SecondLast=head;
        Dom LastNode=head.next;
        while (LastNode.next!=null){
            LastNode=LastNode.next;
            SecondLast=SecondLast.next;
        }

        SecondLast.next=null;


    }
    public void reverseList(){
        Dom preNode=head;
        if (head==null||head.next==null){
            return;
        }
        Dom CurreNode=head.next;
        while (CurreNode!=null){
            Dom nexNode=CurreNode.next;
            CurreNode.next=preNode;
//            update
            preNode=CurreNode;
            CurreNode=nexNode;
        }
        head.next=null;
        head=preNode;
    }
    public  void printList(){
        if(head==null){
            System.out.println("list is empty");
        }
        Dom CurrNode=head;
        while (CurrNode !=null){
            System.out.print(CurrNode.data+"->");
            CurrNode=CurrNode.next;

        }
        System.out.println("null");
        System.out.println(size);
    }

    public static void main(String[] args) {
        Main list= new Main();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.addLast("list");
        list.printList();
        list.reverseList();
        list.printList();

    }
}