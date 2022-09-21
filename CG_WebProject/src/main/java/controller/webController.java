package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import service.productService;

@Controller
public class webController {

	@Autowired
	productService product;

	@RequestMapping("/addProduct")
	public String addProduct(@RequestParam String productName, @RequestParam Integer productPrice) {
		boolean res = product.addProduct(productName, productPrice);
		if (res == true)
			return "success";
		else
			return "failure";
	}

	@RequestMapping("/success")
	public String welcome() {
		return "success";
	}

	@RequestMapping("/failure")
	public String error() {
		return "failure";
	}
}