package it.partec.ocpapp.healthcheck.models;

import lombok.Data;

@Data
public class People {

    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    public People(String id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return "People{" + "id=" +id + '\''  + ", name =" + name + "}";
    }
}
