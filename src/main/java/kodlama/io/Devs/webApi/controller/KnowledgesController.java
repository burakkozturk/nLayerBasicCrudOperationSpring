package kodlama.io.Devs.webApi.controller;

import kodlama.io.Devs.business.abstracts.KnowledgeService;
import kodlama.io.Devs.entities.concretes.Knowledge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/knowledge")
public class KnowledgesController {
    private KnowledgeService knowledgeService;

    @Autowired
    public KnowledgesController(KnowledgeService knowledgeService) {
        this.knowledgeService = knowledgeService;
    }

    @GetMapping("/getAll")
    public List<Knowledge> getAll(){
        return knowledgeService.getAll();
    }
}
