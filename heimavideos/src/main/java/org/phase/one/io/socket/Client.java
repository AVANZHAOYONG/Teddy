package org.phase.one.io.socket;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client implements Constant  {
	public static void main(String[] args)  {
		try {
			Socket socket = new Socket("127.0.0.1", 9999);
			/*
			 * new Thread(()-> { read(socket); } ) .start();
			 */
			new Thread(()-> {
				write(socket);
			} ) .start();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void write(Socket socket) {
//		BufferedWriter writer = null;
		OutputStream outputStream = null;
//		BufferedOutputStream bufferedOutputStream = null;
		try {
//			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),CHARSET),1);
			outputStream = socket.getOutputStream();
//			bufferedOutputStream = new BufferedOutputStream(outputStream);
			for (int i = 0; i < 10; i++) {
				outputStream.write(("client"+i).getBytes());
			}
			socket.shutdownOutput();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
//				bufferedOutputStream.close();
				outputStream.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

//		
//		try(BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),CHARSET),1024)) {
//			for (int i = 0; i < 10; i++) {
//				writer.write(("client"+i).toCharArray());
//			}
//			socket.shutdownOutput();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	
	}

	private static void read(Socket socket) {
		

		try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), CHARSET), 1024)) {
			int len ;
			char[] context = new char[1024];
			while((len = bufferedReader.read(context))!=-1) {//阻塞
				System.out.println("client:"+new String(context, 0, len));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
