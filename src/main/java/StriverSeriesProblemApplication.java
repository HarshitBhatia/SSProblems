package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sorting.SelectionSort;

@SpringBootApplication
public class StriverSeriesProblemApplication {

    public static void main(String[] args) {
        SpringApplication.run(StriverSeriesProblemApplication.class, args);
        SelectionSort.main(null);
    }

}
