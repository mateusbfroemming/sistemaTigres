package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "tpcodigo", sequenceName = "tpcodigo",
        allocationSize = 1)
public class TipoPessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tpcodigo")
    private String tpdescricao;

    public String getTpdescricao() {
        return tpdescricao;
    }

    public void setTpdescricao(String tpdescricao) {
        this.tpdescricao = tpdescricao;
    }
    
}
