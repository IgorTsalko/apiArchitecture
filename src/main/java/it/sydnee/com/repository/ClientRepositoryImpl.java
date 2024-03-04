package it.sydnee.com.repository;

import it.sydnee.com.service.model.Client;

import java.util.HashMap;
import java.util.Map;

public class ClientRepositoryImpl implements ClientRepository {

    private Long id = 1L;
    private final Map<Long, Client> clients = new HashMap<>();

    @Override
    public Client saveClient(Client client) {
        Long clientId = id++;
        client.setId(clientId);
        clients.put(clientId, client);
        return clients.get(clientId);
    }
}
