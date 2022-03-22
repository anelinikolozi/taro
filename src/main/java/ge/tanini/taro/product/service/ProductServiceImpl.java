package ge.tanini.taro.product.service;

import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public void addProduct(String product) {
        product = product.toLowerCase().replaceAll("_", "¬").replaceAll(" ", "_");
        String query = "create table " + substring(product) + "(";
        product = remainder(product);
        while (!product.isEmpty()) {
            System.out.println(product);
            query = query + substring(product);
            product = remainder(product);
        }
        query = query.substring(0, query.length() - 2) + ");";
        System.out.println(query);
    }

    //helper for addProduct
    private String substring(String product) {
        if (product.contains("°")) {
            product = product.substring(0, product.indexOf('°'));
        }
        product = product.replaceFirst("¦", " ");
        return product.replaceFirst("¦", " default ") + ",";

    }

    //helper for addProduct
    private String remainder(String product) {
        System.out.println(product);
        if (product.contains("°")) {
            return product.substring(product.indexOf('°') + 1);
        }
        return "";
    }


    create table

    table_name
            (
                    column_1 int,
                    column_2 int,
                    column_3
                    );

}
