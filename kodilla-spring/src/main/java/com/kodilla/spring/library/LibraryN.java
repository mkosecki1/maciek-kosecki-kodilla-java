package com.kodilla.spring.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryN {
    private final List<String> books = new ArrayList<>();
    private LibraryDbController libraryDbController;

    public LibraryN(final LibraryDbController libraryDbController) {
        this.libraryDbController = libraryDbController;
    }
    public LibraryN() {
    }
    public void saveToDb(){
        libraryDbController.saveData();
    }
    public void loadFromDb(){
        libraryDbController.loadData();
    }
}
