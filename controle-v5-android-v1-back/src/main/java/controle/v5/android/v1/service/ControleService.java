package controle.v5.android.v1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import controle.v5.android.v1.entity.Controle;
import controle.v5.android.v1.repository.ControleRepository;

@Service
public class ControleService {

	@Autowired
	private ControleRepository controleRepository;

	@Transactional(readOnly = true)
	public List<Controle> findAll() {
		return controleRepository.findAll();
	}

}
