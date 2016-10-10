package Class.Services.Implementation;

import Class.Entity.Subject;
import Class.Repository.SubjectRepo;
import Class.Services.SubjectSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ярослав on 08.10.2016.
 */
@Service
public class SubjectSerImpl implements SubjectSer {
    @Autowired
    private SubjectRepo subjectRepo;

    @Override
    public void addOrEdit(Subject subject) {
        subjectRepo.save(subject);
    }

    @Override
    public void delete(int id) {
        subjectRepo.delete(id);
    }

    @Override
    public Subject findOneById(int id) {
        return subjectRepo.findOne(id);
    }

    @Override
    public List<Subject> findAll() {
        return subjectRepo.findAll();
    }
}
