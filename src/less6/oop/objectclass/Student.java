package less6.oop.objectclass;

import less6.oop.objectclass.ObjectClass;

public class Student extends ObjectClass {
    int id;
    String name ;
    Student(int id , String name ){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return super.toString()+a+
                "/" + id +"/" + name  ;
    }
}
