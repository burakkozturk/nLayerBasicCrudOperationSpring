package kodlama.io.Devs.dataAccess.concretes;

import kodlama.io.Devs.dataAccess.abstracts.KnowledgeRepository;
import kodlama.io.Devs.entities.concretes.Knowledge;

import java.util.ArrayList;
import java.util.List;

public class InMemoryKnowledge implements KnowledgeRepository {
    List<Knowledge> knowledges;

    public InMemoryKnowledge(){
        knowledges = new ArrayList<Knowledge>();
        knowledges.add(new Knowledge(1,"Java"));
        knowledges.add(new Knowledge(2,"SQL"));
    }

    public List<Knowledge> getAll(){
        return knowledges;
    }

    @Override
    public void create(Knowledge language) {
        knowledges.add(language);
    }

    @Override
    public void delete(int id) {
        knowledges.remove(id);
    }

    @Override
    public void update(Knowledge exLanguage, Knowledge newLanguage) {
        knowledges.set(exLanguage.getId(),newLanguage);
    }

    @Override
    public Knowledge getById(int id) {
        return null;
    }
}
