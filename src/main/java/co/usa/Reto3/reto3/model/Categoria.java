package co.usa.Reto3.reto3.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="categoria")
public class Categoria implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "categoria")
    @JsonIgnoreProperties("categoria")
    public List<Papeleria> papelerias;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Papeleria> getPapelerias() {
        return papelerias;
    }

    public void setPapelerias(List<Papeleria> papelerias) {
        this.papelerias = papelerias;
    }




    
}
