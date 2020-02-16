import socket

HOST = socket.gethostbyname(socket.gethostname())
PORT = 1010
ADDR = (HOST, PORT)

connections = []

# create socket object
server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)


def bind(host=HOST, port=PORT):
    try:
        server.bind((host, port))
    except socket.error as msg:
        print("Binding error: " + str(msg))
        bind(host, port)


print(__name__)


def accept_connection():
    conn, addr = server.accept()
    print("Connection established IP: "+str(addr[0]))
    accept_connection()


def main():
    bind()
    server.listen(5)
    accept_connection()


if __name__ == '__main__':
    main()
