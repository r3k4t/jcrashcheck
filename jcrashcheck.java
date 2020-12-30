import java.io.*;
import java.net.*;
import java.util.Scanner;
class Main

{
  public static void  SendPingRequest(String ipAddress)
           throws UnknownHostException,IOException
  {
   InetAddress var = InetAddress.getByName(ipAddress);
     if(var.isReachable(1000))
       System.out.println("[=======================[Site is available]====================>");
     else
       System.out.println("[=====================[Site is not available]==================>");
           
  }
  public static void main(String[] args)
           throws UnknownHostException,IOException
 {

  System.out.println("[========================[Java Website Crash Check]===================>");
  System.out.println("[=====================[Author : Rahat Khan Tusar(RKT)]===============>");
  System.out.println("[===================[Github : https://github.com/r3k4t]============>");
  String ipAddress;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter ip Address:\n");
  ipAddress=sc.next();
  SendPingRequest(ipAddress);
 }
}
