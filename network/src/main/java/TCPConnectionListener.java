public interface TCPConnectionListener {

    void onConnectionReady(TCPConnection tcpConnection);
    void onDisconnect(TCPConnection tcpConnection);
    void onException(TCPConnection tcpConnection, Exception e);
    void onReceiveString(TCPConnection tcpConnection, String message);
}
