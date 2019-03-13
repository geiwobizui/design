#自定义JDK Proxy

1、自定义一个InvocationHandler接口（用于定义代理操作）内置一个Object invoke(Object proxy,Method method,Object[] args)
        其中Object proxy 代表 代理类代理的正实对象$Proxy0
           Method method 代表 我们所要调用的某个对象正实的方法的Mehtod方法
           Object[] args 代表 方法所需的参数集 代理方法所需传递的参数
2、自定义Proxy类 此类用于生成代理的正实类 $Proxy0
        其中定义了一个object newInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h)
        ClassLoader loader 由哪个类加载对象对生成的代理对象进行加载，
        Class<?>[] interfaces 代表我们要给代理对象实现的接口，代理对象需要实现其中全部的接口，所以我们可以调用接口中所以定义的方法
        InvocationHandler h 表示动态代理对象调用方法时关联到哪个InvocationHandler对象上，并最终由其调用
        此方法内需要实现的功能：
            1、动态生成代理对象的.java文件
            2、将.java文件写到磁盘
            3、将.java编译成.class文件
            4、用jvm加载生成的.class文件
            5、返回字节码重组后的新的代理对象
3、自定义一个ClassLoader 继承了ClassLoader （定义了从内存找到class字节码，并通过它拿到构造器）
