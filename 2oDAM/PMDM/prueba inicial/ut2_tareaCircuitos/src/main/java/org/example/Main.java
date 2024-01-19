package org.example;

import java.io.*;
import java.sql.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Resultado> resultados = getResultadosFromDatabase();
        Set<Piloto> clasificacionPilotos = calcularClasificacionPilotos(resultados);
        generarHTMLClasificacionPilotos(clasificacionPilotos);
//        Set<Equipo> clasificacionEquipos = calcularClasificacionEquipos(clasificacionPilotos);
//        generarHTMLClasificacionEquipos(clasificacionEquipos);

        // lo tengo comentado porque me da un error que no soy capaz de solucionar
    }

    private static Set<Resultado> getResultadosFromDatabase() {
        Set<Resultado> resultados = new HashSet<>();

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/formula1", "root", "");
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM results")) {

            while (resultSet.next()) {
                String circuito = resultSet.getString("track");
                String posicion = resultSet.getString("position");
                int numero = resultSet.getInt("number");
                String piloto = resultSet.getString("driver");
                String equipo = resultSet.getString("team");

                Resultado resultado = new Resultado(circuito, posicion, numero, piloto, equipo);
                resultados.add(resultado);
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener los resultados de la base de datos: " + e.getMessage());
        }

        return resultados;
    }

    private static Set<Piloto> calcularClasificacionPilotos(Set<Resultado> resultados) {
        Set<Piloto> clasificacionPilotos = new HashSet<>();

        for (Resultado resultado : resultados) {
            String piloto = resultado.getPiloto();
            int puntos;
            if (resultado.getPosicion().equals("NC")) {
                puntos = 0;
            } else {
                puntos = calcularPuntos(Integer.parseInt(resultado.getPosicion()));
            }

            Piloto pilotoObj = buscarPiloto(clasificacionPilotos, piloto);

            if (pilotoObj == null) {
                pilotoObj = new Piloto(piloto);
                clasificacionPilotos.add(pilotoObj);
            }

            pilotoObj.sumarPuntos(puntos);
        }

        return clasificacionPilotos;
    }

    private static Set<Equipo> calcularClasificacionEquipos(Set<Piloto> clasificacionPilotos) {
        Set<Equipo> clasificacionEquipos = new HashSet<>();

        for (Piloto piloto : clasificacionPilotos) {
            String equipo = piloto.getEquipo();
            int puntos = piloto.getPuntos();

            Equipo equipoObj = buscarEquipo(clasificacionEquipos, equipo);

            if (equipoObj == null) {
                equipoObj = new Equipo(equipo);
                clasificacionEquipos.add(equipoObj);
            }

            equipoObj.sumarPuntos(puntos);
        }

        return clasificacionEquipos;
    }

    private static Piloto buscarPiloto(Set<Piloto> pilotos, String nombre) {
        for (Piloto piloto : pilotos) {
            if (piloto.getNombre().equals(nombre)) {
                return piloto;
            }
        }

        return null;
    }

    private static Equipo buscarEquipo(Set<Equipo> equipos, String nombre) {
        for (Equipo equipo : equipos) {
            if (equipo.getNombre().equals(nombre)) {
                return equipo;
            }
        }

        return null;
    }

    private static int calcularPuntos(int posicion) {
        int puntos;

        switch (posicion) {
            case 1:
                puntos = 25;
                break;
            case 2:
                puntos = 18;
                break;
            case 3:
                puntos = 15;
                break;
            case 4:
                puntos = 12;
                break;
            case 5:
                puntos = 10;
                break;
            case 6:
                puntos = 8;
                break;
            case 7:
                puntos = 6;
                break;
            case 8:
                puntos = 4;
                break;
            case 9:
                puntos = 2;
                break;
            case 10:
                puntos = 1;
                break;
            default:
                puntos = 0;
                break;
        }

        return puntos;
    }

    private static void generarHTMLClasificacionPilotos(Set<Piloto> clasificacionPilotos) {
        List<Piloto> clasificacionFinal = new ArrayList<>(clasificacionPilotos);
        Collections.sort(clasificacionFinal);

        StringBuilder sb = new StringBuilder();
        sb.append("<html>");
        sb.append("<head><title>Clasificación de Pilotos</title></head>");
        sb.append("<body>");
        sb.append("<h1>Clasificación de Pilotos</h1>");
        sb.append("<table>");
        sb.append("<tr><th>Posicion</th><th>Piloto</th><th>Puntos</th></tr>");
        int posicion = 1;
        for (Piloto piloto : clasificacionFinal) {
            sb.append("<tr>");
            sb.append("<td>").append(posicion).append("</td>");
            sb.append("<td>").append(piloto.getNombre()).append("</td>");
            sb.append("<td>").append(piloto.getPuntos()).append("</td>");
            sb.append("</tr>");
            posicion++;
        }

        sb.append("</table>");
        sb.append("</body>");
        sb.append("</html>");

        String html = sb.toString();

        try (BufferedWriter wr = new BufferedWriter(new PrintWriter("clasificacion_pilotos.html"))) {
            wr.write(html);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo HTML: " + e.getMessage());
        }
    }

    private static void generarHTMLClasificacionEquipos(Set<Equipo> clasificacionEquipos) {
        List<Equipo> clasificacionFinal = new ArrayList<>(clasificacionEquipos);
        Collections.sort(clasificacionFinal);

        StringBuilder sb = new StringBuilder();
        sb.append("<html>");
        sb.append("<head><title>Clasificación de Equipos</title></head>");
        sb.append("<body>");
        sb.append("<h1>Clasificación de Equipos</h1>");
        sb.append("<table>");
        sb.append("<tr><th>Posicion</th><th>Equipo</th><th>Puntos</th></tr>");
        int posicion = 1;
        for (Equipo equipo : clasificacionFinal) {
            sb.append("<tr>");
            sb.append("<td>").append(posicion).append("</td>");
            sb.append("<td>").append(equipo.getNombre()).append("</td>");
            sb.append("<td>").append(equipo.getPuntos()).append("</td>");
            sb.append("</tr>");
            posicion++;
        }

        sb.append("</table>");
        sb.append("</body>");
        sb.append("</html>");

        String html = sb.toString();

        try (BufferedWriter wr = new BufferedWriter(new PrintWriter("clasificacion_equipos.html"))) {
            wr.write(html);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo HTML: " + e.getMessage());
        }
    }
}