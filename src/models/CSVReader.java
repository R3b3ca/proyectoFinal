package models;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.Rebeca.ds.ChicagoAnalysis.ElasticWorkerArray;
import com.Rebeca.ds.ChicagoAnalysis.worker;

public class CSVReader {
    public static void main(String[] args){

        String dataCsvFileLocation = "C:\\Users\\rmd89\\eclipse-workspace\\ChicagoEmployeeDataAnalysis_RebecaMedina\\src\\Current_Employee_Names__Salaries__and_Position_Titles.csv";
        String csvSeparator = ",";
        String line = "";

        ElasticWorkerArray workers = new ElasticWorkerArray();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(dataCsvFileLocation))){
            while((line = bufferedReader.readLine()) != null){
                line += ", ";
                String[] person = line.split(csvSeparator);
                worker personObj = new worker(
                        person[1],
                        person[0],
                        person[2],
                        person[3],
                        person[4],
                        person[5],
                        person[6],
                        person[7],
                        person[8]
                );
                workers.addWorker(personObj);
            }

            Facts fact = new Facts(workers.getWorkerArray());


        } catch(FileNotFoundException fileNotFoundException){
            System.out.println("The file provided is not valid");
        } catch (IOException ioException){

            ioException.printStackTrace();
        }

    }

}
