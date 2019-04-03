package telefonia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TelefoneSingleton {
    private int numero;
    private int count=999990000;
    private static TelefoneSingleton instance;
    
    public synchronized static TelefoneSingleton getInstance(){
        if(instance==null){
            instance = new TelefoneSingleton();
        }
        return instance;
    }
//metodos aqui
    private TelefoneSingleton (){    
        try{
            FileReader fr = new FileReader("marcelo.txt");
            BufferedReader br = new BufferedReader( fr );
            String linha = br.readLine();
            int i = Integer.parseInt(linha);
            count=i;
            br.close();
            fr.close();
        }catch (IOException i) {
            count=999990000;            
      }
    }
   
   public synchronized int nextNumber(){
       return count++;
   }
   
   public int getNumero(){
        return this.numero;
   }
   public void salvar(){
         try{
            FileWriter fw = new FileWriter("marcelo.txt");
            BufferedWriter bw = new BufferedWriter( fw );
            bw.write( String.valueOf(count) );
            
            bw.close();
            fw.close();
        }catch (IOException i) {
            count=999990000;
        }
   }
  
}
