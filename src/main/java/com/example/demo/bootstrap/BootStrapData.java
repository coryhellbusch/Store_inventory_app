package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if (outsourcedPartRepository.count() == 0 && productRepository.count() == 0) {
            OutsourcedPart o = new OutsourcedPart();
            o.setCompanyName("Skateboard Resource Center");
            o.setName("Grip tape");
            o.setInv(100);
            o.setPrice(4.0);
            o.setId(100L);
            o.setMinInv(0);
            o.setMaxInv(500);
            outsourcedPartRepository.save(o);

            OutsourcedPart deck = new OutsourcedPart();
            deck.setCompanyName("Skateboard Resource Center");
            deck.setName("Deck/board");
            deck.setInv(80);
            deck.setPrice(40.0);
            deck.setId(122L);
            deck.setMinInv(0);
            deck.setMaxInv(200);
            outsourcedPartRepository.save(deck);

            OutsourcedPart wheel = new OutsourcedPart();
            wheel.setCompanyName("Skateboard Resource Center");
            wheel.setName("Wheels (set of 4)");
            wheel.setInv(120);
            wheel.setPrice(20.0);
            wheel.setId(129L);
            wheel.setMinInv(0);
            wheel.setMaxInv(300);
            outsourcedPartRepository.save(wheel);

            OutsourcedPart truck = new OutsourcedPart();
            truck.setCompanyName("Skateboard Resource Center");
            truck.setName("Trucks (set of 2)");
            truck.setInv(90);
            truck.setPrice(20.0);
            truck.setId(137L);
            truck.setMinInv(0);
            truck.setMaxInv(200);
            outsourcedPartRepository.save(truck);

            OutsourcedPart bearing = new OutsourcedPart();
            bearing.setCompanyName("Skateboard Resource Center");
            bearing.setName("Bearings (set of 8)");
            bearing.setInv(160);
            bearing.setPrice(12.0);
            bearing.setId(141L);
            bearing.setMinInv(0);
            bearing.setMaxInv(400);
            outsourcedPartRepository.save(bearing);

            OutsourcedPart hardware = new OutsourcedPart();
            hardware.setCompanyName("Skateboard Resource Center");
            hardware.setName("Hardware (full set)");
            hardware.setInv(180);
            hardware.setPrice(3.0);
            hardware.setId(146L);
            hardware.setMinInv(0);
            hardware.setMaxInv(700);
            outsourcedPartRepository.save(hardware);

//            OutsourcedPart thePart=null;
//            List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
//            for(OutsourcedPart part:outsourcedParts){
//                if(part.getName().equals("Grip tape"))thePart=part;
//            }
            Product skateboard= new Product("Skateboard",115.0,5);
            productRepository.save(skateboard);

            Product longboard = new Product("Longboard", 130.0, 3);
            productRepository.save(longboard);

            Product pennyBoard = new Product("Penny board", 110.0, 5);
            productRepository.save(pennyBoard);

            Product cruiser = new Product("Cruiser", 130.0, 2);
            productRepository.save(cruiser);

            Product kidSized = new Product("Kid's board", 100.0, 6);
            productRepository.save(kidSized);
        }

//        System.out.println(thePart.getCompanyName());

//        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
//        for(OutsourcedPart part:outsourcedParts){
//            System.out.println(part.getName()+" "+part.getCompanyName());
//        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
