package less6.oop.polymorphism;

public class ParentClass {
       public void parentMethod(int i) {
            System.out.println("parentMethod ParentClass" + i);
        }
    }
      class ChildClass extends ParentClass{
        public void parentMethod(int i) {
            System.out.println("parentMethod ChildClass" + i);
        }
        public void childMethod(int i) {
            System.out.println("childMethod ChildClass" + i);
        }

        public static void main(String args[]) {
            ParentClass quest = new ChildClass ();   // 1
            quest.parentMethod(1);   // 2
           //quest.childMethod(1);   // 3
        }
    }

