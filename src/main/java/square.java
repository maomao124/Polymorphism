/**
 * Project name(项目名称)：多态
 * Package(包名): PACKAGE_NAME
 * Class(类名): square
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/11
 * Time(创建时间)： 22:18
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class square extends Figure
{

    square(double d1, double d2)
    {
        super(d1, d2);
    }

    double area()
    {
        if (super.dim1 == super.dim2)
        {
            System.out.println("正方形的面积：");
            return super.dim1 * 4;
        }
        else
        {
            System.out.println("错误！！");
            return 0.0;
        }
    }
}
