package org.phase.one.io.socket;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Constant {
	public static void main(String[] args) throws IOException {
		start();
	}

	private static void start()  {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(9999);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		while(true) {
			try {
				Socket accept = serverSocket.accept();
				new Thread(()-> {
					read(accept);
				} ) .start();
				/*
				 * new Thread(()-> { write(accept); } ) .start();
				 */
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	
	private static void write(Socket accept) {

		try(BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream(),CHARSET),1024)) {
			for (int i = 0; i < 10; i++) {
				writer.write((""+i).toCharArray());
			}
			accept.shutdownOutput();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

	private static void read(Socket accept) {
//		BufferedReader bufferedReader = null;
		InputStream inputStream = null;
//		BufferedInputStream bufferedInputStream = null;
		try {
//			bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream(), CHARSET), 1);
			inputStream = accept.getInputStream();
//			bufferedInputStream = new BufferedInputStream(inputStream);
			
			int len ;
			byte[] context = new byte[1024];
			while((len = inputStream.read(context))!=-1) {//阻塞
				System.out.println("client:"+new String(context, 0, len));
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
//				bufferedInputStream.close();
				inputStream.close();
				accept.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

//				try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream(), CHARSET), 1024)) {
//			int len ;
//			char[] context = new char[1024];
//			while((len = bufferedReader.read(context))!=-1) {//阻塞
//				System.out.println("client:"+new String(context, 0, len));
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
	
}
