package org.phase.one;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.css.sword.core.learn.phaseOne.bean.Zi;
import com.css.sword.core.learn.phaseOne.bean.fu;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	@Before
	public void init(){
		
		System.out.println("init");
	}
	@After
	public void close() {
		System.out.println("close");
	}
    @Test
	public void app() {
    	int nextInt = new Random().nextInt();
    	System.out.println(nextInt);
	}
    
    public <E> void genericity(Collection<? super E> col) {
    	for (Object e : col) {
			System.out.println(e.toString());
		}
    }
    
    @SuppressWarnings("resource")
	@Test
    public void testGenericity() throws FileNotFoundException {
    	List<fu> of = List.of(new Zi(),new Zi());
    	this.genericity(of);
    	FileInputStream fileInputStream = new FileInputStream("");
//    	fileInputStream.
    	FileOutputStream fileOutputStream = new FileOutputStream("");
//    	fileOutputStream.
    	
    }
}
