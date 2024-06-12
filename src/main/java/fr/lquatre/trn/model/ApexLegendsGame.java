package fr.lquatre.trn.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class ApexLegendsGame {
    private static final String API_KEY = **NOT WORKING ANYMORE**;

    public void fetchStats() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the Apex Legends stats you want to fetch:");
        System.out.println("1. Player Profile Stats");
        System.out.println("2. Stats Segment");
        System.out.println("3. Search Player");
        System.out.println("4. Fetch Match History");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        switch (choice) {
            case 1:
                fetchPlayerProfileStats(scanner);
                break;
            case 2:
                fetchStatsSegment(scanner);
                break;
            case 3:
                searchPlayer(scanner);
                break;
            case 4:
                fetchMatchHistory(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private void fetchPlayerProfileStats(Scanner scanner) {
        System.out.print("Enter the platform (e.g., origin, xbl, psn): ");
        String platform = scanner.nextLine();
        System.out.print("Enter the platform user identifier: ");
        String platformUserIdentifier = scanner.nextLine();

        String endpoint = String.format("https://public-api.tracker.gg/v2/apex/standard/profile/%s/%s", platform, platformUserIdentifier);
        makeApiRequest(endpoint);
    }

    private void fetchStatsSegment(Scanner scanner) {
        System.out.print("Enter the platform (e.g., origin, xbl, psn): ");
        String platform = scanner.nextLine();
        System.out.print("Enter the platform user identifier: ");
        String platformUserIdentifier = scanner.nextLine();
        System.out.print("Enter the segment type: ");
        String segmentType = scanner.nextLine();

        String endpoint = String.format("https://public-api.tracker.gg/v2/apex/standard/profile/%s/%s/segments/%s", platform, platformUserIdentifier, segmentType);
        makeApiRequest(endpoint);
    }

    private void searchPlayer(Scanner scanner) {
        System.out.print("Enter the platform (e.g., origin, xbl, psn): ");
        String platform = scanner.nextLine();
        System.out.print("Enter the query (user's handle on the platform): ");
        String query = scanner.nextLine();

        String endpoint = String.format("https://public-api.tracker.gg/v2/apex/standard/search?platform=%s&query=%s", platform, query);
        makeApiRequest(endpoint);
    }

    private void fetchMatchHistory(Scanner scanner) {
        System.out.print("Enter the platform (e.g., origin, xbl, psn): ");
        String platform = scanner.nextLine();
        System.out.print("Enter the platform user identifier: ");
        String platformUserIdentifier = scanner.nextLine();

        String endpoint = String.format("https://public-api.tracker.gg/v2/apex/standard/profile/%s/%s/sessions", platform, platformUserIdentifier);
        makeApiRequest(endpoint);
    }

    private void makeApiRequest(String endpoint) {
        try {
            URL url = new URL(endpoint);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("TRN-Api-Key", API_KEY);

            int responseCode = connection.getResponseCode();
            String messageCode = connection.getResponseMessage();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                System.out.println("Response from API:");
                System.out.println(response.toString());
            } else {
                System.out.println("GET request failed. Response Code: " + responseCode + ", Message : " + messageCode);
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ApexLegendsGame game = new ApexLegendsGame();
        game.fetchStats();
    }
}
