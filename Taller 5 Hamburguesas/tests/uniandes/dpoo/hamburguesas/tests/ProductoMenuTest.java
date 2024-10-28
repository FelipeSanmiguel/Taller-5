package uniandes.dpoo.hamburguesas.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import uniandes.dpoo.hamburguesas.mundo.ProductoMenu;

public class ProductoMenuTest {

	private ProductoMenu producto1;
	
	@BeforeEach
    void setUp( ) throws Exception
    {
        producto1 = new ProductoMenu( "camaron", 1000 );
    }

    @AfterEach
    void tearDown( ) throws Exception
    {
    }
    
    @Test
    void probarGetNombre() {
    	assertEquals( "camaron", producto1.getNombre( ), "El nombre del producto no es el esperado." );
    }
	
    @Test
    void probarGetPrecio() {
    	assertEquals( 1000, producto1.getPrecio( ), "El precio del producto no es el esperado." );
    }
    
    @Test
    void probarGenerarTextoFactura() {
    	assertEquals( "camaron"+ "\n" + "            " + "1000" + "\n", producto1.generarTextoFactura(), "El precio del producto no es el esperado." );
    }
    
}

