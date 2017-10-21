package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "pescodigo", sequenceName = "pescodigo",
        allocationSize = 1)
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pescodigo")
    private String pesnome;
    private String pestelefone;
    private Date pesdatanascimento;
    private String pescpfcnpj;
    private String pesemail;
    private int pesativo;
    private int pesdebitoautomatico;
    @OneToMany(mappedBy="pessoa")
    private List<TipoPessoa> tpcodigo;

    public String getPesnome() {
        return pesnome;
    }

    public void setPesnome(String pesnome) {
        this.pesnome = pesnome;
    }

    public String getPestelefone() {
        return pestelefone;
    }

    public void setPestelefone(String pestelefone) {
        this.pestelefone = pestelefone;
    }

    public Date getPesdatanascimento() {
        return pesdatanascimento;
    }

    public void setPesdatanascimento(Date pesdatanascimento) {
        this.pesdatanascimento = pesdatanascimento;
    }

    public String getPescpfcnpj() {
        return pescpfcnpj;
    }

    public void setPescpfcnpj(String pescpfcnpj) {
        this.pescpfcnpj = pescpfcnpj;
    }

    public String getPesemail() {
        return pesemail;
    }

    public void setPesemail(String pesemail) {
        this.pesemail = pesemail;
    }

    public int getPesativo() {
        return pesativo;
    }

    public void setPesativo(int pesativo) {
        this.pesativo = pesativo;
    }

    public int getPesdebitoautomatico() {
        return pesdebitoautomatico;
    }

    public void setPesdebitoautomatico(int pesdebitoautomatico) {
        this.pesdebitoautomatico = pesdebitoautomatico;
    }

    public List<TipoPessoa> getTpcodigo() {
        return tpcodigo;
    }

    public void setTpcodigo(List<TipoPessoa> tpcodigo) {
        this.tpcodigo = tpcodigo;
    }
    
    
}
