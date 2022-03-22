package ge.tanini.taro.product.controller;

import ge.tanini.taro.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Vector;

@RestController
@RequestMapping("product")
public class ProductController {
    ProductService productService;
    @Autowired
    ProductController (ProductService productService){
        this.productService=productService;
    }


    @PostMapping("add")
    public List<Character> addProduct(@RequestParam String product){
        productService.addProduct(product);
        ¥¥¥¥
}
