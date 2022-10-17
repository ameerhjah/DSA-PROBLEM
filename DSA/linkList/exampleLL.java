public class exampleLL {
    public static Node head;
    public static Node tail;

    public class Node{
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

        //add method 
        public void addFirst(int data){
            Node newNode = new Node(data);

            if(head == null)
            {
                head = tail = newNode;
                return ;
            }

            newNode.next = head;

            head = newNode;
        }


        //addLast
        public void addLast(int data)
        {
            Node newNode = new Node(data);

            if(head == null)
            {
                head = tail = newNode;
                return ;
            }

            tail.next = newNode;
            tail = newNode;

        }


        //print the element 

        void printingElement(){
            Node temp = head;

            if(temp == null){
                System.out.prinltn("The list is empty");
                return ;
            }

            while(temp != null)
            {
                System.out.print(temp.data+" ->");
                temp = temp.next;
            }
            System.out.println("null");
        }

    public static void main(String[] args) {
        
        exampleLL ll = new exampleLL();
        ll.addFirst(2);
        ll.addFirst(1);

        ll.addLast(3);
        ll.addLast(4);

        ll.printingElement();


    }
}
