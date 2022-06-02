package trabalho;

import java.util.ArrayList;
import java.util.List;

public class Relatando {

    private List<Texto> l = new ArrayList<>();

    public Relatando() {
    }

    public Relatando(ArrayList<Texto> l) {
        this.l = l;
    }

    public void preenchido() {
        for (int i = 0; i < l.size(); i++) {
            Texto t1 = new Texto(1, "Deitel: Java Como Programar", "Exatas", 1500, "Pearson");
            Texto t2 = new Texto(2, "Lógica de Programação", "Exatas", 200, "MarkBooks");
            Texto t3 = new Texto(3, "Animais do Pantanal", "Biomédicas", 500, "Bio Books");
            System.out.println(t1);
            System.out.println(t2);
            System.out.println(t3);
        }

    }
    
    public boolean add(Texto liv){
        
          return this.l.add(liv);
    }

    public void Relatorio1() {
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).getNumPaginas() > i) {
                System.out.println(l);
            }
        }

    }

    public void Relatorio2() {
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).getArea().equals("Exatas")) {

                System.out.println(l);
            } else if (l.get(i).getArea().equals("Humanas")) {

                System.out.println(l);
            } else if (l.get(i).getArea().equals("Biomédicas")) {

                System.out.println(l);
            }

        }
    }

    public void Relatorio3(String edit) {
       for(int i = 0; i < l.size(); i++){
           if(l.get(i).getEditora().equals(edit)){
               
           }
       }
    }

    public void Relatorio4() {

    }
}
