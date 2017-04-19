public class MyStack {
private int maxSize;
private long[] stackArray;
private int top;
public MyStack(int v) {
maxSize = v;
stackArray = new long[maxSize];
top = -1;
}
public void push(long p) {
stackArray[++top] = p;
}
public long pop() {
return stackArray[top--];
}
public long peek() {
return stackArray[top];
}
public boolean isEmpty() {
return (top == -1);
}
public boolean isFull(){ 
return (top == maxSize - 1);
}
public static void main(String[] args) {
MyStack theStack = new MyStack(100); 
theStack.push(100);
theStack.push(200);
theStack.push(300);
while (!theStack.isEmpty()) {
long value = theStack.pop();
System.out.println(value);
System.out.println(" ");
}
System.out.println("");
}
}
