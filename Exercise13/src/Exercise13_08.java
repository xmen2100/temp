import java.util.ArrayList;

public class Exercise13_08 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        try {
            MyStack stackClone = (MyStack)stack.clone();
            System.out.println(stack.getList() == stackClone.getList());
            System.out.println(stack);
            System.out.println(stackClone);
        }
        catch (CloneNotSupportedException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

class MyStack implements Cloneable {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        list.add(o);
    }

    public ArrayList<Object> getList() {
        return list;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        try {
            MyStack stackClone = (MyStack)super.clone();
            stackClone.list = (ArrayList<Object>) list.clone();

            return stackClone;
        }
        catch (CloneNotSupportedException ex) {
            throw new CloneNotSupportedException("did not implement Cloneable");
        }
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }
}
