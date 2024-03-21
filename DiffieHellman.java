DiffieHellman.java
class DiffieHellman
   {
public Static void main(String args[])
{
int p=23;`
int g=5;
int x=4;
int y=3;
double aliceSends=(Math.pow(g,(x*y))%p;
double bobComputes=(Math.pow(aliceSends,y))%p;
double bobSends=(Math.pow(g,y))%p;
double aliceComputes=(Math.pow(bobSends,x))%p;
double SharedSecret=(Math.pow(g,(x*y)))%p;
System.out.println("simulation of Diffie Hellman  key exchange algorithm \n");
System.out.println("Alice Sends:" + aliceSends);
System.out.println("Bob Sends:" + bobSends);
System.out.println("Shared secret:" + SharedSecret);
if ((aliceComputes== SharedSecret) && (aliceComputes==bobComputes))
  System.out.println("success: Shared Secret key Matches! " + SharedSecret);
else 
System.out.println( "Error : Shared Secret does not match");
}
}