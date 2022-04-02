package cn.xaut.edu.factory.simplefactory.pizzstore.order;

import cn.xaut.edu.factory.simplefactory.pizzstore.CheesePizza;
import cn.xaut.edu.factory.simplefactory.pizzstore.GreekPizza;
import cn.xaut.edu.factory.simplefactory.pizzstore.Pizza;

import java.util.Scanner;

/**
 * @author mr
 */
public class OrderPizza {
  /** 构造器 */
  public OrderPizza() {
    Pizza pizza = null;
    // 订购披萨的类型
    String orderType;
    do {
      orderType = OrderPizza.getType();
      String greek = "greek";
      String cheese = "cheese";
      if (greek.equals(orderType)) {
        pizza = new GreekPizza();
      } else if (cheese.equals(orderType)) {
        pizza = new CheesePizza();
      } else {
        break;
      }
    } while (true);
  }
  /** 写一个方法，可以动态获取客户希望订购的披萨种类 */
  public static String getType() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入Pizza的种类:");
    return scanner.nextLine();
  }
}
