package uniandes.dpoo.hamburguesas.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import uniandes.dpoo.hamburguesas.mundo.ProductoAjustado;
import uniandes.dpoo.hamburguesas.mundo.ProductoMenu;

public class ProductoAjustadoTest {
	
	private ProductoAjustado productoAjustado1;
	private ProductoMenu productoMenu1;

    @BeforeEach
    void setUp( ) throws Exception
    {
    	
    	productoMenu1 = new ProductoMenu( "camaron", 1000 );
    	productoAjustado1 = new ProductoAjustado( productoMenu1);
    }

    @AfterEach
    void tearDown( ) throws Exception
    {
    }
    
    @Test
    void testGetNombre( )
    {
        assertEquals( "camaron", productoAjustado1.getNombre( ), "El nombre del ingrediente no es el esperado." );
    }

    @Test
    void testPrecioSinCambios( )
    {
        assertEquals( 1000, productoAjustado1.getPrecio(), "El costo adicional del ingrediente no es el esperado." );
    }
    
    @Test
    void testPrecioConIngredientes( )
    {
        assertEquals( 1000, productoAjustado1.getPrecio(), "El costo adicional del ingrediente no es el esperado." );
    }

}
