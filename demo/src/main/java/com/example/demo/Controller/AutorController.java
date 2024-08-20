
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/autor/")
@RestController

public class AutorController {
    @Autowired
    Public AutorService autorService;


    @PostMapping
    public Autor inserirAutor(@ResquetBody Autor autor){
        return AutorService.inserir(autor)
    }
    @GetMapping
    public list<Autor> getTodosAutores(){
        return AutorService.metodoDePegarTodosAutores();
    }

    @GetMapping
    @RequestMapping("CPF/{CPF}")
    public Autor pegarAutorPeloCPF(@PathVariable String CPF){
        return AutorService.pegarPeloCPF(CPF);
    }

}