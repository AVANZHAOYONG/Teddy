package org.phase.one.socket.slimple;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		Start();
	}

	private static void Start() throws IOException {
		ServerSocket serverSocket = new ServerSocket(9890);
		Socket accept = serverSocket.accept();
		//读取
		InputStream inputStream = accept.getInputStream();
		byte[] content = new byte[1024];
		int len;
		while ((len=inputStream.read(content))!=-1) {
			System.out.println(new String(content, 0, len, "utf-8"));
		}
		//写入
		OutputStream outputStream = accept.getOutputStream();
		content = new String("我很好，谢谢").getBytes("utf-8");
		outputStream.write(content);
		
		outputStream.close();
		inputStream.close();
		serverSocket.close();
		
	}

}
