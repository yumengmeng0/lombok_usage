import lombok.*;

import java.util.Date;

/**
 * @RequiredArgsConstructor 会生成没有复制的final类型生产构造函数, 且这个final必须
 * 被@nonNull 修饰，不能与无参构造的注解同时存在
 */
@Setter
@Getter
@NoArgsConstructor  // 生成无参的构造函数
@AllArgsConstructor // 生成带参构造函数

@ToString // 重写tostring方法
@EqualsAndHashCode // 表示重写equal和hashcode方法，默认是对所有的属性，用exclude参数来排除，of参数指明包含的
// @EqualsAndHashCode(of = {"name","id}) 表示只需要id和name一样，则两个对象就是一样的
/**
 @ToString(exclude ={"phone"} )  排除哪些
 @ToString(of = {"name"})  包含哪些
 */
public class User {
    /**
     * 注意细节点： 1、final属性只有get方法，不会有set方法
     * 2、 静态变量不会有get、set方法
     */

    @Setter(AccessLevel.PROTECTED) // 设置后编译的set方法是私有的
    private int id;

    private final String name = "llp";

    private String email;

    private String phone;

    private String pwd;

    private Date createTime;

    private void login(@NonNull String pwd) {
        // TODO    // 加入注解后可以省略后面的判断

//        if(pwd!=null){
//            // something to do
//        }else {
//            throw new NullPointerException();
//        }


    }
}