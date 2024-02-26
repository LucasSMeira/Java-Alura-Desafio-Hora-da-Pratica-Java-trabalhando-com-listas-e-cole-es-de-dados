import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        Pessoa fax = new Pessoa("Fax", 20);
        Pessoa Rheider = new Pessoa("Rheider", 33);
        Pessoa Miguel = new Pessoa("Miguel", 24);
        listaDePessoas.add(fax);
        listaDePessoas.add(Rheider);
        listaDePessoas.add(Miguel);
    }
}
