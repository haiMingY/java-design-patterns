/**
 * Singleton
 */
public class Singleton {
    /**
     * 内部类，也是静态成员式的内部类，该内部类的实例与外部实例没有
     * 任何绑定关系，而且只有被调用时才会装载，从而实现延迟加载
     */
    private static class SingletonHolder {
        // 静态化初始容器 有jvm 保证线程安全
        private static Singleton instance = new Singleton();
    }

    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }

}