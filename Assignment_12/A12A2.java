/*
 Write a program which sends the name of a text file from the client to server and
displays the contents of the file on the client machine. If the file is not found, display an
error message.

*/
import java.util.*;

import java.net.*;

import java.io.*;




public class tcpserver {

            public static void main(String[] args)

            {

                        try

                        {

                                    ServerSocket s=new ServerSocket(998);

                                    System.out.println("Server Ready\nwaiting for connection .....");

                                    Socket s1=s.accept();

                                    DataOutputStream dos= new DataOutputStream(s1.getOutputStream());

                                    DataInputStream dis= new DataInputStream(s1.getInputStream());

                                    System.out.println(dis.readUTF());

                                    String path= dis.readUTF();

                                    System.out.println("Request Recieved");

                                    try

                                    {

                                                File myFile= new File(path);

                                                Scanner scn=new Scanner(myFile);

                                                String st=scn.nextLine();

                                                st="The contents of the file is"+st;

                                                while(scn.hasNextLine())

                                                {

                                                            st=st+"\n"+scn.nextLine();

                                                }

                                                dos.writeUTF(st);

                                                dos.close();

                                                s1.close();

                                                s.close();

                                                scn.close();

                                    }

                                    catch(FileNotFoundException e)

                                    {

                                                System.out.println("ERROR! FILE NOT FOUND");

                                                dos.writeUTF("ERROR! FILE NOT FOUND");

                                    }

                        }

                        catch(IOException e)

                        {

                                    System.out.println("IO:"+e.getMessage());

                        }

                        finally

                        {

                                    System.out.println("Connection Terminated");

                                    }

            }

}

import java.util.*;

import java.net.*;

import java.io.*;




public class tcpclient

{

            public static void main(String args[])

            {

                        try

                        {

                                    Scanner scn=new Scanner(System.in);

                                    Socket s=new Socket("192.168.0.166",998);

                                    DataOutputStream dos = new DataOutputStream(s.getOutputStream());

                                    DataInputStream dis=new DataInputStream(s.getInputStream());

                                    dos.writeUTF("connected to 192.168.0.166 \n");

                                    System.out.println("\n Enter the full path of file to be displayed\n");

                                    String path=scn.nextLine();

                                    dos.writeUTF(path);

                                    System.out.println(new String(dis.readUTF()));

                                    dis.close();

                                    dos.close();

                                    s.close();

                                    scn.close();

                        }

                        catch(IOException e)

                        {

                                    System.out.println("IO :"+e.getMessage());

                        }

            }

}
