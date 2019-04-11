
package leitura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class LeCsv {
        
     public LinkedList<Cliente> leCsvClientes() throws IOException{         
      
        LinkedList<Cliente> clientes = new  LinkedList<Cliente>();             
        String current = new java.io.File( "." ).getCanonicalPath();        
        File inputFile = new File(current + "//src//arquivo.csv");                
        FileReader in = new FileReader(inputFile);
        int c;      
        int num_linha =0;
        String buffer="";
        String linha ="";
        while ((c = in.read()) != -1) {         
            if((char)c=='\n'){
                num_linha++; 
            }
            if(num_linha!=0){
                buffer = buffer + (char)c;             
                               
                if((char)c=='\n'){
                    linha = buffer;
                    buffer="";
                    //System.out.println(linha);
                    String array[] = linha.split(";");                    
                     Cliente cliente= new Cliente();
                     cliente= criaObjeto(array);
                     clientes.add(cliente);
                }
            }
        }   
        
        in.close(); 
        
        //complete o codigo para ler o csv e criar as instancias de cliente.
        //rode o teste MainReadCsvTest.java para testar o seu código.
        
        return clientes;
     }
     public Cliente criaObjeto (String array[]){
         Cliente c= new Cliente();
         for (int i=0;i<array.length;i++){
                //System.out.println(array[i]);
                if(i==0){
                    c.setId(array[i]);
                }
                if(i==1){
                    c.setNome(array[i]);
                }
                if(i==2){
                    c.setEmail(array[i]);
                }
                if(i==4){
                    c.setTelefone(array[i]);
                }
                if(i==5){
                    c.setTotalCompras(Double.parseDouble(array[i]));
                }
            }
         return c;
     } 
     
 
}

  