class SortMass{
  public static void main(String[] args) {
    int[] mass = new int[10];
    int massGen = 0;
    while (massGen < mass.length){
      mass[massGen] = (int)((Math.random() * 10) + 1);
      massGen++;
    }
    int i = 0;
		int l = mass.length-1;
		while (i < l){
      if (mass[i] > mass[i + 1]){
  			int s = mass[i];
  			mass[i] = mass[i+1];
  			mass[i + 1] = s;
  			i = 0;
  		}
  		else{
  	    i++;
  		}
		}
		for (i = 0; i < mass.length; i++) {
  		System.out.print(mass[i]);
		}
    System.out.println();
  }
}
