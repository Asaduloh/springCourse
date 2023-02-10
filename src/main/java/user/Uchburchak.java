package user;

import user.Shape;

public class Uchburchak implements Shape {
    int a;
    int b;

    public Uchburchak(int a, int b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public void yuza() {
        System.out.println(a*b/2);
    }
}
