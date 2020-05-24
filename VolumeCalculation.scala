object VolumeCalculation{ 
      
   def main(args: Array[String]): Unit= { 
      def V(r: Int): Double ={ (4/3)*(22/7)*r*r*r }

	val result = V(5)
	println("Volume of the sphere =" +result)
 
       
   }

} 