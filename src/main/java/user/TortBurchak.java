package user;

import user.Shape;

public class TortBurchak implements Shape {

    int a;
    int b;

    public TortBurchak(int a, int b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public void yuza() {
        System.out.println(a*b);
    }
}
