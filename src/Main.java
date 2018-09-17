
public class Main {
    public static void main(String[] args) {
        // 组合模式，可以肚子里装很多自己和别人，肚子里的自己还能装别人和自己
        // 从前有座山，山里有座庙，庙里有两个小和尚，它们在听老和尚讲故事，讲的故事是
        // 从前有座山，山里有做庙，庙里有个小和尚，它在谈恋爱，老和尚非要给他讲故事，讲的故事是
        // 从前有座山，山里有座庙，庙里有个小和尚和小尼姑，他俩把故事讲完啦
        interfacemode.composite.Client.testComposite();
        // 桥接模式,我的体积和身高关系不大
        // 长得丑是一回事，长得矮是另一回事
        // 组合起来就是又矮又丑，又高又丑，又高又帅，又矮又帅，我好丑的说
        interfacemode.bridge.Client.testBridge();
        // 责任链模式.->击鼓传花
        // 我老公昨天晚上下了个鸡蛋 -> 你听说了吗，她老公昨天下了一筐鸡蛋 ->
        // 你听说了吗，她老公昨天晚上蛋都碎了 -> ... -> 阿，我问问她老公怎么回事
        interfacemode.responsibility.ChainPatternDemo.test();
        // 观察者模式
        // 一个对象可以有多个观察者(男朋友),对象生气了，它们都会去哄一下;
        // 对象太多了以后，可能会引起服务器崩溃(死循环)，比如陆晗事件;
        // 对象的男朋友生气了，她就扇他一巴掌。(说好的男女平等呢)
        // 对象如果只有一个观察者，而且它们关系比较铁(需求稳定)，
        // 没有第三者(需求改变)，就让它们成为一家人，不要出来祸害别人了(少写一个类)
        interfacemode.observer.ObserverPatternDemo.test();
        // 
    }
}
