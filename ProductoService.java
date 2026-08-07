import java.util.List;

public class ProductoService {

    private ProductoDAO dao = new ProductoDAOImpl();

    public void agregarProducto(Producto producto) {
        dao.agregarProducto(producto);
    }

    public void actualizarProducto(Producto producto) {
        dao.actualizarProducto(producto);
    }

    public Producto buscarProducto(int id) {
        return dao.buscarProducto(id);
    }

    public void eliminarProducto(int id) {
        dao.eliminarProducto(id);
    }

    public List<Producto> listarProductos() {
        return dao.listarProductos();
    }
}