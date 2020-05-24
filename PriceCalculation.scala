object PriceCalculation { 
  
//Price=P, Discount=D, New Price=NP, Shipping Cost= SC
    
   def main(args: Array[String]): Unit= { 
     def P(a: Int): Double ={a*24.95}

  def D(b: Double): Double ={ b*40/100}

  def NP(x: Double, y: Double): Double ={x-y}

  def SC(n: Int): Double ={
    if(n<=50)
      3
    else
      3+((n-50)*0.75)
  }
  val result = NP(P(60),D(P(60)))+SC(60)
  println("Total wholesale cost : " + result)
 
       
   }

} 