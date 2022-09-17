package linkList;

public class LL {
    
    Node head;
    private int size;
    
    LL()
    {
        this.size = 0;
    }
    class Node{

        String data;
        Node next;

        Node(String data)
        {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    // add first
    public void addFirst(String data)
    {
        Node newNode = new Node (data);
        if(head == null)
        {
            head = newNode;
            return ;
        }

        newNode.next = head;
        head = newNode;
    }

    //add last 

    public void addLast(String data)
    {
        Node newNode = new Node(data);
        
        if(head == null)
        {
            head = newNode;
            return ;
        }
        Node currNode = head;
        while(currNode.next != null)
        {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //printing the list

    public void printList()
    {
        Node currNode = head;
        if(currNode == null)
        {
            System.out.println("The list is empty ..");
            return ;
        }
        while(currNode != null)
        {
            System.out.print(currNode.data+" ->");

            currNode = currNode.next;
        }
        System.out.print("null");
    }


    //delete at First 
    public void deleteFirst()
    {
        //corner case
        if(head == null)
        {
            System.out.println("the list is emtpy ");
        }

        //delete at the first 
        size--;
        head = head.next;
    }

    //delete at the last 
//     public void deleteLast()
//     {
//         //corner case
//         if(head == null)
//         {
//             System.out.println("the list is empty ");
//         }

//         Node currNode = head;

//         while(currNode.next.next != null)
//         {
//             currNode = currNode.next;
//         }
//         currNode.next = null;
//     }
    
    //delete at last
    public void deleteLast()
    {
        if(head == null)
        {
            System.out.println("the list is empty");
        }
        size--;
        if(head.next == null)
        {
            head = null;
            return ;
        }
        
        Node secondLast = head;
        Node lastNode = head.next;
        
        while(lastNode.next != null)
        {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        
        secondLast.next = null;
    }
    
    private int getSize()
    {
        return size;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.addLast("list");
        list.printList();
        
        //delete
        list.deleteLast();
        System.out.println();
        list.printList();
        
        
        System.out.println(); 

        //size of the list;
        System.out.println(list.getSize());
    }
}
