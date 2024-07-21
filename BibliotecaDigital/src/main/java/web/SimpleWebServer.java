package web;

import java.io.*;
import java.net.*;
import java.nio.file.*;

public class SimpleWebServer {

    private static final int PORT = 8080;
    private ServerSocket serverSocket;
    private boolean running = false;
    private static final String WEB_ROOT = "C:\\Users\\PC MERA EDITION\\OneDrive\\Documentos\\CETI TRABAJO 5\\Computación Paralela\\BibliotecaDigital\\BibliotecaDigital\\src\\main\\java\\web";

    public SimpleWebServer() {
    }

    public synchronized void start() {
        if (running) {
            System.out.println("El servidor ya está en ejecución.");
            return;
        }
        try {
            serverSocket = new ServerSocket(PORT);
            running = true;
            System.out.println("Servidor iniciado en el puerto " + PORT);
            while (running) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Cliente conectado: " + clientSocket.getInetAddress());
                new Thread(() -> handleClient(clientSocket)).start();
            }
        } catch (IOException e) {
            System.err.println("Error al iniciar el servidor en el puerto " + PORT + ": " + e.getMessage());
            e.printStackTrace();
        }
    }

    public synchronized void stop() {
        running = false;
        try {
            if (serverSocket != null && !serverSocket.isClosed()) {
                serverSocket.close();
                System.out.println("Servidor detenido.");
            }
        } catch (IOException e) {
            System.err.println("Error al detener el servidor: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void handleClient(Socket clientSocket) {
        System.out.println("Manejando cliente: " + clientSocket.getInetAddress());
        try (BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {

            String line;
            StringBuilder request = new StringBuilder();
            while (!(line = in.readLine()).isBlank()) {
                request.append(line).append("\r\n");
            }

            System.out.println("Solicitud recibida:\n" + request.toString());

            String[] requestLines = request.toString().split("\r\n");
            if (requestLines.length > 0) {
                String[] requestParts = requestLines[0].split(" ");
                if (requestParts.length >= 2) {
                    String filePath = requestParts[1];
                    if ("/".equals(filePath)) {
                        filePath = "/index.html";
                    }

                    Path file = Paths.get(WEB_ROOT, filePath);
                    System.out.println("Solicitando archivo: " + file.toString());

                    if (Files.exists(file) && !Files.isDirectory(file)) {
                        String contentType = Files.probeContentType(file);
                        byte[] fileBytes = Files.readAllBytes(file);
                        String responseHeader = "HTTP/1.1 200 OK\r\n" +
                                "Content-Type: " + contentType + "\r\n" +
                                "Content-Length: " + fileBytes.length + "\r\n" +
                                "\r\n";

                        out.print(responseHeader);
                        out.flush();
                        out.write(new String(fileBytes));
                        out.flush();
                        System.out.println("Enviando archivo: " + file.toString());
                    } else {
                        String response = "HTTP/1.1 404 Not Found\r\n" +
                                "Content-Type: text/html\r\n" +
                                "Content-Length: 44\r\n" +
                                "\r\n" +
                                "<html><body><h1>404 Not Found</h1></body></html>";
                        out.println(response);
                        System.out.println("Archivo no encontrado: " + file.toString());
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error al manejar el cliente: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                clientSocket.close();
                System.out.println("Conexión cerrada para el cliente: " + clientSocket.getInetAddress());
            } catch (IOException e) {
                System.err.println("Error al cerrar la conexión: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
