package com.jrolab.service.impl;

import com.jrolab.service.IClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.jrolab.model.Client;
import com.jrolab.repo.IClientRepo;
import com.jrolab.repo.IGenericRepo;

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
