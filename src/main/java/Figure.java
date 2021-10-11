/**
 * Project name(项目名称)：多态
 * Package(包名): PACKAGE_NAME
 * Class(类名): Figure
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/11
 * Time(创建时间)： 22:12
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Figure
{
    double dim1;
    double dim2;

    Figure(double d1, double d2)
    {
        // 有参的构造方法
        this.dim1 = d1;
        this.dim2 = d2;
    }

    double area()
    {
        // 用于计算对象的面积
        System.out.println("父类中计算对象面积的方法，没有实际意义，需要在子类中重写。");
        return 0;
    }
}
