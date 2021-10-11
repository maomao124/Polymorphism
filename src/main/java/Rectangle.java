/**
 * Project name(项目名称)：多态
 * Package(包名): PACKAGE_NAME
 * Class(类名): Rectangle
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/11
 * Time(创建时间)： 22:16
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Rectangle extends Figure
{

    Rectangle(double d1, double d2)
    {
        super(d1, d2);
    }

    double area()
    {
        System.out.println("三角形的面积：");
        return super.dim1 * super.dim2 / 2;
    }
}
