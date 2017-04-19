public class Exception {
public static void main(String[] args) {
BufferedReader br = null;
try {
br = new BufferedReader(new FileReader("C:\\test.txt"));
System.out.println(br.readLine());
} 
catch (IOException e) {
e.printStackTrace();
} 
finally {
try {
if (br != null){
System.out.println("Closing the file");
br.close();
}
} catch (IOException ex)
{
  ex.printStackTrace();
 }
   }
    }
}