package com.zy.util.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPService {

	public static final int PORT = 9999;
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("==============tcpService start=============");
		try {
			ServerSocket service = new ServerSocket(PORT);
			System.out.println("Listening Port is "+service.getLocalPort()+"....");
			while(true){
				Socket client = service.accept();
				System.out.println("having a client connect,the ip is "+client.getInetAddress()+"....");
				System.out.println("having a client connect the port is "+client.getPort());
				new Thread(new TCPService().new DateControlThread(client)).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	class DateControlThread implements Runnable{

		private Socket client ;
		
		
		public DateControlThread(Socket client) {
			this.client = client;
		}

		@Override
		public void run() {
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
				while(true){
					String clientLine = br.readLine();
					if(clientLine != null){
						System.out.println("["+client.getInetAddress()+"]:"+client.getPort()+">>>"+clientLine);
					}
					if("shutdown".equals(clientLine)){
						break;
					}
				}
				br.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
}
