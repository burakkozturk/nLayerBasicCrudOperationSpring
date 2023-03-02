package kodlama.io.Devs.dataAccess.abstracts;

import kodlama.io.Devs.entities.concretes.Knowledge;

import java.util.List;

public interface KnowledgeRepository {
    List<Knowledge> getAll();

    void create (Knowledge language);
    void delete (int id);
    void update (Knowledge exLanguage, Knowledge newLanguage);
    Knowledge getById (int id);
}
