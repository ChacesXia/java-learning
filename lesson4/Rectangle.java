class Rectangle extends Graph{
  private float length;
  private float width;
  public Rectangle (float f1, float f2) {
    this.length = f1;
    this.width = f2;
  }
  public float area () {
    return this.length * this.width;
  }
  public float perimeter () {
    return 2* (this.length+this.width);
  }
}