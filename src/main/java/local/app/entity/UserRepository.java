package local.app.entity;

import org.springframework.data.repository.CrudRepository;

// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<AppUser, Integer> {

}