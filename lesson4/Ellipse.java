//椭圆类
class Ellipse extends Graph{
  private float longSemiaxis;
  private float shortSemiaxis;
  public Ellipse (float f1, float f2) {
    this.longSemiaxis = f1;
    this.shortSemiaxis = f2;
  }
  public float area () {
    return (float)Math.PI * longSemiaxis * shortSemiaxis;
  }
  public float perimeter () {
    // 椭圆求周长的方法
    return 2 * (float)Math.PI * this.shortSemiaxis + 4 * (this.longSemiaxis - this.shortSemiaxis);
  }
}