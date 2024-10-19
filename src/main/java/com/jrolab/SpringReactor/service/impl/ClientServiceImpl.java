package com.jrolab.SpringReactor.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.jrolab.SpringReactor.model.Client;
import com.jrolab.SpringReactor.repo.IClientRepo;
import com.jrolab.SpringReactor.repo.IGenericRepo;
import com.jrolab.SpringReactor.service.IClientService;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl extends CRUDImpl<Client, String> implements IClientService {

    //@Autowired
    private final IClientRepo repo;

    @Override
    protected IGenericRepo<Client, String> getRepo() {
        return repo;
    }


}
