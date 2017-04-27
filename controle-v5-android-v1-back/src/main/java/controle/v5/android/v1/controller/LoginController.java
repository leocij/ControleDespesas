package controle.v5.android.v1.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public ModelAndView getLogin(HttpServletRequest request, HttpServletResponse response) {
		
		ModelAndView modelView = new ModelAndView("login");
		return modelView;
	}
}
