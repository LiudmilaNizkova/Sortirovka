package by.epam.execution;

public class Execution {
	private static final String VOWELS = "aeiouyAEIOUY";
	
	public Execution () {
		
	}

	public static void printArray (String[] mas){
		
		for (int i = 0; i < mas.length; i++) {
			System.out.println((i+1)+" string of massive - "+mas[i]);
		}
		
	}
	
	public static int[] countVowels (String[] mas){
		int countV =0;
		int[] count = new int[mas.length];
		char[] vowels = VOWELS.toCharArray();
		
		for (int i = 0; i < mas.length; i++){
			char[] ch = mas[i].toCharArray();
			for (int n = 0; n < ch.length; n++){
				for (int j = 0; j < vowels.length; j++){
						if (ch[n] == vowels[j])
							countV++;
						}
			} 
			System.out.println("Kol-vo vowels in "+(i+1)+"-m element = "+countV);
			count[i] = countV;
			countV = 0;
		}
		return count;
	}
	
	
	public static void sortirovka (String[] mas){
		int[] count = countVowels(mas);
		
		for (int i = 0; i < count.length - 1; i++){
			for (int j = i+1; j < count.length; j++){
				if (count[i] < count[j]){
					int tmp = count[i];
					String strTmp = mas [i];
					count[i] = count[j];
					mas[i] = mas[j];
					count[j] = tmp;
					mas[j] = strTmp;
				}
			}
		}
	}
	
	
}
