package dao;

import dataBase.Validation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public abstract class MainDAO<T> {
    private String pathToDB;

    public String getPathToDB() {
        return pathToDB;
    }

    public static void writeToFile(String pathToFile, String dataFile, boolean append) throws Exception {
        Validation.validate(pathToFile);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathToFile, append))) {
            try (BufferedReader br = new BufferedReader(new FileReader(pathToFile))) {
                if (br.readLine() != null) {
                    bw.append("\n");
                }
                bw.append(dataFile);
            }
        } catch (IOException e) {
            throw new IOException("File" + pathToFile + " cannot be edited.");
        }
    }

    public T addObject(T object) throws Exception {
        writeToFile(getPathToDB(), object.toString(), true);
        return object;
    }

    //public abstract String parsToWrite(T t);
    public abstract T parseToRead(String line) throws Exception;

    public List<T> readToFile() throws Exception {
        List<T> objectsList = new ArrayList<>();
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(getPathToDB()))) {
            line = br.readLine();
            while (line != null) {
                objectsList.add(parseToRead(line));
                line = br.readLine();
            }
        } catch (IOException e) {
            throw new Exception("File " + getPathToDB() + " cannot be read.");
        }
        return objectsList;
    }

    public T deleteEntity(T entity) throws Exception {
        List<T> entities = readToFile();
        for (int i = 0; i < entities.size(); i++) {
            if (entities.get(i).equals(entity)) {
                entities.remove(i);
                writeToFile(getPathToDB(), deleteEmptyEntities(entities).toString(), false);
                return entity;
            }
        }
        throw new Exception("Such entity \"" + entity + "\" does not exist.");
    }

    public StringBuffer deleteEmptyEntities(List<T> entities) {
        StringBuffer finalText = new StringBuffer();
        for (T entity : entities) {
            if (entity != null)
                finalText.append(entity.toString()).append("\n");
        }
        return finalText;
    }


}
