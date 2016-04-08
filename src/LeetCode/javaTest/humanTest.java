package LeetCode.javaTest;

public class humanTest {

    abstract class Human{
        public abstract void eat();
        public abstract void sleep();
        public abstract void beat();
    }

    class Man extends Human{

        @Override
        public void eat() {
            System.out.println("Man can eat");
        }

        @Override
        public void sleep() {
            // TODO Auto-generated method stub
            System.out.println("Man can sleep");
        }

        @Override
        public void beat() {
            // TODO Auto-generated method stub
            System.out.println("Man can beat");
        }
    }

    class Woman extends Human{

        @Override
        public void eat() {
            // TODO Auto-generated method stub
            System.out.println("Woman can eat");
        }

        @Override
        public void sleep() {
            // TODO Auto-generated method stub
            System.out.println("Woman can sleep");
        }

        @Override
        public void beat() {
            // TODO Auto-generated method stub
            System.out.println("Woman can beat");
        }
    }

    public class HumanFactory{
        public Human HumanFactory(String gender){
            Human human = null;
            if(gender.equals("man")){
                human = new Man();
            }else if(gender.equals("woman")){
                human = new Woman();
            }
            return human;
        }
    }

    public static void main(String[] args){
        humanTest ht = new humanTest();
        HumanFactory hf = ht.new HumanFactory();
        Human human = hf.HumanFactory("man");
        human.beat();
        human.eat();
        human.sleep();

    }
}

