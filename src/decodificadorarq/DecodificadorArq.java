package decodificadorarq;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DecodificadorArq {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        HashMap<Integer, String> dado = new HashMap<Integer, String>();
        File editar = new File("decodificada.txt");
        FileInputStream entradaHex = new FileInputStream("bibliahex.txt");
        
        //ObjectOutputStream oos = new ObjectOutputStream("decodificada.txt");
        //OutputStream editar = (oos);
        //FileWriter wh = new FileWriter(editar);
        //FileInputStream entradaMap = new FileInputStream("mapper.txt");
        
        Scanner entHex = new Scanner(entradaHex);
        //  Scanner entMap = new Scanner(entradaMap);
        int j = 0;

        while (entHex.hasNext()) {
            String linhaHex = entHex.nextLine();
            String[] palavraHex = linhaHex.split(" ");
            ArrayList numeros = new ArrayList();
            //String[] valores = null;

            for (String valor : palavraHex) {

                numeros.add(Integer.parseInt(valor, 16));
                j++;

//                for (int i = 0; j > i; i++) {
//                    //wh.write((String) numeros.get(j));
//                    System.out.println("teste");
//                }
            }
            System.out.println(numeros);

        }
    }
}

//nova implementação
//Scanner teste =  new Scanner((ReadableByteChannel) numeros);
//            while(teste.hasNext()){
//                String tes = teste.nextLine();
//                String[] test = tes.split(" ");
//                
//                if(tes != null){
//                    wh.write(tes);
//                }
//            }
