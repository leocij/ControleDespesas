package controle.v5.android.v1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import controle.v5.android.v1.entity.Authorities;

public interface AuthorityRepository extends JpaRepository<Authorities, String> {

}
