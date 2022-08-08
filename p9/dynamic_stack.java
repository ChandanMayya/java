package p9;

public class dynamic_stack implements stk_intrfc{
    private char[] data;
    private int top;

    public void push(char ch){
        if(isFull()){
            System.out.println("Stack Full");
            return;
        }
        top++;
        data[top]=ch;
    }
    public char pop(){
        if(isEmpty()){
            System.out.println("Stack Empty");
            return (char) 0;
        }
        top--;
        return data[top];
    }
    public boolean isEmpty(){
        return top==0;
    }
    public boolean isFull(){
        return top==data.length;
    }
}
