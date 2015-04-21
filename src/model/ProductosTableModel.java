package model;

import data.Categoria;
import data.Producto;
import data.ProductosContenedor;
import javax.swing.table.AbstractTableModel;

public class ProductosTableModel extends AbstractTableModel {

    private ProductosContenedor productosContenedor;

    public ProductosTableModel(ProductosContenedor productos) {
        this.productosContenedor = productos;
    }
    
    @Override
    public int getRowCount() {
        return productosContenedor.getListaProductos().size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Producto producto = productosContenedor.getListaProductos().get(rowIndex);
        switch(columnIndex) {
            case 0:
                return producto.getId();
            case 1:
                return producto.getNombre();
            case 2:
                return producto.getPrecio();
            case 3:
                return producto.getCategoria();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0:
                return "Id";
            case 1:
                return "Nombre";
            case 2:
                return "Precio";
            case 3:
                return "Categoría";
            default:
                return null;
        }
    }    

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0:
            case 3:
                return false;
            default:
                return true;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Producto producto = productosContenedor.getListaProductos().get(rowIndex);
        switch(columnIndex) {
            case 0:
                producto.setId(Integer.valueOf((String)aValue));
                break;
            case 1:
                producto.setNombre((String)aValue);
                break;
            case 2:
                producto.setPrecio(Double.valueOf((String)aValue));
                break;
            case 3:
                producto.setCategoria((Categoria)aValue);
                break;
        }        
    }
        
}
