#设计模式之委派模式（Delegate）

##简介
委派模式（Delegate Pattern）的基本作用：
    负责任务的调用和分配任务，更代理模式很像，可以看做一种特殊情况下的静态代理的全权代理
    但是代理模式注重过程，而委派模式注重结果。
spring中的应用：
    DispatcherServlet等   在spring源码中，只要以Delegate结尾的都是实现了委派模式（如BeanDefinitionParserDelegate根据不同类型委派不同的逻辑解析BeanDefinition）
    Boss分配任务案例：（单例+委派）
        Boss类（客户请求 给出任务）只知道是Leader在做、Leader类（委派者 分配任务调度）、Target（Employee被委派者）
        Boss类持有 void announce(String command, Leader leader) 把任务给 leader
        Leader类持有 void excute(String commond)  把任务的调度分配给 各个Employee  
            Leader作为委派者 还需持有被委派者的引用（此处用注册单例的形式把被委派者的引用注册到Map中，以commond为Key来进行分配）
        Employee类同样持有 void excute(String commond) 用于完成任务
    策略模式注重的是可扩展（外部扩展），委派模式注重内部的灵活和复用
    委派的核心：分发、调度、派遣
    委派模式：静态代理和策略模式的一种特殊的组合   
