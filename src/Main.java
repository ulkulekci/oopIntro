public class Main {

    public static void main(String[] args) {
        Product product1 = new Product(); //referans oluşturma, intance
        product1.id =1;
        product1.name ="Lenovo v14";
        product1.unitPrice = 15000;
        product1.detail = "16 GB ram";

        Product product2 = new Product(); //referans oluşturma, intance
        product2.id =2;
        product2.name ="Lenovo v15";
        product2.unitPrice = 16000;
        product2.detail = "32 GB ram";

        Product product3 = new Product(); //referans oluşturma, intance
        product3.id =3;
        product3.name ="Hp 5";
        product3.unitPrice = 10000;
        product3.detail = "8 GB ram";

        Product[] products = {product1,product2,product3};
        for (Product product : products) {
            System.out.println(product.name);
        }
        System.out.println(products.length);






  }
}
