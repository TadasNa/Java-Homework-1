package edu;

import ChristmasShopping.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) throws IOException {
        Item car = new Item("Car", 10);
        Item book = new Item("Book", 22);
        Item shoes = new Item("Shoes", 10);
        Item table = new Item("Table", 55);
        Item computer = new Item("Computer", 120);

        ShoppingBag shoppingBag = new ShoppingBag();
        shoppingBag.addItem(car);
        shoppingBag.addItem(book);
        shoppingBag.addItem(shoes);
        shoppingBag.addItem(table);
        shoppingBag.addItem(computer);

        Item car1 = new Item("Car", 10);
        Item book1 = new Item("Book", 22);
        Item shoes1 = new Item("Shoes", 10);
        Item table1 = new Item("Table", 55);
        Item computer1 = new Item("Computer", 120);

        ShoppingBag shoppingBag1 = new ShoppingBag();
        shoppingBag1.addItem(car1);
        shoppingBag1.addItem(book1);
        shoppingBag1.addItem(shoes1);
        shoppingBag1.addItem(table1);
        shoppingBag1.addItem(computer1);

        Shop shop = new Shop("Edvinas Shop", shoppingBag);
        Shop shop1 = new Shop("Edvinas1 Shop", shoppingBag1);

        ShoppingList shoppingList = new ShoppingList();
        shoppingList.addShop(shop);
        shoppingList.addShop(shop1);

        System.out.println(shoppingList.returnFullPrice());

        writeToJson(shoppingList);

    }
    public static void writeToJson(ShoppingList shoppingList) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        // ObjectMapper paima bet koki elementa ir gali irasyt i json
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(shoppingList);
        FileWriter myWriterr = new FileWriter("shoppingList.json");
        myWriterr.write(json);
        myWriterr.close();
    }
}
