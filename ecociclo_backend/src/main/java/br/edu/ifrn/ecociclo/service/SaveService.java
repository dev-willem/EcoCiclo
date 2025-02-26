package br.edu.ifrn.ecociclo.service;

import br.edu.ifrn.ecociclo.model.Save;
import br.edu.ifrn.ecociclo.model.SaveId;
import br.edu.ifrn.ecociclo.repository.SaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SaveService {
    @Autowired
    SaveRepository repository;

    private Save save(Save save) {
        return repository.save(save);
    }

    private void deleteById(SaveId id) {
        repository.deleteById(id);
    }

    private List<Save> findAll() {
        return repository.findAll();
    }

    private Optional<Save> findById(SaveId id) {
        return repository.findById(id);
    }
}
