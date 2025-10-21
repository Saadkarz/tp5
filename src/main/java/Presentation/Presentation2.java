package Presentation;

import dao.IDao;
import entities.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import util.HibernateConfig;

public class Presentation2 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);

        IDao<Product> productDao = context.getBean(IDao.class);

        Product product = new Product();
        product.setName("Produit 3");
        product.setPrice(300);

        productDao.create(product);

        System.out.println("Produit sauvegardé : " + product.getName() + "  avec prix : " + product.getPrice());
    }
}
