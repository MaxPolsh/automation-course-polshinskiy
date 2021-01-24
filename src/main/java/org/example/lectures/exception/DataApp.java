package org.example.lectures.exception;

import org.example.infrastructure.data.FileUserDataMapper;

import java.util.Arrays;

public class DataApp {
    public static void main(String[] args) {
        FileUserDataMapper dataMapper = new FileUserDataMapper("users.txt");
        System.out.println(Arrays.toString(dataMapper.getAll()));
    }
}
