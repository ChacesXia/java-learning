class Auto{
  public String color;
  public float weight;
  public float speed;
  public Auto() {
    this.color ="";
    this.weight = 0f;
    this.speed = 0f;
  }
  public Auto(String color, float weight, float speed) {
    this.color = color;
    this.weight = weight;
    this.speed = speed;
  }
  public float speedUp (float speedUp) {
    return this.speed + speedUp;
  }
  public float speedDown (float speedDown){
    return this.speed + speedDown;
  }
  public float park (){
    this.speed = 0;
    return this.speed;
  }
}