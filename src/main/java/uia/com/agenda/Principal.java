package uia.com.agenda;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication

public class Principal {

    public static void main(String[] args) throws IOException {

        System.out.println("Hola UIA");
        //Contacto(int id, String name, String fecha, String email, String telefono) {
        Contacto contacto1 = new Contacto(1, "alfoso", "11-11-2022", "alfonso@gmail.com", "555555555");
        Evento evento1 = new Evento("cita", "15-12-2022");
        Evento evento2 = new Evento("congreso", "16-12-2022");
        contacto1.getItems().add(evento1);
        contacto1.getItems().add(evento2);
        Contacto contacto2 = new Contacto(1, "alberto", "12-12-2022", "alberto@gmail.com", "66666666");
        Evento evento3 = new Evento("simposium", "05-01-2023");
        Evento evento4 = new Evento("partida de rosca", "06-01-2023");
        contacto2.getItems().add(evento3);
        contacto2.getItems().add(evento4);
        Agenda agenda = new Agenda();
        agenda.getItems().add(contacto1);
        agenda.getItems().add(contacto2);
        agenda.serializa();
        SpringApplication.run(Principal.class, args);
    }

}
