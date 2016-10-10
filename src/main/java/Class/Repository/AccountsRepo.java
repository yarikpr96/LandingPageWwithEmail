package Class.Repository;

import Class.Entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


/**
 * Created by Ярослав on 08.10.2016.
 */
public interface AccountsRepo extends JpaRepository<Accounts, Integer> {

    @Query("FROM Accounts")
    List<Accounts> findAll();


}
