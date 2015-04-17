package renderer;

import data.Categoria;
import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

public class CategoriasListRenderer extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        Categoria categoria = (Categoria)value;
        setText(categoria.getNombre());
        if(isSelected) {
            this.setBackground(Color.red);
        } else {
            this.setBackground(Color.white);
        }
        return this;
    }
    
    
    
}
