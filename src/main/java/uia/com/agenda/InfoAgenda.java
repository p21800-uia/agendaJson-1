package uia.com.agenda;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.ArrayList;
import java.util.List;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Agenda.class, name = "agenda"),
        @JsonSubTypes.Type(value = Contacto.class, name = "contacto"),
        @JsonSubTypes.Type(value = Evento.class, name = "evento"),
        @JsonSubTypes.Type(value = Recordatorio.class, name = "recordatorio")
})


public class InfoAgenda {
    private int id;
    private String name="";
    private String fecha="";
    private List<InfoAgenda> items = new ArrayList<InfoAgenda>();

    public InfoAgenda(int id, String name, String fecha) {
        this.id = id;
        this.name = name;
        this.fecha = fecha;
    }

    public InfoAgenda() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public List<InfoAgenda> getItems() {
        return items;
    }

    public void setItems(List<InfoAgenda> items) {
        this.items = items;
    }
}
