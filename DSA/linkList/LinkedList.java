package linkList;

public class LinkedList {

    //creating class node
    public static class Node{

        int data;
        Node next;

        //constructor
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data)
    {
        //step1 : create new node
        Node newNode = new Node(data);
        size++;
        if(head == null)
        {
            head = tail = newNode;
            return ;
        }

        //step2: newNode.next = head;
        newNode.next = head; // linking between nodes 

        //step3 : head = newNode;
        head = newNode;
    }

    public void addLast(int data)
    {
        //create a new node
        Node newNode = new Node(data);
        size++;
        if(head == null)
        {
            head = newNode;
            tail = newNode;
            return ;
        }

        //step2 : tail.next= newNode;
        tail.next = newNode;

        //step3 : tail = newNode;
        tail = newNode;
    }


    //printing the link list
    public void printLinkList()
    {
        Node temp = head;
        if(head == null)
        {
            System.out.println("the list is empty ");
        }

        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        System.out.println();
    }



    //adding node at the midddle means in between the list.
    public void addMiddle(int idx,int data)
    {
        // if the index is zero ,we have to add the node at first ,so we don't nedd to write again the code 
        // instead we use the previous code of adding at the first.
        if(idx == 0)
        {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp  = head;
        int i = 0;
        while(i <idx-1)
        {
            temp = temp.next;
            i++;
        }
        // i = idx-1 ;temp = prev;
        newNode.next = temp.next;
        temp.next = newNode;
        
    }
 
 
    //removing the node at First
    public int removeFirst()
    {
        if(size == 0)
        {
            System.out.println("The link List is empty");
            return Integer.MIN_VALUE;
        }

        else if(size == 1)
        {
           int val = head.data;
           head = tail = null;
           size = 0;
           return val;
        }
        int val = head.data;
        head = head.next;
        size-- ;
        return val;
    }



    //remove at last 
    public int removeLast()
    {
        if(size == 0)
        {
            System.out.println("the list is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1)
        {
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }

        Node prev = head;
        for(int i =0;i<size-2;i++)
        {
            prev = prev.next;

        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size-- ;
        return val;

    }



//remove at last second method
    public int removeLast2()
    {
        Node prev = head;
        if(head == null)
        {
            System.out.println("The list is empty");
            return -1;
        }
        
        else if(head.next == null)
        {
            int val = head.data;
            head = tail= null;
            size = 0;
            return val;
        }
        
        while(prev.next.next != null)
        {
            prev = prev.next;
        }
        int val = prev.next.data;
        size-- ;
        prev.next = null;
        tail = prev;
        return val;
    }


    //Iterative search 
    public int itrSearch(int key)
    {
        Node temp = head;
        int i =0;

        while(temp !=null)
        {
            if(temp.data == key)
            {
                return i;
            }
            temp = temp.next;
            i++;
        }

        //key not found condition 
        return -1;
    }


    //Recursive search
    public int helper(Node head,int key) // time complexity --> O(N) time 
    {
        if(head == null)
        {
            return -1;
        }

        if(head.data == key)
        {
            return 0;
        }

        int idx = helper(head, key);
        if( idx == -1)
        {
            return -1;
        }

        return idx+1;
    }
    public int recursiveSearch(int key)
    {
        return helper(head, key);
    }



    //Reverse a link list (iterative method)
    public void reverse()
    {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr !=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthFromEnd(int n)
    {
        //calculate the size of the list
        Node temp = head;
        int sz = 0;
        while(temp != null)
        {
            temp = temp.next;
            sz++;
        }
        if(n == sz)
        {
            head = head.next; //remove first
            return ;
        }

        //sz -n
        int i = 1;
        while(i < (sz-n))
        {
            temp = temp.next;
        }
        temp = temp.next.next;

    }

    public static void main(String[] args) {
        
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        // ll.addMiddle(2, 9);
        // ll.printLinkList();

        //calculating the size of the list
      //  System.out.println(size);
    //   System.out.println("After remove the node ");
    //   ll.removeFirst();
    //   ll.printLinkList();

        //  System.out.println(size);

        System.out.println(ll.itrSearch(3));
        System.out.println(ll.itrSearch(10));

    }
}
