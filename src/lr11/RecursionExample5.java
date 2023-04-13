package lr11;

public class RecursionExample5 {
    public static void main(String[] args) {
        //InnerRecursionExample5 tree=new InnerRecursionExample5();
        MyNode<Integer> tree=new MyNode<Integer>();
        //System.out.println(fib(3,tree));
        tree.setData(fib(5, tree));
        

    }

    public static int fib(int i,MyNode<Integer> tree) {
        int fib1;
        int fib2;
        if (i==0) {
            tree.setChild1(new MyNode<Integer>(0));
            System.out.println("0 ");
            return 0;
        }else if(i==1){
            tree.setChild1(new MyNode<Integer>(1));
            System.out.println("1 ");
            return 1;
        }else{
            tree.setChild1(new MyNode<Integer>());
            tree.setChild2(new MyNode<Integer> ());
            fib1=fib(i-1,tree.getChild1());
            fib2=fib(i-2,tree.getChild2());
            System.out.println(fib1+" "+fib2+" ");
            tree.getChild1().setData(fib1);
            tree.getChild2().setData(fib2);
            return fib1+fib2;
        }
    }
}

/**
 * <T>MyNode
 */ 
 class MyNode <T> {
    public MyNode(T data) {
        this.data = data;
        is_root=true;
        parent=null;
    }
    public MyNode() {
        is_root=true;
        parent=null;
        child1=null;
        child2=null;
    }

    private boolean is_root;

    public boolean isIs_root() {
        return is_root;
    }

    public void setIs_root(boolean is_root) {
        this.is_root = is_root;
    }

    MyNode <T> parent;
    
    public MyNode <T> getParent() {
        return parent;
    }

    private void setParent(MyNode <T> parent) {
        this.parent = parent;
    }

    MyNode <T> child1;
    public MyNode <T> getChild1() {
        return child1;
    }

    public void setChild1(MyNode <T> child1) {
        child1.setChild();
        this.child1 = child1;
        child1.setParent(this);
    }

    MyNode <T> child2;

    public MyNode  <T> getChild2() {
        return child2;
    }

    public void setChild2(MyNode <T> child2) {
        child2.setChild();
        this.child2 = child2;
        child1.setParent(this);
    }

    private void setChild() {
        is_root=false;
    }

    T data;

    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }  

    public boolean is_leaf() {
        if (child1==null&&child2==null) {
            return true;
        }else{
            return false;
        }
    }
}


