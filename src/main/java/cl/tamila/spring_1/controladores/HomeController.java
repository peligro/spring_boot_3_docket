package cl.tamila.spring_1.controladores;
import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	
	@GetMapping("/")
	public ResponseEntity<?> metodo_get()
	{
		return ResponseEntity.status(HttpStatus.OK).body(new HashMap<String, String>(){
			private static final long serialVersionUID = 1L;

			{
				put("estado","OK");
				put("mensaje","Método GET - HOla mundo aer");
			}
		});
	}
}