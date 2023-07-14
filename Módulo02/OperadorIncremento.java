
public class OperadorIncremento {
  public static void main (String[] args) {
	
	int totalDownloads = 10;
	totalDownloads = totalDownloads + 1;
	totalDownloads += 1;

	System.out.println("Total downloads:" + totalDownloads);
	
	//pós fixada
        totalDownloads ++;
	System.out.println("Total downloads:" + totalDownloads);

	//pré fixada
	int novoTotalDownloads = ++totalDownloads;
	System.out.println("Total downloads:" + novoTotalDownloads);
	
	}

}