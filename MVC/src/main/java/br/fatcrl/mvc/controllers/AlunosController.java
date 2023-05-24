package br.fatcrl.mvc.controllers;
import br.fatcrl.mvc.models.Aluno;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping("/alunos")
public class AlunosController {
    private static final List<Aluno> _alunos = new ArrayList<Aluno>();

    public AlunosController(){
        _alunos.add(new Aluno("123", "Leila", 10, 2));
        _alunos.add(new Aluno("321", "Thaisa", 9, 7));
    }

    @GetMapping
    public String getAlunos(Model model){
        model.addAttribute("alunos", _alunos);
        return "alunos";
    }
}
