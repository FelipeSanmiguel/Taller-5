package uniandes.dpoo.hamburguesas.tests;


import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import uniandes.dpoo.hamburguesas.mundo.Combo;
import uniandes.dpoo.hamburguesas.mundo.ProductoMenu;

public class ComboTest {
	
	
	private ProductoMenu producto1;
	private ProductoMenu producto2;
	
	private Combo combo1;
	
	private ArrayList<ProductoMenu> items;
	
	@BeforeEach
    void setUp( ) throws Exception
    {
        producto1 = new ProductoMenu( "camaron", 2000 );
        producto2 = new ProductoMenu( "Coca-cola", 1000 );
        
        ArrayList<ProductoMenu> items = new ArrayList<>();
        
        items.add(producto1);
        items.add(producto2);
        
        
        combo1 = new Combo("Cocamarones",0.1, items);
        
    }

    @AfterEach
    void tearDown( ) throws Exception
    {
    }
	
    @Test
    void probarGetNombre() {
    	assertEquals( "Cocamarones", combo1.getNombre( ), "El nombre del combo no es el esperado." );
    }
    
    @Test
    void probarGetPrecio() {
    	assertEquals(2700, combo1.getPrecio( ), "El preccio del combo no es el esperado." );
    }
    
    
    
}
