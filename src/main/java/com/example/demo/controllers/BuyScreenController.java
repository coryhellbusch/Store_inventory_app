package com.example.demo.controllers;

import com.example.demo.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.service.ProductService;
import java.util.Optional;

@Controller
public class BuyScreenController {
    @Autowired
    private ProductService productService;

    @GetMapping("/buyProduct")
    public String buyProduct(@RequestParam("productID") int productID, Model model) {
        Product product = productService.findById(productID);

        if (product.getInv() > 0) {
            product.setInv(product.getInv() - 1);
            productService.save(product);
            return "redirect:/purchaseSuccessful()";
        }
        else {
            return"redirect:/purchaseIncomplete";
        }

    }
    @GetMapping("/purchaseSuccessful")
    public String purchaseSuccessful() {
        return "purchaseSuccessful";
    }

    @GetMapping("/purchaseIncomplete")
    public String purchaseIncomplete() {
        return "purchaseIncomplete";
    }
}
