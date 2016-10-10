package Class.Services;

import Class.Entity.Subject;

import java.util.List;

/**
 * Created by Ярослав on 08.10.2016.
 */
public interface SubjectSer {
    void addOrEdit(Subject subject);
    void delete(int id);
    Subject findOneById(int id);
    List<Subject> findAll();
}
