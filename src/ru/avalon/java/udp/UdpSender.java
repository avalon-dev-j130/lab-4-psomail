package ru.avalon.java.udp;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.*;
import java.util.Scanner;

/**
 * Упражнение, направленное на выработку умений, связанных
 * с отправкой сообщений средствами протокола UDP.
 *
 * @author Daniel Alpatov
 */
public final class UdpSender {

    public static void main(String[] args) throws IOException {
        // 1. Формируем сообщение
        final String message = prepareMessage();
        // 2. Формируем адрес конечной точки.
        final SocketAddress address = prepareAddress();
        // 3. Формируем датаграмму.
        final DatagramPacket packet = pack(message);
        // 4. Устанавливаем адрес для пакета.
        packet.setSocketAddress(address);
        // 5. Создаём сокет
        DatagramSocket socket = createSocket();
        // 6. Отправляем сообщение
        socket.send(packet);
        // 7. Освобождаем ресурсы
        socket.close();
    }

    /**
     * Возвращает сообщение.
     *
     * @return текстовое сообщение.
     */
    private static String prepareMessage() {
        /*
         * TODO Реализовать метод prepareMessage класса UdpSender
         */
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();

        return message;

        //throw new UnsupportedOperationException("Not implemented yet!");
    }

    /**
     * Возвращает адрес конечной точки взаимодействия.
     *
     * @return адрес конечной точки.
     */
    private static SocketAddress prepareAddress() throws UnknownHostException {
        /*
         * TODO Реализовать метод prepareAddress класса UdpSender
         */
        SocketAddress socketAddress = new InetSocketAddress(InetAddress.getLocalHost(), 8080);

        return socketAddress;
       // throw new UnsupportedOperationException("Not implemented yet!");
    }

    /**
     * Возвращает сокет, описывающий взаимодействие по протоколу UDP.
     *
     * @return сокет.
     * @throws IOException
     */
    private static DatagramSocket createSocket() throws IOException {
        /*
         * TODO Реализовать метод createSocket класса UdpSender
         */
        return new DatagramSocket();

        // throw new UnsupportedOperationException("Not implemented yet!");
    }

    /**
     * Упаковывает текстовое сообщение в объект типа {@link DatagramPacket}.
     *
     * @param message строковое сообщение.
     *
     * @return экземпляр типа {@link DatagramPacket}.
     */
    private static DatagramPacket pack(String message) throws UnsupportedEncodingException {
        /*
         * TODO Реализовать метод pack класса UdpSender
         */

        byte[] datagramm = message.getBytes("UTF-8");
        DatagramPacket packet = new DatagramPacket(datagramm, datagramm.length);

        return packet;
        //throw new UnsupportedOperationException("Not implemented yet!");
    }

}
