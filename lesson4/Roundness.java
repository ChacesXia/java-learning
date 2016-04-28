class Roundness extends Graph{
  private float radius;
  public Roundness (float f1) {
    this.radius = f1;
  }
  public float area () {
    return (float)Math.PI * this.radius * this.radius;
  }
  public float perimeter () {
    return 2 * (float)Math.PI * this.radius;
  }
}