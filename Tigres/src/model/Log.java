package model;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "logcodigo", sequenceName = "logcodigo",
        allocationSize = 1)
public class Log implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "logcodigo")
    private int logcodigo;
    private String logoperacao;
    private String logtabela;
    private String logdescricao;
    private Date logdata;
    private Time loghora;
    @OneToMany(mappedBy = "log")
    private List<Usuario> usucod;

    public int getLogcodigo() {
        return logcodigo;
    }

    public void setLogcodigo(int logcodigo) {
        this.logcodigo = logcodigo;
    }

    public String getLogoperacao() {
        return logoperacao;
    }

    public void setLogoperacao(String logoperacao) {
        this.logoperacao = logoperacao;
    }

    public String getLogtabela() {
        return logtabela;
    }

    public void setLogtabela(String logtabela) {
        this.logtabela = logtabela;
    }

    public String getLogdescricao() {
        return logdescricao;
    }

    public void setLogdescricao(String logdescricao) {
        this.logdescricao = logdescricao;
    }

    public Date getLogdata() {
        return logdata;
    }

    public void setLogdata(Date logdata) {
        this.logdata = logdata;
    }

    public Time getLoghora() {
        return loghora;
    }

    public void setLoghora(Time loghora) {
        this.loghora = loghora;
    }

    public List<Usuario> getUsucod() {
        return usucod;
    }

    public void setUsucod(List<Usuario> usucod) {
        this.usucod = usucod;
    }
}
