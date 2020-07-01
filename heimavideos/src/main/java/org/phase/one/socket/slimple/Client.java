package org.phase.one.socket.slimple;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		startClient();
	}

	private static void startClient() throws UnknownHostException, IOException {
		Socket socket = new Socket("127.0.0.1", 9890);
		//写入
		OutputStream outputStream = socket.getOutputStream();
		byte[] content = new String("服务器，你好吗？").getBytes("utf-8");
		outputStream.write(content);
		outputStream.write(content);
		socket.shutdownOutput();
		//读取
		InputStream inputStream = socket.getInputStream();
		int read = inputStream.read(content);
		System.out.println(new String(content,0,read,"utf-8"));
		inputStream.close();
		outputStream.close();
		socket.close();
		
	}

}
