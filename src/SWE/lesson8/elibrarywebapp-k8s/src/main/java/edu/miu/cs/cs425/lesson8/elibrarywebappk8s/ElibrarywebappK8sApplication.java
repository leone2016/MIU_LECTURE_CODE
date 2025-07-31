import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ElibrarywebappK8sApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElibrarywebappK8sApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            System.out.println("Starting the eLibrary webapp...");
            System.out.println("eLibrary webapp started");
            System.out.println("For homepage, go to http://localhost:8080/elibrary/home");
        };
    }

}
