package principle.ocp.improve;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/20 19:35
 * @description： 开闭原则
 */
public class Demo {

    public static void main(String[] args) {
        GraphicEditor editor = new GraphicEditor();
        editor.drawShape(new Rectangle());
        editor.drawShape(new Circle());
    }


}


class GraphicEditor{
    public void drawShape(Shape r){
        r.draw();
    }

    public void drawRectangle(Shape r){
        System.out.println("矩形");
    }

    public void drawCircle(Shape r){
        System.out.println("圆形");
    }
}

abstract class Shape{
    int type;

    public abstract void draw();
}

class Rectangle extends Shape {
    Rectangle(){
        super.type = 1;
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle extends Shape {
    Circle(){
        super.type = 2;
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}
