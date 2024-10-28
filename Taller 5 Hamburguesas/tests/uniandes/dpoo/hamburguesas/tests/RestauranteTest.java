package uniandes.dpoo.hamburguesas.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import uniandes.dpoo.hamburguesas.mundo.Pedido;
import uniandes.dpoo.hamburguesas.mundo.ProductoMenu;
import uniandes.dpoo.hamburguesas.mundo.Restaurante;

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
    
}
