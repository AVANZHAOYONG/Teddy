##策略模式：
定义了算法族，分别封装起来，让他们之间可以互相替换，
此模式让算法的变化独立于使用算法的客户

##原则
1、把会变化的部分取出来并封装起来，以便以后可以轻易地改动或扩充此部分（将fly，quack抽离出来）。
2、针对接口编程，而不是针对实现编程（接口作为依赖放在absduck类中）
3、多用组合，少用继承（将fly、quack接口组合至duck中）

详见：本项目videos dp strategy demo2