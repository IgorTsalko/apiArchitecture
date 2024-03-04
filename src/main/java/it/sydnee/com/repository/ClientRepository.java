package it.sydnee.com.repository;

import it.sydnee.com.service.model.Client;

public interface ClientRepository {

    //It's common practise to return saved model
    Client saveClient(Client client);
}
