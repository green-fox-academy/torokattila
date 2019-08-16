package com.spring.webshop.controller;

import com.spring.webshop.modell.ShopItem;
import com.spring.webshop.modell.Storage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import static java.lang.Integer.parseInt;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class MainController {

  Storage list = new Storage();
  ShopItem shopItem1 = new ShopItem("Running shoes", "Clothes and Shoes", "Nike running shoes for every day sport", 1000.0, 5);
  ShopItem shopItem2 = new ShopItem("Printer", "Electronics", "Some HP printer that will print pages", 3000.0, 2);
  ShopItem shopItem3 = new ShopItem("Coca cola", "Beverages and snacks", "0.5l standard coke", 25.0, 0);
  ShopItem shopItem4 = new ShopItem("Wokin", "Beverages and snacks", "Chicken with fried rice and WOKIN sauce", 119.0, 100);
  ShopItem shopItem5 = new ShopItem("T-shirt", "Clothes and Shoes", "Blue with a corgi on a bike", 300.0, 1);

  public void table() {
    list.addToList(shopItem1);
    list.addToList(shopItem2);
    list.addToList(shopItem3);
    list.addToList(shopItem4);
    list.addToList(shopItem5);
  }

  @GetMapping(value="/webshop")
  public String tableItems(Model model) {
    list.getStorage().clear();
    table();
    List<ShopItem> allItems = list.getStorage();
    model.addAttribute("list", allItems);
    return "index";
  }

  @GetMapping(value="")
  public String main(Model model) {
    list.getStorage().clear();
    table();
    List<ShopItem> allItems = list.getStorage();
    model.addAttribute("list", allItems);
    return "index";
  }

  @GetMapping("/only-available")
  public String availableItems(Model model) {
    list.getStorage().clear();
    table();
    List<ShopItem> availableItems = list.getStorage().parallelStream()
            .filter(x -> x.getQuantityOfStock() > 0)
            .collect(Collectors.toList());
    model.addAttribute("list", availableItems);
    return "index";
  }

  @GetMapping("/cheapest-first")
  public String cheapestFirst(Model model) {
    list.getStorage().clear();
    table();
    List<ShopItem> cheapestItems = list.getStorage().parallelStream()
            .sorted(Comparator.comparingDouble(list -> list.getPrice()))
            .collect(Collectors.toList());
    model.addAttribute("list", cheapestItems);
    return "index";
  }

  @GetMapping("/contains-nike")
  public String containsNike(Model model) {
    list.getStorage().clear();
    table();
    List<ShopItem> containsNike = list.getStorage().parallelStream()
            .filter(x -> x.getName().toLowerCase().contains("nike") || x.getDescription().toLowerCase().contains("nike"))
            .collect(Collectors.toList());
    model.addAttribute("list", containsNike);
    return "index";
  }

  @GetMapping("/average-stock")
  public String averageStock(Model model) {
    list.getStorage().clear();
    table();
    double average = list.getStorage().parallelStream()
            .mapToDouble(number -> number.getQuantityOfStock())
            .average()
            .getAsDouble();
    model.addAttribute("average", average);
    return "average";
  }

  @GetMapping("/most-expensive")
  public String mostExpensive(Model model) {
    list.getStorage().clear();
    table();
    double max = list.getStorage().parallelStream()
            .mapToDouble(number -> number.getPrice())
            .max()
            .getAsDouble();

    String mostExpensiveItem = list.getStorage().parallelStream()
            .filter(x -> x.getPrice() == max)
            .collect(Collectors.toList())
            .get(0).getName();
    model.addAttribute("average", "The most expensive item: " + mostExpensiveItem);
    return "average";
    }

  @PostMapping("/search")
  public String search(Model model, @RequestParam("searchtext") String searchText) {
    list.getStorage().clear();
    table();
    List<ShopItem> searchItem = list.getStorage().parallelStream()
            .filter(x -> x.getDescription().toLowerCase().contains(searchText.toLowerCase()) || x.getName().toLowerCase().contains(searchText.toLowerCase()))
            .collect(Collectors.toList());
    model.addAttribute("list", searchItem);
    return "index";
  }

  @GetMapping({"/more-filters", "/price-in-original"})
  public String tableFilterItems(Model model) {
    list.getStorage().clear();
    table();
    List<ShopItem> allItems = list.getStorage();
    model.addAttribute("list", allItems);
    return "more";
  }

  @RequestMapping("/filter-by-type")
  public String clothesAndShoes(Model model, @RequestParam("filter") String filter) {
    list.getStorage().clear();
    table();
    List<ShopItem> clothesFilter = list.getStorage().parallelStream()
            .filter(x -> x.getType().equals(filter.replace('+', ' ')))
            .collect(Collectors.toList());
    model.addAttribute("list", clothesFilter);
    return "more";
  }

  @RequestMapping("/price-in-euro")
  public String priceInEuro(Model model) {
    list.getStorage().clear();
    table();
    List<ShopItem> priceInEuro = list.getStorage().parallelStream()
            .map(x -> x.clone().changePrice(0.0387))
            .collect(Collectors.toList());
    model.addAttribute("list", priceInEuro);
    return "more";
  }

  @RequestMapping("/filter-by-price")
  public String priceFilter(Model model, @RequestParam("searchprice") String searchprice, @RequestParam("pricefilter") String pricefilter) {
    list.getStorage().clear();
    table();
    List<ShopItem> searchPrice = new ArrayList<>();

    if (pricefilter.equals("Above")) {
      searchPrice = list.getStorage().parallelStream()
              .filter(x -> x.getPrice() > parseInt(searchprice))
              .collect(Collectors.toList());
    } else if (pricefilter.equals("Below")) {
      searchPrice = list.getStorage().parallelStream()
              .filter(x -> x.getPrice() < parseInt(searchprice))
              .collect(Collectors.toList());
    } else if (pricefilter.equals("Exactly")) {
      searchPrice = list.getStorage().parallelStream()
              .filter(x -> x.getPrice() == parseInt(searchprice))
              .collect(Collectors.toList());
    }
    model.addAttribute("list", searchPrice);
    return "more";
  }
}
