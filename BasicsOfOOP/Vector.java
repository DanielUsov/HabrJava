public class Vector{
  private double x;
  private double y;
  private double z;

  public Vector(double x, double y, double z){
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public double getLenghtVector(){
    return Math.sqrt(x * x + y * y + z * z);
  }

  public double getScalarProduct(Vector vector){
    return (x * vector.x + y * vector.y + z * vector.z);
  }

  public Vector getVectorProduct(Vector vector){
    return new Vector(
    y * vector.z - z * vector.y,
    z * vector.x - x * vector.z,
    x * vector.y - y * vector.x
    );
  }

  public double getCos(Vector vector){
    return getScalarProduct(vector) / (getLenghtVector() * vector.getLenghtVector());
  }

  public Vector getSumVectors(Vector vector){
    return new Vector(
      x + vector.x,
      y + vector.y,
      z + vector.z);
  }

  public Vector getDifferenceVectors(Vector vector){
    return new Vector(
      x - vector.x,
      y - vector.y,
      z - vector.z);
  }

  public static Vector[] gen(int N){
    Vector[] massVectors = new Vector[N];
    for (int i = 0;i < N;i++ ) {
      massVectors[i] = new Vector(Math.random() * 10,Math.random() * 10,Math.random() * 10);
    }
    return massVectors;
  }

  @Override
  public String toString(){
    return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
  }

  public static void main(String[] args) {
    int k = 20;
    Vector[] vectors = Vector.gen(k);
    for (int i= 0;i < k ;i++ ) {
      System.out.println(vectors[i] + "Vector number" + (i + 1));
    }
    System.out.println("---------");
    System.out.println(vectors[0].getLenghtVector());
    System.out.println(vectors[0].getScalarProduct(vectors[1]));
    System.out.println(vectors[0].getVectorProduct(vectors[1]));
    System.out.println(vectors[0].getCos(vectors[1]));
    System.out.println(vectors[0].getSumVectors(vectors[1]));
    System.out.println(vectors[0].getDifferenceVectors(vectors[1]));
  }


}
