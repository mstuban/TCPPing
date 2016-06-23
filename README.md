# TCPPing
A TCP ping application. Used to send data from one PC to another using sockets and the client-server architecture.

* contains Junit 4 tests for methods
* built with Maven


Instructions on running TCPPing.java from the console:
1. Clone to local directory
2. Navigate to TCPPing/src/ in cmd.exe
3. Execute these commands on two computers:
  Pitcher side: java tcpping.TCPPing -p -port <port> -mps <messages per second> -size <message size> <hostname> 
  Catcher side: java tcpping.TCPPing -c -bind <socket bind address> -port <port>

Parameters:
* p, c - mode in which the software executes(pitcher or catcher mode)
* port - socket port used for establishing a connection and sending messages
* mps - number of messages that are going to be sent in a second
* size - the size of one message in bytes (50 - 3000 bytes)
* hostname - hostname of the PC you are sending messages to
* bind - local IP address that binds to a socket port
 

Bugs / issues:
* Failed to compile CatcherTest.java and PitcherTest.java in TCPPing/src/tests/
  * Fix this by adding Junit .jar file to your current CLASSPATH variable
