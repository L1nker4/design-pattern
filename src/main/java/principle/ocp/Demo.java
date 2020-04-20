package principle.ocp;


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
        if (r.type == 1){
            drawRectangle(r);
        }else if (r.type == 2){
            drawCircle(r);
        }
    }

    public void drawRectangle(Shape r){
        System.out.println("矩形");
    }

    public void drawCircle(Shape r){
        System.out.println("圆形");
    }
}

/**
 * 如果添加三角形，需要修改Editor代码
 */
class Shape{
    int type;
}

class Rectangle extends Shape{
    Rectangle(){
        super.type = 1;
    }
}

class Circle extends Shape{
    Circle(){
        super.type = 2;
    }
}
