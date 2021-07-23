package bcs.marketvalue.server;

import bcs.marketvalue.jsonparser.ParserJson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.stream.Collectors;

public class Server {
    private ServerSocket serverSocket;

    public void start(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        while (true) {
            new ClientHandler(serverSocket.accept()).start();
        }
    }

    public void stop() throws IOException {
        serverSocket.close();
    }

    private static class ClientHandler extends Thread {
        private Socket          clientSocket;
        private PrintWriter     out;
        private BufferedReader  in;
        private ParserJson      parserJson;

        public ClientHandler (Socket socket) {
            this.clientSocket = socket;
        }

        public void run() {
            try {
                out = new PrintWriter(clientSocket.getOutputStream(), true);
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                String inputLine;
                    inputLine = in.lines().collect(Collectors.joining());
                    parserJson = new ParserJson(inputLine);
                    parserJson.searchStocks();
                    in.close();
                    out.close();
                    clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
