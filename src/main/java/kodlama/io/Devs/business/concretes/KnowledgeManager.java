package kodlama.io.Devs.business.concretes;

import kodlama.io.Devs.business.abstracts.KnowledgeService;
import kodlama.io.Devs.dataAccess.abstracts.KnowledgeRepository;
import kodlama.io.Devs.entities.concretes.Knowledge;

import java.util.List;

public class KnowledgeManager implements KnowledgeService {
    private KnowledgeRepository knowledgeRepository;

    public KnowledgeManager(KnowledgeRepository knowledgeRepository) {
        this.knowledgeRepository = knowledgeRepository;
    }

    @Override
    public List<Knowledge> getAll(){
        return knowledgeRepository.getAll();
    }

    @Override
    public void create(Knowledge language) {
        knowledgeRepository.create(language);
    }

    @Override
    public void delete(int id) {
        knowledgeRepository.delete(id);
    }

    @Override
    public void update(Knowledge exLanguage, Knowledge newLanguage) {
        knowledgeRepository.update(exLanguage.getId(),newLanguage);
    }
}
