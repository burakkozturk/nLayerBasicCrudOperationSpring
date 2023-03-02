package kodlama.io.Devs.business.abstracts;

import kodlama.io.Devs.entities.concretes.Knowledge;

import java.util.List;

public interface KnowledgeService {
    List<Knowledge> getAll();
    void create(Knowledge language);
    void delete(int id);
    void update(Knowledge exLanguage, Knowledge newLanguage);


}
