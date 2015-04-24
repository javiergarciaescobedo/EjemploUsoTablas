package renderer;

import data.Categoria;
import javax.swing.table.DefaultTableCellRenderer;

public class CategoriaCellRenderer extends DefaultTableCellRenderer {

    @Override
    protected void setValue(Object value) {
        Categoria categoria = (Categoria)value;
        setText(categoria.getNombre());
    }
    
}
