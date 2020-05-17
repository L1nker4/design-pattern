package factory.simplefactory;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/15 17:25
 * @description： 简单工厂模式
 */
public class SimpleFactory {

    public  <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}

