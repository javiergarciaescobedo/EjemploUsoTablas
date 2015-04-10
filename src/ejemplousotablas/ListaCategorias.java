package ejemplousotablas;

import java.util.ArrayList;

public class ListaCategorias {
    
    private ArrayList<Categoria> listaCategorias = new ArrayList();

    public ArrayList<Categoria> getListaCategorias() {
        return listaCategorias;
    }
        
    public Categoria getCategoriaById(int id) {
        for(Categoria c : listaCategorias) {
            if(c.getId() == id) {
                return c;
            }
        }
        return null;
    }
    
    
}
