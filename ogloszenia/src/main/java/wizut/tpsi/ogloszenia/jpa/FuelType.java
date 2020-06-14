/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wizut.tpsi.ogloszenia.jpa;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Darlin
 */
@Entity
@Table(name = "fuel_type")
public class FuelType implements Serializable {
    
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    
    @Size(max = 30)
    @Column(name = "name")
    private String name;
    
    public void setId(Integer id){
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    
}

