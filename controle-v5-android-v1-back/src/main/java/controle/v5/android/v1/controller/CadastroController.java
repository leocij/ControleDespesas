package controle.v5.android.v1.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import controle.v5.android.v1.entity.Authorities;
import controle.v5.android.v1.entity.Users;
import controle.v5.android.v1.repository.AuthorityRepository;
import controle.v5.android.v1.repository.UserRepository;

@RestController
public class CadastroController {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private AuthorityRepository authorityRepository;

	@RequestMapping(value = "/cadastro", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView teste(HttpServletRequest request, HttpServletResponse response) {

		System.out.println("Passei = " + request);

		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");

		if (usuario != null && senha != null) {
			Users u = new Users();
			u.setUsername(usuario);
			u.setPassword(senha);
			u.setEnabled(true);
			userRepository.save(u);

			Authorities auth = new Authorities();
			auth.setUsername(usuario);
			auth.setAuthority("user");
			authorityRepository.save(auth);

			System.out.println("Usuario: " + usuario);
			System.out.println("Senha: " + senha);

			// AQUI DEVE-SE FAZER A INSERÇÃO

			// Aqui manda para a página login a mensagem no espaço status.
			ModelAndView modelView = new ModelAndView("cadastro");
			modelView.addObject("status", "Usuário cadastrado com sucesso!!");
			return modelView;
		} else {
			ModelAndView modelView = new ModelAndView("cadastro");
			modelView.addObject("status", "Usuário ou senha em branco!!");
			return modelView;
		}

	}

}