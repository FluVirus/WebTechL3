package by.fluvirus.lab3.server.dao;

import by.fluvirus.lab3.server.model.StudentFile;

public interface StudentFileDAO {
    StudentFile[] getAll();
    boolean add(StudentFile file);
    StudentFile getById(int id);
    boolean updateById(int id, StudentFile file);
    boolean contains(int id);
}
