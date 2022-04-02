package cn.xaut.edu.factory.simplefactory.pizzstore;

/**
 * @author mr
 */
public class GreekPizza extends Pizza {
  public GreekPizza() {}

  @Override
  public void prepare() {
    System.out.println("给希腊披萨准备原材料");
  }
}
