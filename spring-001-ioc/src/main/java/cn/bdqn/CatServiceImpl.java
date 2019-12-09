package cn.bdqn;

public class CatServiceImpl {

    public CatServiceImpl(){
        System.out.println("对象创建啦啦");
    }

    public void init(){
        System.out.println("---init初始化---");
    }

    public void destroy(){
        System.out.println("----destroy销毁-----");
    }


}
