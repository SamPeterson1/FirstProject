package firstPackage;

public class Recognizer {
	public int[] recognize(String str) {
		String[] split = str.split(" ");
		int[] proccesed = new int[split.length];
		for(int i = 0; i < split.length; i ++) {
			if(split[i].equals("+") || split[i].equals("-") || split[i].equals("*") || split[i].equals("/")) {
				if(split[i].equals("+")) {
					proccesed[i] = 0;
				} else if(split[i].equals("-")) {
					proccesed[i] = 1;
				} else if(split[i].equals("*")) {
					proccesed[i] = 2;
				} else if(split[i].equals("/")) {
					proccesed[i] = 3;
				}
			} else {
				String[] i1 = split[i].split("");
				int[] i2 = new int[i1.length];
				for(int j = 0; j < i1.length; j ++) {
					if(i1[j].equals("0")) {
						i2[j] = 0;
					} else if(i1[j].equals("1")) {
						i2[j] = 1;
					} else if(i1[j].equals("2")) {
						i2[j] = 2;
					} else if(i1[j].equals("3")) {
						i2[j] = 3;
					} else if(i1[j].equals("4")) {
						i2[j] = 4;
					} else if(i1[j].equals("5")) {
						i2[j] = 5;
					} else if(i1[j].equals("6")) {
						i2[i] = 6;
					} else if(i1[j].equals("7")) {
						i2[j] = 7;
					} else if(i1[j].equals("8")) {
						i2[j] = 8;
					} else if(i1[j].equals("9")) {
						i2[j] = 9;
					}
				}
				for(int i3 = 0; i3 < i2.length; i3 ++) {
					int exp = 1;
					for(int k = 0; k < i2.length - i3 -1; k ++) {
						exp = 10 * exp;
					}
					proccesed[i] += exp * i2[i3];
				}			
			}
		}
		return proccesed;
	}
}
