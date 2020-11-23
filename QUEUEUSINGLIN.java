/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue.using.lin;
import java.util.*;
import java.util.Scanner;
/**
 *
 * @author shauqeecom
 */
public class QUEUEUSINGLIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        linkedQueue qlist=new linkedQueue();
        System.out.println("linked queue test");
        char ch;
        do{
            System.out.println("queue operation");
            System.out.println("1.insert");
            System.out.println("2.remove");
            System.out.println("3.peek");
            System.out.println("4.check empty");
            System.out.println("5.size");
            System.out.println("6.display");
            int choice=s.nextInt();
            switch(choice){
                case 1:
                    System.out.println("enter element to insert");
                    qlist.inqueue(s.nextInt());
                    break;
                case 2:
                    try{
                    System.out.println("remove element:  "+qlist.dequeue());
                    }
                    catch(Exception e){
                        System.out.println("error:  "+e.getMessage());
                    }
                    break;
                case 3:
                    try{
                    System.out.println("peek element:  "+qlist.peek());
                    }
                     catch(Exception e){
                        System.out.println("error:  "+e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("empty status:  "+qlist.isEmpty());
                    break;
                case 5:
                    System.out.println("size: "+qlist.size);
                    break;
                case 6:
                    System.out.println("display list element");
                    qlist.dislpay();
                    break;
                default:
                    System.out.println("wrong entry");
                    break;
            }
           
            System.out.println("do you want to continue(y or n)");
            ch=s.next().charAt(0);
        }while(ch=='Y'||ch=='y');
    }
} 
class Node{
int data;
Node next;
Node(int data){
this.data=data;
next=null;
}
}
class linkedQueue{
protected Node rear,front;
public int size;
public linkedQueue(){
front=null;
rear=null;
size=0;
}
public int dequeue(){
if(isEmpty()){
       throw new NoSuchElementException("under flow exception");
}
Node temp=front;
front=front.next;
if(front==null){
rear=null;
}
size--;
return temp.data;   
}   
public void inqueue(int item){
Node node=new Node(item);
    if(rear==null){
    front=node;
    rear=node;
    }
    else{
    rear.next=node;
    rear=node;
    }
    size++;
}
public int peek(){
if(isEmpty()){
        throw new NoSuchElementException("under flow exception");
}
    return front.data;
}
public boolean isEmpty(){
  return front==null;
}
public int getsize(){
return size;
}
public void dislpay(){
        Node temp =front;
        if (size==0) {
            System.out.println("list is empty");
            return;
        } else {
            while (temp!=rear.next) {
                System.out.println(temp.data);
                temp= temp.next;
            }
            System.out.println("--------------------------------------------------");
        }
}
}