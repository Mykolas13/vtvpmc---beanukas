package pagrindinis;

public class BeanA {

        BeanB binukas;


    public void setBinukas(BeanB binukas) {
        this.binukas = binukas;
    }

    public BeanB getBinukas() {

        return binukas;
    }

    public BeanA() {

        System.out.println("Print BeanA");
    }
    public void print(){

       binukas.print();
    }
}
