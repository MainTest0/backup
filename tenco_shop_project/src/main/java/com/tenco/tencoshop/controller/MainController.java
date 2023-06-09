package com.tenco.tencoshop.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tenco.tencoshop.repository.model.Product;
import com.tenco.tencoshop.service.ProductService;

@Controller
@RequestMapping("/")
public class MainController {

   @Autowired
   private HttpSession session;
   
   @Autowired
   private ProductService productService;
   
   @GetMapping("/main")
   public String mainTest(Model model) {
//      List<Product> list =  productService.readProduct();
//      model.addAttribute("list", list);
      return "layout/main";
   }
   
   // 寃��깋 �럹�씠吏�
         //�뙆�떛 湲곗닠
         
         @GetMapping("/search")
         public String search() {

            return "/user/search";
         }
         
         @GetMapping("/search-proc")
         public String searchProduct(@RequestParam String prodName, Model model) {
            List<Product> list = productService.searchProduct(prodName);
            if(list.isEmpty()) {
               model.addAttribute("list",null);
            } else {
               model.addAttribute("list",list);
            }
            return "/user/searchProc";
         }
   
}