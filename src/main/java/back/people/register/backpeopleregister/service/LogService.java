package back.people.register.backpeopleregister.service;

import back.people.register.backpeopleregister.model.Log;
import back.people.register.backpeopleregister.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class LogService implements LogRepository{

    @Autowired
    private LogRepository logRepository;

    @Override
    public List<Log> findAll() {
        return logRepository.findAll();
    }

    @Override
    public List<Log> findAll(Sort sort) {
        return logRepository.findAll(sort);
    }

    @Override
    public Page<Log> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Log> findAllById(Iterable<String> strings) {
        return null;
    }

    public List<Log> findAllLogsByAdministrator (int id) {
        List<Log> logsRespuesta = null;
        List<Log> logs = logRepository.findAll();
        for (int i = 0; i < logs.size(); i++) {
            if(logs.get(i).getPerson().getId()==id) {
                logsRespuesta.add(logs.get(i));
            }
        }
        return logsRespuesta;
    }

    @Override
    public long count() {
        return logRepository.count();
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(Log entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends Log> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Log> S save(S entity) {
        return logRepository.save(entity);
    }

    @Override
    public <S extends Log> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Log> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Log> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Log> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Log> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> strings) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Log getOne(String s) {
        return null;
    }

    @Override
    public Log getById(String s) {
        return null;
    }

    @Override
    public <S extends Log> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Log> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Log> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Log> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Log> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Log> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Log, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
