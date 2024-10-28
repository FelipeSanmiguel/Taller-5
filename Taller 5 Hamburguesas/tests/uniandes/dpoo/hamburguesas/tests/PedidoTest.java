package uniandes.dpoo.hamburguesas.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import uniandes.dpoo.hamburguesas.mundo.Pedido;
import uniandes.dpoo.hamburguesas.mundo.ProductoMenu;



public class PedidoTest {
	

	private Pedido pedido1;
	private ProductoMenu producto1;
	
	
	@BeforeEach
    void setUp( ) throws Exception
    {
        pedido1 = new Pedido("Juan", "Carrera Disc vs Industrial");
        producto1 = new ProductoMenu( "camaron", 1000 );
        
    }

    @AfterEach
    void tearDown( ) throws Exception
    {
    }
    
    @Test
    void probarGetId() throws Exception{
    	assertEquals( 0, pedido1.getIdPedido( ), "El ID del pedido no es el esperado." );
    }
    
    @Test
    void probarGetNombreCliente() throws Exception{
    	assertEquals( "Juan", pedido1.getNombreCliente( ), "El Nombre del cliente no es el esperado." );
    }
    
    @Test
    void probarGetPrecioNet() throws Exception{
    	pedido1.agregarProducto(producto1);
    	assertEquals( 1000, pedido1.getPrecioNetoPedido(), "El precio del pedido no es el esperado." );
    }
	
    @Test
    void probarGetPrecioIVAt() throws Exception{
    	pedido1.agregarProducto(producto1);
    	assertEquals( 1000*0.19, pedido1.getPrecioIVAPedido(), "El precio del IVA no es el esperado." );
    }
    
    @Test
    void probarGetPrecioTot() throws Exception{
    	pedido1.agregarProducto(producto1);
    	assertEquals( 1000*0.19+1000, pedido1.getPrecioTotalPedido(), "El precio no es el esperado." );
    }
    
    
    
}
