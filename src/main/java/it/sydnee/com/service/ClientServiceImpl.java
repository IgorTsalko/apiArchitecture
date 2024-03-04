package it.sydnee.com.service;

import it.sydnee.com.repository.ClientRepository;
import it.sydnee.com.repository.ClientRepositoryImpl;
import it.sydnee.com.service.model.Client;

public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository = new ClientRepositoryImpl();

    @Override
    public Client saveClient(Client client) {
        return clientRepository.saveClient(client);
    }
}
