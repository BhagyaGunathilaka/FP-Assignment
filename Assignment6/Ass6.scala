case class Point(a:Int,b:Int){
  def x:Int=a
  def y:Int=b
  
  def +(that:Point)=Point(this.x+that.x,this.y+that.y) 
  
  def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)
  
  def -(that:Point)=Point(this.x-that.x,this.y-that.y) 

  def DisOfpoints(that:Point):Double={

   val distance=math.sqrt((this.x)*(this.x)+(this.y)*(this.y))
   return distance
  }

  def InvertOfpoint(that:Point)=Point(this.y,this.x)
}

object Ass6{
   def main(args:Array[String]){

   val u=Point(12,5)
   val v=Point(3,18)
   
   println("01:Addition of two points="+(u+v))
   
   println("02:When moved by the distance ="+u.move(3,7))
   
   val w=u-v

   println("03:Distance between the points="+w.DisOfpoints(w))
   
   println("04:When inverted the coordinated ="+u.InvertOfpoint(u))
  }
}