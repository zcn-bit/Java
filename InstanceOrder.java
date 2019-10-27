
    class AA {
        int a = initA();
        private int initA() {
            System.out.println("AA 初始化 a");
            return 0;
        }
        {
            System.out.println("AA 的构造代码块");
        }
        AA(int x) {
            System.out.println("AA 的构造方法");
        }
    }

    class BB extends AA {
        int b = initB();
        private int initB() {
            System.out.println("BB 初始化 b");
            return 0;
        }
        {
            System.out.println("BB 的构造代码块");
        }
        BB(int x) {
            super(x);//子类的有参构造调用父类的构造方法。super出现在第一行
            System.out.println("BB 的有参构造方法");
        }
        BB() {
            this(100);//再执行自己的无参构造，this调用本类
            System.out.println("BB 的无参构造方法");
        }
    }


    public class InstanceOrder {

        public static void main(String[] args) {
            new BB();
        }

    }


