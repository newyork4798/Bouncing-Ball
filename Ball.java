class Ball {
  public int x;
  public int y;
  
  public int targetX = 250;
  public int targetY = 250;
  
  Ball(int x, int y) {
    this.x = x;
    this.y = y;
  }
  
  void step (){
    if(x <targetX){
      x++;
    } else {
      x--;
    }
        if(y <targetY){
      y++;
    } else {
      y--;
    }
  }//End of Step()
  
  int getX () {
    return x;
  }
    int getY () {
    return y;
  }
    int getTargetX () {
    return targetX;
  }
    int getTargetY () {
    return targetY;
  }
}