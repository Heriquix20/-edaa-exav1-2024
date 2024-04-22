package ListaAv1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;  

public class LerArquivo {

    public void readFile(List<Country> paises) {  
        try {  
            File file = new File(
                "C:\\Users\\hcgv1\\Downloads\\fifa_countries_audience.csv");  
            BufferedReader br = new BufferedReader(new FileReader(file));  
            br.readLine(); 
            String line = br.readLine();  
            while (line != null) {  
                String[] dados = line.split(",");  
                String country = dados[0]; 
                String body = dados[1];  
                double global = Double.parseDouble(dados[2]);  
                double tvAudince = Double.parseDouble(dados[3]);  
                double gdp = Double.parseDouble(dados[4]);  
                paises.add(new Country(country, body, global, tvAudince, gdp));  
                line = br.readLine();  
            }
            br.close(); 
        } catch (Exception e) {  
            e.printStackTrace();
        }
    }
    
}
