package org.phase.one.socket.web;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static void main(String[] args) throws IOException {
		Start();
//		File file = new File("zhao\\test.txt");
//		System.out.println(file.getPath());
//		System.out.println(file.getAbsolutePath());
//		System.out.println(file.getName());
	}

	@SuppressWarnings("resource")
	private static void Start() throws IOException {
		ServerSocket serverSocket = new ServerSocket(9897);
		
		while (true) {
			Socket accept = serverSocket.accept();
			new Thread(()->{
				excute(accept);
				}).start();
		}
	}

	private static void excute(Socket accept) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));
//			String line ;
//			while ((line=br.readLine())!=null) {
//				System.out.println(line);
//			}
			String line = br.readLine();
			String path = line.split(" ")[1];
			
			File file = new File(path.substring(1));
			System.out.println(file.getAbsoluteFile());
			FileInputStream fis = new FileInputStream(path.substring(1));
	        byte[] bytes= new byte[1024];
	        int len = 0 ;
	        // 字节输出流,将文件写会客户端
	        OutputStream out = accept.getOutputStream();
	        // 写入HTTP协议响应头,固定写法
	        out.write("HTTP/1.1 200 OK\r\n".getBytes());
	        out.write("Content-Type:text/html\r\n".getBytes());
	        // 必须要写入空行,否则浏览器不解析
	        out.write("\r\n".getBytes());
	        while((len = fis.read(bytes))!=-1){
	            out.write(bytes,0,len);
	        }
			fis.close();
			out.close();
			br.close();
			accept.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
