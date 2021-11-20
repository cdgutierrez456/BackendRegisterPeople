package back.people.register.backpeopleregister.service;

import back.people.register.backpeopleregister.model.FacialInfo;
import back.people.register.backpeopleregister.repository.FacialInfoRepository;
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
public class FacialInfoService implements FacialInfoRepository {

    @Autowired
    private FacialInfoRepository facialInfoRepository;

    @Override
    public List<FacialInfo> findAll() {
        return facialInfoRepository.findAll();
    }

    @Override
    public List<FacialInfo> findAll(Sort sort) {
        return facialInfoRepository.findAll(sort);
    }

    @Override
    public Page<FacialInfo> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<FacialInfo> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return facialInfoRepository.count();
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(FacialInfo entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends FacialInfo> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends FacialInfo> S save(S entity) {
        return null;
    }

    @Override
    public <S extends FacialInfo> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<FacialInfo> findById(String s) {
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
    public <S extends FacialInfo> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends FacialInfo> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<FacialInfo> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> strings) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public FacialInfo getOne(String s) {
        return null;
    }

    @Override
    public FacialInfo getById(String s) {
        return null;
    }

    @Override
    public <S extends FacialInfo> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends FacialInfo> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends FacialInfo> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends FacialInfo> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends FacialInfo> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends FacialInfo> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends FacialInfo, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
