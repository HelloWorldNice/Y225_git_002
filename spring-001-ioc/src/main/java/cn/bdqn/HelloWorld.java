package cn.bdqn;

public class HelloWorld {

    private String name;

    public HelloWorld() {
        System.out.println("HelloWorld对象创建啦");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void info(){
        System.out.println(name + ",HelloWorld!");
    }
}
