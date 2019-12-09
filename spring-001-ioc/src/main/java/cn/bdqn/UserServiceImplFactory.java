package cn.bdqn;

// 创建对象的
public class UserServiceImplFactory {

    // 定义方法，作用：提供对象的
    /*
    public UserServiceImpl createUserService(){
        return new UserServiceImpl();
    }**/

    // 工厂提供的静态方法创建对象
    public static UserServiceImpl createUserService(){
        return new UserServiceImpl();
    }
}
