package controle.v5.android.v1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import controle.v5.android.v1.entity.Users;

public interface UserRepository extends JpaRepository<Users, String> {

}
