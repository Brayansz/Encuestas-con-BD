/**
 *
 * @author Diana
 */

package modelo;

public class Formulario {
    
    String encuestador;
    int quno, qdos, qtres, qcuatro;

    public Formulario(String encuestador, int quno, int qdos, int qtres, int qcuatro) {
        this.encuestador = encuestador;
        this.quno = quno;
        this.qdos = qdos;
        this.qtres = qtres;
        this.qcuatro = qcuatro;
    }

    public String getEncuestador() {
        return encuestador;
    }

    public void setEncuestador(String encuestador) {
        this.encuestador = encuestador;
    }

    public int getQuno() {
        return quno;
    }

    public void setQuno(int quno) {
        this.quno = quno;
    }

    public int getQdos() {
        return qdos;
    }

    public void setQdos(int qdos) {
        this.qdos = qdos;
    }

    public int getQtres() {
        return qtres;
    }

    public void setQtres(int qtres) {
        this.qtres = qtres;
    }

    public int getQcuatro() {
        return qcuatro;
    }

    public void setQcuatro(int qcuatro) {
        this.qcuatro = qcuatro;
    }
    
    
    
}
