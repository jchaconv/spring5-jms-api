package expert.springframework.spring5jmsapi;

//import org.apache.activemq.artemis.core.config.impl.ConfigurationImpl;
//import org.apache.activemq.artemis.core.server.ActiveMQServer;
//import org.apache.activemq.artemis.core.server.ActiveMQServers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring5JmsApiApplication {

    public static void main(String[] args) throws Exception {

        //Se comenta para probar desde una imagen docker y ya no de manera embebida
        /*ActiveMQServer server = ActiveMQServers.newActiveMQServer(new ConfigurationImpl()
                .setPersistenceEnabled(false)
                .setJournalDirectory("target/data/journal")
                .setSecurityEnabled(false)
                .addAcceptorConfiguration("invm", "vm://0"));

        server.start();*/

        SpringApplication.run(Spring5JmsApiApplication.class, args);

    }

}
