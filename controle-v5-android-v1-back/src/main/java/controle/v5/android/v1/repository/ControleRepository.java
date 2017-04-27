package controle.v5.android.v1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import controle.v5.android.v1.entity.Controle;

@Repository
public interface ControleRepository extends JpaRepository<Controle, Long> {

}
