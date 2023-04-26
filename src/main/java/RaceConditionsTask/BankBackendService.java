package RaceConditionsTask;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BankBackendService {
    private static final String BANK_BACKEND_API_URL = "https://example.com/bank-backend-api/deposit";

    public void deposit(double amount, String accountNumber) throws RuntimeException {
        // Make a POST request to the bank's backend API to deposit the money
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BANK_BACKEND_API_URL))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString("{\"amount\": " + amount + ", \"accountNumber\": \"" + accountNumber + "\"}"))
                .build();
        HttpResponse<String> response;
        try {
            response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Error depositing money: " + e.getMessage());
        }
        if (response.statusCode() != 200) {
            throw new RuntimeException("Error depositing money: " + response.body());
        }
    }
}
