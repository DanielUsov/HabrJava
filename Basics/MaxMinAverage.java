class MaxMinAverage{
  public static void main(String[] args) {
    int[] mass = new int[100];
    for (int i = 0;i < mass.length;i++ ) {
      mass[i] = (int)(Math.random()* 10) + 1;
    }
    int max = 0;
    int min = mass[0];
    int avg = 0;
    int sum = 0;
    for (int i = 0;i < mass.length ;i++ ) {
      if (mass[i] > max) {
        max = mass[i];
      }
      else if (mass[i] < min) {
        min = mass[i];
      }
      sum += mass[i];
    }
    avg = sum / mass.length;

    System.out.println("max = " + max);
    System.out.println("min = " + min);
    System.out.println("avg = " + avg);

  }
}
