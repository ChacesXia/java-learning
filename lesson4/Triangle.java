class Triangle extends Graph{
  private float edge1;
  private float edge2;
  private float edge3;
  public Triangle (float f1, float f2, float f3 ) {
    this.edge1 = f1;
    this.edge2 = f2;
    this.edge3 = f3;
  }
  public float area () {
    float s = 0f;
    float p = (this.edge1+this.edge2+this.edge3)/2;
    s = (float)Math.sqrt(p*(p-this.edge1)*(p-this.edge2)*(p-this.edge3));
    return s;
  }
  public float perimeter () {
    return this.edge1+this.edge2+this.edge3;
  }
}