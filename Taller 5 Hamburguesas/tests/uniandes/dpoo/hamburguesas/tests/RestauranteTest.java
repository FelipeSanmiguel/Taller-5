package uniandes.dpoo.hamburguesas.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.File;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import uniandes.dpoo.hamburguesas.mundo.Pedido;
import uniandes.dpoo.hamburguesas.mundo.ProductoMenu;
import uniandes.dpoo.hamburguesas.mundo.Restaurante;
import uniandes.dpoo.hamburguesas.mundo.Combo;


public class RestauranteTest {

	private Restaurante elRestuarante;
	ArrayList<ProductoMenu> menuBase;
	
	@BeforeEach
    void setUp( ) throws Exception
    {
        Restaurante elRestaurante = new Restaurante();
        this.elRestuarante = elRestaurante;
        File file1 = new File("data/ingredientes.txt/");
        File file2 = new File("data/menu.txt/");
        File file3 = new File("data/combos.txt/");
        
        
        elRestaurante.cargarInformacionRestaurante(file1, file2, file3);
        
        ArrayList<ProductoMenu> menuBase = new ArrayList<>();
        ArrayList<Combo> combos = new ArrayList<>();
        
    }

    @AfterEach
    void tearDown( ) throws Exception
    {
    }
    
    @Test
    void probarMenuCarga( ) throws Exception
    {
    	assertEquals( "corral", elRestuarante.getMenuBase().get(0).getNombre(), "El ID del pedido no es el esperado." );
    }
    
    @Test
    void probarComboCarga( ) throws Exception
    {
    	assertEquals( "combo corral", elRestuarante.getMenuCombos().get(0).getNombre(), "El ID del pedido no es el esperado." );
    }
    
    @Test
    void probarIngredientesCarga( ) throws Exception
    {
    	assertEquals( "lechuga", elRestuarante.getIngredientes().get(0).getNombre(), "El ID del pedido no es el esperado." );
    }
    
    /*
     * Este metodo sirve para probar get pedido y cargar pedido
     */
    @Test
    void probarInciarPedido( ) throws Exception
    {
    	String nombre = "Juan";
    	String direccion = "Carrera Disc vs Industrial";
    	elRestuarante.iniciarPedido(nombre, direccion);
    	
    	Pedido elPedido = elRestuarante.getPedidoEnCurso();
    	assertEquals( "Juan", elPedido.getNombreCliente( ), "El Nombre del cliente no es el esperado." );
    	
    }
    
    @Test
    void probarGetPedidos( ) throws Exception
    {
    	String nombre = "Juan";
    	String direccion = "Carrera Disc vs Industrial";
    	elRestuarante.iniciarPedido(nombre, direccion);
    	elRestuarante.cerrarYGuardarPedido();
    	ArrayList<Pedido> Pedidos;
    	
    	Pedidos = elRestuarante.getPedidos();
    	
    	assertEquals( "Juan", Pedidos.get(0).getNombreCliente( ), "El Nombre del cliente no es el esperado." );
    	
    	
    	
    }
   
    
    
}
