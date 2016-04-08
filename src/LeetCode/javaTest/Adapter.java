package LeetCode.javaTest;

public class Adapter {
    public interface EnPluginInterface{
        public void chargeWith3();
    }

    public class EnPlugin implements EnPluginInterface{

        @Override
        public void chargeWith3() {
            // TODO Auto-generated method stub
            System.out.println("charge with EnPlugin");
        }
    }

    public class Home{
        private EnPluginInterface enPlugin;
        public Home(){}

        public Home(EnPluginInterface enPlugin){
            this.enPlugin = enPlugin;
        }
        public void setPlugin(EnPluginInterface enPlugin){
            this.enPlugin = enPlugin;
        }

        public void charge(){
            enPlugin.chargeWith3();
        }
    }

    public static void main(String[] args){
        Adapter a = new Adapter();
        //EnPluginInterface enPlugin = a.new EnPlugin();
        //Home home = a.new Home(enPlugin);
        //home.charge();
        CnPluginInterface cnPlugin = a.new CnPlugin();
        Home home = a.new Home();
        PluginAdapter pa = a.new PluginAdapter(cnPlugin);
        home.setPlugin(pa);
        home.charge();
    }

    public interface CnPluginInterface{
        public void chargeWith2();
    }
    public class CnPlugin implements CnPluginInterface{

        @Override
        public void chargeWith2() {
            // TODO Auto-generated method stub
            System.out.println("charge with cnPlugin");
        }
    }

    public class PluginAdapter implements EnPluginInterface{

        private CnPluginInterface cnPlugin;

        public PluginAdapter(CnPluginInterface cnPlugin){
            this.cnPlugin = cnPlugin;
        }
        @Override
        public void chargeWith3() {
            // TODO Auto-generated method stub
            cnPlugin.chargeWith2();
        }
    }


}
