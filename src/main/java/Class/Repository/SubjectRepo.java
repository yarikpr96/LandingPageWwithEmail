package Class.Repository;

import Class.Entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Ярослав on 08.10.2016.
 */
public interface SubjectRepo extends JpaRepository<Subject,Integer> {

}
