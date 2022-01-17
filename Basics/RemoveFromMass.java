import java.util.Arrays;


class RemoveFromMass{
  public static void main(String[] args) {
    int[] mass = new int[20];
    for (int i = 0 ;i < mass.length ;i++ ) {
      mass[i] = (int)(Math.random()*10);
    }
    int number = 3;
    System.out.print(Arrays.toString(rfm(mass,number)));
    System.out.println();
  }
  public static int[] rfm(int[] mass, int number){
    int offset = 0;
    for (int i = 0;i< mass.length ;i++ ) {
      if (mass[i] == number) {
        offset++;
      }
      else {
        mass[i - offset] = mass[i];
      }
    }
    return Arrays.copyOf(mass,mass.length - offset);

  }
}
