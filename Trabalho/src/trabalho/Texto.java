package trabalho;

public class Texto {

    private int codigo;
    private String nomeObr;
    private String area;
    private int numPaginas;
    private String Editora;

    @Override
    public String toString() {
        return "Texto{" + "Codigo --> " + codigo + ", Nome da obra --> " + nomeObr + ", Área --> " + area + ", Número de páginas --> " + numPaginas + ", Editora --> " + Editora + '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeObr() {
        return nomeObr;
    }

    public void setNomeObr(String nomeObr) {
        this.nomeObr = nomeObr;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public Texto(int codigo, String nomeObr, String area, int numPaginas, String Editora) {
        this.codigo = codigo;
        this.nomeObr = nomeObr;
        this.area = area;
        this.numPaginas = numPaginas;
        this.Editora = Editora;
    }
  @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Texto other = (Texto) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }
     @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.codigo;
        return hash;
    }
    public String getEditora() {
        return Editora;
    }

    public void setEditora(String Editora) {
        this.Editora = Editora;
    }

}
