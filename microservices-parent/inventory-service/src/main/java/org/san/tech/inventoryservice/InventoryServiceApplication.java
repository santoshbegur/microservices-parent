package org.san.tech.inventoryservice;

import org.san.tech.inventoryservice.model.Inventory;
import org.san.tech.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }
    @Bean
    public CommandLineRunner loadData(InventoryRepository inventoryRepository){
        return args -> {
            Inventory inventory = new Inventory();
            inventory.setSkuCode("iphone 13");
            inventory.setQuantity(100);
            inventoryRepository.save(inventory);

            Inventory inventory1 = new Inventory();
            inventory1.setSkuCode("iphone 13 Red");
            inventory1.setQuantity(0);
            inventoryRepository.save(inventory1);

            Inventory inventory2 = new Inventory();
            inventory2.setSkuCode("Redmi Note 7 Pro");
            inventory2.setQuantity(10);
            inventoryRepository.save(inventory2);

        };
    }
}