import socket

serverip = '192.168.1.69'
port = 1010

client = socket.socket()
try:
    client.connect((serverip, port))
    print("Trying to connect to: "+str(serverip))

    while True:
        msg = client.recv(1024)
        print("Message received: "+bytes(msg).decode())
        client.send(b"client")
except socket.error as msg:
    print("whoeps something happended: "+str(msg))
