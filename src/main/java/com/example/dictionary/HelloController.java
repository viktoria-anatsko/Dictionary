package com.example.dictionary;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class HelloController {
    public ListView listView = new ListView<>();
    List<String> wordsFromDocument = new ArrayList<>();

    public HelloController() {
        try {
            Scanner read = new Scanner(new File("D:\\Projects\\dictionary\\" +
                    "src\\main\\resources\\com\\example\\dictionary\\words.txt"));
            while (read.hasNext()) {
                wordsFromDocument.add(read.next());
           }
           read.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
   }

    public void action (ActionEvent event){
        if (!wordsFromDocument.isEmpty()) {
            for (String word: wordsFromDocument) {
                listView.getItems().add(word);
            }
        }
    }
}