package LeetCode.javaTest;

public class Eat {
    public interface KitchenFactory{
        Food getFood();
        TableWare getTableWare();
    }

    public interface Food{
        String getFoodName();
    }
    public interface TableWare{
        String getTableWareName();
    }

    public class Apple implements Food{

        @Override
        public String getFoodName() {
            // TODO Auto-generated method stub
            return "apple";
        }

    }
    public class Knife implements TableWare{

        @Override
        public String getTableWareName() {
            // TODO Auto-generated method stub
            return "knife";
        }
    }

    public class Akitchen implements KitchenFactory{

        @Override
        public Food getFood() {
            // TODO Auto-generated method stub
            return new Apple();
        }

        @Override
        public TableWare getTableWare() {
            // TODO Auto-generated method stub
            return new Knife();
        }
    }

    public static void main(String[] args){
        Eat eat = new Eat();
        KitchenFactory ak = eat.new Akitchen();
        System.out.println(ak.getFood().getFoodName());
        System.out.println(ak.getTableWare().getTableWareName());
    }
}
