# TCPPing
A TCP ping application. Used to send data from one PC to another using sockets and the client-server architecture.

* contains Junit 4 tests for methods
* built with Maven


Instructions on running TCPPing.java from the console:<br/>
<b>1.</b> Clone to local directory<br/>
<b>2.</b> Navigate to TCPPing/src/ in cmd.exe <br/>
<b>3.</b> Execute these commands on two computers: <br/>
 <b>Pitcher side:</b> java tcpping.TCPPing -p -port port -mps messages per second -size message size hostname <br/>
  <b>Catcher side:</b> java tcpping.TCPPing -c -bind socket bind address -port port

Parameters:
* <b>p</b>, <b>c</b> - mode in which the software executes(pitcher or catcher mode)
* <b>port</b> - socket port used for establishing a connection and sending messages
* <b>mps</b> - number of messages that are going to be sent in a second
* <b>size</b> - the size of one message in bytes (50 - 3000 bytes)
* <b>hostname</b> - hostname of the PC you are sending messages to
* <b>bind</b> - local IP address that binds to a socket port
 

Bugs / issues:
* Failed to compile CatcherTest.java and PitcherTest.java in TCPPing/src/tests/
  * Fix this by adding Junit .jar file to your current CLASSPATH variable
