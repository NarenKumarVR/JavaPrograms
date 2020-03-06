import java.util.*;
class LinkedList {
    Node head;
    Node tail;
    
    public void insert_beginning(int value)
    {
        Node newnode = new Node();
        newnode.data = value;
        newnode.next = null;
        if(head==null)
        {
            head = newnode;
            System.out.println("Values inserted at the beginning");
        }
        else
        {
            newnode.next = head;
            head = newnode ;
            System.out.println("Values inserted at the beginning");
        }

        System.out.println("Value inserted successfully!");
    }
    
    public void insert_pos(int value, int pos)
    {
        Node newnode = new Node();
        Node previous_node = head;
        Node current_node = head;
        int i = 1;
        newnode.data = value;
        newnode.next = null;
        if(head==null)
        {
            head = newnode;
            System.out.println("Values inserted");
        }
        
        else
        {
            while(current_node.next!=null)
            {
                if(i==pos)
                {
                    previous_node.next = newnode;
                    newnode.next = current_node;
                    System.out.println("Value "+value+" inserted at position" + i);
                    return;
                }
                i++;
                previous_node = current_node;
                current_node = current_node.next;
            }
            System.out.println("Out of bounds");
        }
    }

    public void insert_end(int value)
    {
        Node node = new Node();
        node.data = value;
        node.next = null;
        
        if(head==null)
        {
            head = node;
        }
        else
        {
            tail.next = node;    
        }
        tail = node;
        System.out.println("Value inserted successfully!");
    }
    
    public void print()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    
    public void search(int value)
    {
        Node temp = head;
        int i = 0;
        while(temp!=null)
        {
            if(temp.data==value)
            {
                
                System.out.println("Value "+ value +" found at " + i);
                return;
                
            }
            i++;
            temp = temp.next;
        }
        System.out.println("Value not found");
    }
    
    public void delete(int value)
    {
        Node previous_node = head;
        Node current_node = head;
        if(head!=null && head.data == value)
        {
            head = head.next;
            System.out.println("Value deleted");
            return;
        }
        else
        {
            while(current_node.next!=null)
            {
                if(current_node.data==value)
                {
                    previous_node.next = current_node.next;
                    System.out.println("Value deleted");
                    return;
                }
                previous_node = current_node;
                current_node = current_node.next;
            }
        }
        System.out.println("Value not found");
    }
}

class Node {
    int data;
    Node next;
}

class Main {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        // ll.add(1);
        // ll.add(2);
        // ll.add(3);
        ll.print();
        
        System.out.println("Insert Values");
        ll.insert_end(sc.nextInt());
        int ch = 1;
        do
        {
            System.out.println("1.Insert at beginning\n2.Insert at position\n3.Insert at end\n4.Search\n5.Delete\n6.Display\n7.Exit");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1: System.out.println("Enter value to be inserted at beginning");
                        ll.insert_beginning(sc.nextInt());
                        break;
                
                case 2: System.out.println("Enter value and position to be inserted ");
                        ll.insert_pos(sc.nextInt(),sc.nextInt());
                        // System.out.println("Enter the position for the value to be inserted");
                        // ll.insert_pos(sc.nextInt());
                        break;
                
                case 3: System.out.println("Enter value to be inserted at end");
                        ll.insert_end(sc.nextInt());
                        break;
                        
                case 4: System.out.println("Enter value to be searched");
                        ll.search(sc.nextInt());
                        break;
                        
                case 5: System.out.println("Enter value to be deleted");
                        ll.delete(sc.nextInt());
                        break;
                case 6: System.out.println("Values present");
                        ll.print();
                        break;
            }
        }while(ch<7);
        System.out.println("Exited");
        
        
    }
}
