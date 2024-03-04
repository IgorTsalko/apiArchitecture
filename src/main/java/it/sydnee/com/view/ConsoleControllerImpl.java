package it.sydnee.com.view;

import it.sydnee.com.service.ClientService;
import it.sydnee.com.service.ClientServiceImpl;
import it.sydnee.com.service.model.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This is the implementation of the interface:
 */
public class ConsoleControllerImpl implements ConsoleController {

    private final ClientService clientService = new ClientServiceImpl();

    @Override
    public void saveClient() {
        try (BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the name: ");
            String name = buffReader.readLine();
            Client client = new Client();
            client.setName(name);
            Client savedClient = clientService.saveClient(client);
            System.out.printf("Client was saved: %s", savedClient);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
