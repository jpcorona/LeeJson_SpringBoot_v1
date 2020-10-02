package com.example.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Archivo;
import com.example.demo.model.Direccion;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		try {
			ObjectMapper mapper = new ObjectMapper();

			InputStream inputSream = new FileInputStream(new File("C:/Users/Kibernum/Pictures/json/usuarios.json"));
			TypeReference<List<Archivo>> typeReference = new TypeReference<List<Archivo>>() {};
            List<Archivo> archivos = mapper.readValue(inputSream, typeReference);
            
            for(Archivo a : archivos) {
            	System.out.println("El nombre es: " + a.getNombre()+"Ciudad: "+a.getDireccion().getCiudad()+"Primer auto es: "+a.getAutos()[0]);
            	
            }
            Archivo archivo = new Archivo();
            archivo.setNombre("jack");
            archivo.setApellido("Corona");
            archivo.setEdad(25);
            archivo.setDireccion(new Direccion("calle 12","Santiago","9080000"));
            archivo.setAutos(new String[]{"Toyota Camary", "Honda Accord"});
            mapper.writeValue(new File("C:/Users/Kibernum/Pictures/json/usuariosOut.txt"), archivo);
            inputSream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
